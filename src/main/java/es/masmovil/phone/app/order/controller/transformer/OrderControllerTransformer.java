package es.masmovil.phone.app.order.controller.transformer;

import es.masmovil.lib.order.OrderRSDTO;
import es.masmovil.phone.app.order.dto.OrderDTO;
import lombok.NonNull;

/**
 * Transformer between service layer and rest layer
 * 
 * @author JMP87
 *
 */
public interface OrderControllerTransformer {

	/**
	 * Transform the OrderDTO to OrderRSDTO
	 * 
	 * @param orderDTO The OrderDTO
	 * @return The OrderRSDTO
	 */
	OrderRSDTO toOrderRSDto(@NonNull OrderDTO orderDTO);

	/**
	 * Transform the OrderRSDTO to OrderDTO
	 * 
	 * @param orderRSDTO The OrderRSDTO
	 * @return The OrderDTO
	 */
	OrderDTO toOrderDTO(@NonNull OrderRSDTO orderRSDTO);

}
