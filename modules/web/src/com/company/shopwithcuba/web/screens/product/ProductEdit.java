package com.company.shopwithcuba.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.Product;

@UiController("shopwithcuba_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}