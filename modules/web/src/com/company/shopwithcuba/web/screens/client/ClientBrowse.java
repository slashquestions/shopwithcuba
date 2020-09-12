package com.company.shopwithcuba.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.shopwithcuba.entity.Client;

@UiController("shopwithcuba_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}