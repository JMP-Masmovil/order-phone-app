package es.masmovil.phone.app.order.persistence;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "orders")
@Getter
@Setter
public class Order {

	@Id
	private String identifier;

	private String customerIdentifier;
	
	private List<Phone> listPhone;
	
	private BigDecimal totalPrice;
	
	
}
