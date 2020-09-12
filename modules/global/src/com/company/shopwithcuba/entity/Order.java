package com.company.shopwithcuba.entity;

import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

@Table(name = "SHOPWITHCUBA_ORDER")
@Entity(name = "shopwithcuba_Order")
public class Order extends BaseIdentityIdEntity implements HasUuid {
    private static final long serialVersionUID = 564064406741846346L;

    @Column(name = "UUID")
    private UUID uuid;

    @NotNull
    @Column(name = "NUMBER_ORDER", nullable = false, unique = true)
    @NotEmpty
    private String numberOrder;

    @NotNull
    @Lookup(type = LookupType.SCREEN, actions = {})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @OneToMany(mappedBy = "numberOrder")
    private Set<OrderItem> elementsOrder;

    @Column(name = "PRICE")
    private Integer price;

    public void setElementsOrder(Set<OrderItem> elementsOrder) {
        this.elementsOrder = elementsOrder;
    }

    public Set<OrderItem> getElementsOrder() {
        return elementsOrder;
    }

    //    public Integer getPrice() {
//        return price;
//    }



    public Integer getPrice() {
//        int price=0;
//        if(elementsOrder==null){
//            return 0;
//        }
//        else {
//            Iterator<OrderItem> iterItems = elementsOrder.iterator();
//
//            while (iterItems.hasNext()) {
//                OrderItem item = iterItems.next();
//                Product product = item.getProduct();
//                int k =  product.getPrice();
////                price += item.getCounter() * item.getProduct().getPrice();
//                price = k;
//            }
//            return price;
//
//        }
        return price;

    }


    public void setPrice(Integer price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}