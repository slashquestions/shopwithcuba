package com.company.shopwithcuba.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.Order;

@UiController("shopwithcuba_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}