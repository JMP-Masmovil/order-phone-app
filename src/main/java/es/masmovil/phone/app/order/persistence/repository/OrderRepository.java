package es.masmovil.phone.app.order.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import es.masmovil.phone.app.order.persistence.Order;

public interface OrderRepository extends CrudRepository<Order, String>{

}
