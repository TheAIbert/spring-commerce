package com.thealbert.springcommerce.service.cart;

import com.thealbert.springcommerce.model.Cart;
import com.thealbert.springcommerce.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart initializeNewCart(User user);
    Cart getCartByUserId(Long userId);
}
