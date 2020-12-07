package es.masmovil.phone.app.order.controller.transformer;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import es.masmovil.lib.order.OrderRSDTO;
import es.masmovil.phone.app.order.dto.OrderDTO;
import lombok.NonNull;

@Service
public class OrderControllerTransformerImpl implements OrderControllerTransformer {


	@Override
	public OrderRSDTO toOrderRSDto(@NonNull OrderDTO orderDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(orderDTO, OrderRSDTO.class);
	}

	@Override
	public OrderDTO toOrderDTO(@NonNull OrderRSDTO orderRSDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(orderRSDTO, OrderDTO.class);
	}

}
