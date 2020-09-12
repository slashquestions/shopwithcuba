package com.company.shopwithcuba.entity;

import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.UUID;

@Table(name = "SHOPWITHCUBA_CLIENT")
@Entity(name = "shopwithcuba_Client")
public class Client extends BaseIdentityIdEntity implements HasUuid {
    private static final long serialVersionUID = 5111610652692823135L;

    @Column(name = "UUID")
    private UUID uuid;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    @NotEmpty
    private String fullName;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    @NotEmpty
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    @NotEmpty
    private String email;

    @Column(name = "DISCOUNT")
    @PositiveOrZero
    @NotNull
    private Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

}