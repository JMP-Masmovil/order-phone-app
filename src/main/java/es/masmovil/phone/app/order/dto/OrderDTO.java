package es.masmovil.phone.app.order.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class OrderDTO {

	private String identifier;

	private String customerIdentifier;
	
	private List<PhoneDTO> listPhone;
	
	private BigDecimal totalPrice;
}
