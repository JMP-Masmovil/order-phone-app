package es.masmovil.phone.app.order.persistence.transformer;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import es.masmovil.phone.app.order.dto.OrderDTO;
import es.masmovil.phone.app.order.persistence.Order;
import lombok.NonNull;

@Service
public class PersistenceTransformerImpl implements PersistenceTransformer {




	@Override
	public OrderDTO toOrderDto(@NonNull Order order) {
		
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(order, OrderDTO.class);

	}

	@Override
	public Order toOrder(@NonNull OrderDTO customerDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(customerDTO, Order.class);
	}

}
