package com.company.shopwithcuba.web.screens.orderitem;

import com.company.shopwithcuba.entity.Order;
import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.OrderItem;

@UiController("shopwithcuba_OrderItem.edit")
@UiDescriptor("order-item-edit.xml")
@EditedEntityContainer("orderItemDc")
@LoadDataBeforeShow
public class OrderItemEdit extends StandardEditor<OrderItem> {

}