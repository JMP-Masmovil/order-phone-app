package es.masmovil.phone.app.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.masmovil.lib.order.OrderRSDTO;
import es.masmovil.phone.app.order.controller.transformer.OrderControllerTransformer;
import es.masmovil.phone.app.order.dto.OrderDTO;
import es.masmovil.phone.app.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("${ms.api.basepath}")
public class OrderController {

	@Autowired
	private OrderService customerService;

	@Autowired
	private OrderControllerTransformer customerControllerTransformer;


	@PostMapping("/")
	public ResponseEntity<OrderRSDTO> createOrder(@RequestBody OrderRSDTO orderRSDTO) {

		log.debug("inicio - getCustomer");
		OrderDTO orderDto = customerControllerTransformer.toOrderDTO(orderRSDTO);
		orderDto = customerService.createNewOrder(orderDto);
		OrderRSDTO orderResponseRSDTO = customerControllerTransformer.toOrderRSDto(orderDto);
		log.debug("fin - getCustomer");

		return new ResponseEntity<>(orderResponseRSDTO, HttpStatus.CREATED);
	}


}
