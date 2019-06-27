package com.zenika.shoppingcartserver.service;

import com.zenika.shoppingcartserver.model.Item;
import com.zenika.shoppingcartserver.model.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ShoppingCartServiceTests {

    private ShoppingCartService shoppingCartService = new ShoppingCartService(new ProductInfoProvider());

    @Test
    public void addItemTest(){
        ShoppingCart cart = new ShoppingCart();
        shoppingCartService.addItem(cart, "chocolate", 5);
        shoppingCartService.addItem(cart, "cookies", 2);
        Assert.assertEquals(2, cart.getItemList().size());

    }

    @Test
    public void getTotalItemCountTest(){
        ShoppingCart cart = new ShoppingCart();
        initCart(cart);
        Assert.assertEquals(48, shoppingCartService.getTotalItemCount(cart));
    }

    @Test
    public void getItemCountTest(){
        ShoppingCart cart = new ShoppingCart();
        initCart(cart);
        Assert.assertEquals(7, shoppingCartService.getItemCount(cart, "soda"));
    }

    @Test
    public void getTotalItemCostTest(){
        ShoppingCart cart = new ShoppingCart();
        initCart(cart);
        Assert.assertEquals(480, shoppingCartService.getTotalItemCost(cart));
    }

    @Test
    public void getItemCostTest(){
        ShoppingCart cart = new ShoppingCart();
        initCart(cart);
        Assert.assertEquals(150, shoppingCartService.getItemCost(cart, "cheese"));
    }

    private void initCart(ShoppingCart cart) {
        Item item1 = new Item("cookies", 5);
        Item item2 = new Item("cheese", 10);
        Item item3 = new Item("eggs", 5);
        Item item4 = new Item("soda", 4);
        Item item5 = new Item("battery", 8);
        Item item6 = new Item("limeJuice", 2);
        Item item7 = new Item("cheese", 5);
        Item item8 = new Item("soda", 3);
        Item item9 = new Item("chocolate", 6);
        cart.getItemList().addAll(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9));
    }
}
