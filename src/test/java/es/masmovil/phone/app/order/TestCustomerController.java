package es.masmovil.phone.app.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;

import es.masmovil.lib.order.OrderRSDTO;
import es.masmovil.lib.order.PhoneRSDTO;
import es.masmovil.lib.order.client.OrderFeignClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestPropertySource("/test.properties")
class TestCustomerController {

	@Autowired
	private OrderFeignClient orderFeignClient;

	@Test
	void testController() {

		List<PhoneRSDTO> listPhone = new ArrayList<>();
		listPhone.add(new PhoneRSDTO("zxc", "100"));
		listPhone.add(new PhoneRSDTO("abc", "200"));

		OrderRSDTO orderRSDTO = new OrderRSDTO();
		orderRSDTO.setCustomerIdentifier("x1ab");
		orderRSDTO.setListPhone(listPhone);

		ResponseEntity<OrderRSDTO> entityResponse = orderFeignClient.createOrder(orderRSDTO);

		assertEquals(HttpStatus.CREATED, entityResponse.getStatusCode());
		assertEquals("300", entityResponse.getBody().getTotalPrice());
		assertNotNull(entityResponse.getBody().getIdentifier());
	}

}
