package es.masmovil.phone.app.order.persistence;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Phone {

	private String identifier;
	
	private BigDecimal price;
}
