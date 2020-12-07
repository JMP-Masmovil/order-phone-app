package es.masmovil.phone.app.order.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PhoneDTO {

	private String identifier;
	
	private BigDecimal price;
}
