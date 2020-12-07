package es.masmovil.phone.app.order.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.masmovil.phone.app.order.dto.OrderDTO;
import es.masmovil.phone.app.order.dto.PhoneDTO;
import es.masmovil.phone.app.order.persistence.Order;
import es.masmovil.phone.app.order.persistence.repository.OrderRepository;
import es.masmovil.phone.app.order.persistence.transformer.PersistenceTransformer;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private PersistenceTransformer persistenceTransformer;

	@Override
	public OrderDTO createNewOrder(OrderDTO orderDTO) {

		orderDTO.setIdentifier(UUID.randomUUID().toString());
		orderDTO.setTotalPrice(calculateTotalPrice(orderDTO.getListPhone()));
		Order order = persistenceTransformer.toOrder(orderDTO);
		orderRepository.save(order);
		return orderDTO;

	}

	private BigDecimal calculateTotalPrice(List<PhoneDTO> listPhone) {

		BigDecimal total = BigDecimal.valueOf(0);

		for (PhoneDTO phoneDTO : listPhone) {
			total = total.add(phoneDTO.getPrice());
		}

		return total;
	}

}
