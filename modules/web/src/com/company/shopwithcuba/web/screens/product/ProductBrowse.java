package com.company.shopwithcuba.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.Product;

@UiController("shopwithcuba_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}