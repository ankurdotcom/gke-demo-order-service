package demo.gke.ecom.orderservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.gke.ecom.orderservice.domain.Order;

@Service
public class OrderService {


    private static List<Order> ordersData = new ArrayList<Order>();


    public void createOrder(Order order) {
        ordersData.add(order);
        System.out.println("Order created :" + order.getId());
    }

    public Order getOrderDetails(long id) {
        System.out.println("Order details");
        Order order = new Order();
        order.setId(id);
        order.setCustName("customer_2");
        return order;
    }  
    
}
