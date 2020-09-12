package com.company.shopwithcuba.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "SHOPWITHCUBA_ORDER_ITEM")
@Entity(name = "shopwithcuba_OrderItem")
public class OrderItem extends BaseIdentityIdEntity implements HasUuid {
    private static final long serialVersionUID = 8195274392584889123L;

    @Column(name = "UUID")
    private UUID uuid;

    @Composition
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @NotNull
    @Column(name = "COUNTER", nullable = false)
    private Integer counter;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NUMBER_ORDER_ID")
    private Order numberOrder;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Order getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(Order numberOrder) {
        this.numberOrder = numberOrder;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}