package com.zenika.shoppingcartserver.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }
}
