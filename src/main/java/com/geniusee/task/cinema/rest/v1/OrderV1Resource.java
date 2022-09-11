package com.geniusee.task.cinema.rest.v1;

import com.geniusee.task.cinema.entity.Order;
import com.geniusee.task.cinema.service.OrderService;
import com.geniusee.task.cinema.util.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("orders")
public class OrderV1Resource {

    private OrderService orderService;
    private Validator validator;

    @Autowired
    public OrderV1Resource(OrderService orderService, Validator validator){
        this.orderService = orderService;
        this.validator = validator;
    }

    @RequestMapping(value="{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Order> getOrder(@PathVariable UUID id) {
        if(validator.isIdInvalid(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Order order = orderService.getOrder(id);
        if(order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> getOrder() {
        List<Order> orders = orderService.getAllOrders();
        if(orders == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
