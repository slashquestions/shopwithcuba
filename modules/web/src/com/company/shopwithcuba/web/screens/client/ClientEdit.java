package com.company.shopwithcuba.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.Client;

@UiController("shopwithcuba_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}