package com.atic.ecommerce.backend.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private LocalDateTime dateCreated;
    private List<OrderProduct> orderProducts;
    private OrderState orderState;
    private Integer userId;

    public Order() {
        orderProducts = new ArrayList<>();
    }

    public BigDecimal getTotalOrderPrice(){
        return this.orderProducts.stream().map( orderProduct -> orderProduct.getTotalItem() ).reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
