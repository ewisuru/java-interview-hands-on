package com.zenika.shoppingcartserver.service;

import com.zenika.shoppingcartserver.model.ShoppingCart;
import org.springframework.stereotype.Service;

public class ShoppingCartService {

    private final ProductInfoProvider productInfoProvider;

    public ShoppingCartService(ProductInfoProvider productInfoProvider){
        this.productInfoProvider = productInfoProvider;
    }

    /**
     * Add a new item to the cart.
     * @param cart
     * @param name
     * @param quantity
     */
    public void addItem(ShoppingCart cart, String name, int quantity){
    }

    /**
     * Returns the total of all items in the cart
     * @param cart
     * @return
     */
    public int getTotalItemCount(ShoppingCart cart){
        return 0;
    }

    /**
     * Returns the total number of items in the cart under the name provided
     * @param cart
     * @param name
     * @return
     */
    public int getItemCount(ShoppingCart cart, String name){
        return 0;
    }

    /**
     * Returns the total cost of all the items in the cart
     * @param cart
     * @return
     */
    public  long getTotalItemCost(ShoppingCart cart){
        return 0;
    }

    /**
     * Returns the total cost of items unde the given name
     * @param cart
     * @param name
     * @return
     */
    public long getItemCost(ShoppingCart cart, String name){
        return 0;
    }

    /**
     * BONUS challenge<br>
     * Expected format:<br>
     * product1: 5<br>
     * product2: 10<br>
     * ...
     * @param cart
     */
    public void show(ShoppingCart cart){
    }
}
