package es.masmovil.phone.app.order.persistence.transformer;

import es.masmovil.phone.app.order.dto.OrderDTO;
import es.masmovil.phone.app.order.persistence.Order;
import lombok.NonNull;

/**
 * Transformer between persistence layer and business layer
 * @author JMP87
 *
 */
public interface PersistenceTransformer {

	/**
	 * Transform Order to OrderDTO
	 * @param order The Order
	 * @return The OrderDTO
	 */
	OrderDTO toOrderDto(@NonNull Order order);
	
	/**
	 * Transform OrderDTO to Order
	 * @param orderDTO The OrderDTO
	 * @return The Order
	 */
	Order toOrder(@NonNull OrderDTO customerDTO);

}
