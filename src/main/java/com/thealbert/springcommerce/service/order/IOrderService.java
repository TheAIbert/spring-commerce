package com.thealbert.springcommerce.service.order;

import com.thealbert.springcommerce.dto.OrderDto;
import com.thealbert.springcommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}
