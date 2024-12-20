package com.atic.ecommerce.backend.infrastructure.entity;

import com.atic.ecommerce.backend.domain.model.OrderState;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class OrderEntity {
    private Integer id;
    private LocalDateTime dateCreated;
    private OrderState orderState;
    @ManyToOne
    private UserEntity userEntity;
    @OneToMany(mappedBy = "orderEntity", cascade = CascadeType.PERSIST)
    private List<OrderProductEntity> orderProducts;



}
