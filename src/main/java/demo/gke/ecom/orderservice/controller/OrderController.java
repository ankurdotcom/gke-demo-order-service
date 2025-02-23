package demo.gke.ecom.orderservice.controller;

import demo.gke.ecom.orderservice.domain.Order;
import demo.gke.ecom.orderservice.service.OrderService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order/v1")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    };

    @PostMapping
    public ResponseEntity<Object> createOrder(@RequestBody Order order)
    {
        orderService.createOrder(order);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> orderDetails(@PathVariable String id)
    {
        Order order = orderService.getOrderDetails(Long.parseLong(id));
        return  ResponseEntity.status(HttpStatus.OK).body(order);
    }
}
