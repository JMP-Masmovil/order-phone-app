package es.masmovil.phone.app.order.service;

import es.masmovil.phone.app.order.dto.OrderDTO;

public interface OrderService {


	/**
	 * Create a new Order
	 * @param orderDTO The OrderDTO
	 * @return The OrderDTO updated
	 */
	OrderDTO createNewOrder(OrderDTO orderDTO);

}
