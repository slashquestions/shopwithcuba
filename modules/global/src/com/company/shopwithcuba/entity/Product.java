package com.company.shopwithcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.UUID;

@Table(name = "SHOPWITHCUBA_PRODUCT")
@Entity(name = "shopwithcuba_Product")
@NamePattern("%s|name")
public class Product extends BaseIdentityIdEntity implements HasUuid {
    private static final long serialVersionUID = -9186608251368900784L;

    @Column(name = "UUID")
    private UUID uuid;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    @PositiveOrZero
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}