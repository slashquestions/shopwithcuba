package com.company.shopwithcuba.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.OrderItem;
import org.springframework.web.bind.annotation.RequestMapping;

@UiController("shopwithcuba_OrderItem.browse")
@UiDescriptor("order-item-browse.xml")
@LookupComponent("orderItemsTable")
@LoadDataBeforeShow
public class OrderItemBrowse extends StandardLookup<OrderItem> {
}