package com.company.shopwithcuba.web.screens.order;

import com.company.shopwithcuba.entity.OrderItem;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.actions.list.AddToSetAction;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.Order;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.table.TableColumn;
import java.util.Set;

@UiController("shopwithcuba_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {

    @Inject
    private UiComponents uiComponents;


    @Install(to = "ordersTable.price", subject = "valueProvider")
    private Object ordersTablePriceValueProvider(Order order) {
        int price = 0;
        int discount = order.getClient().getDiscount();
        if(discount==0){
            for (OrderItem or:order.getElementsOrder()){
                price += or.getProduct().getPrice()* or.getCounter();

            }
            return price;
        }
        else{
            for (OrderItem or:order.getElementsOrder()){
                price += or.getProduct().getPrice()* or.getCounter();

            }
            int sumDiscount = price/100*discount;
            return price-sumDiscount;
        }
    }



//    @Install(to = "ordersTable.ordersElem", subject = "columnGenerator")
//    private Component ordersTableOrdersElemColumnGenerator(Order order) {
//        Table.Column<OrderItem> col = uiComponents.create(TableColumn.CELL_RENDERER_PROPERTY);
//        col.setValueDescription(order.getElementsOrder().toString());
//         return col;
//    }




//    @Inject
//    private GroupTable<Order> ordersTable;
//    @Inject
//    private CollectionContainer<OrderItem> elemsOrderDc;
//
//    public CollectionContainer<OrderItem> getElemsOrderDc() {
//        return elemsOrderDc.getView().;
//    }
//
//    public GroupTable<Order> getOrdersTable() {
//        return ordersTable.addPrintable(elems);
//    }ordersTable.addGeneratedColumn("product", new Table.PrintableColumnGenerator<Order, String>()

}