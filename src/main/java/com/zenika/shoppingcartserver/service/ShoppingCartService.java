package com.zenika.shoppingcartserver.service;

import com.zenika.shoppingcartserver.model.Item;
import com.zenika.shoppingcartserver.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
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
        Item item = new Item(name, quantity);
        cart.getItemList().add(item);
    }

    /**
     * Returns the total of all items in the cart
     * @param cart
     * @return
     */
    public int getTotalItemCount(ShoppingCart cart){
        return cart.getItemList().stream().mapToInt(Item::getQuantity).sum();
    }

    /**
     * Returns the total number of items in the cart under the name provided
     * @param cart
     * @param name
     * @return
     */
    public int getItemCount(ShoppingCart cart, String name){
        return cart.getItemList().stream().filter(item -> name.equals(item.getName())).mapToInt(Item::getQuantity).sum();
    }

    /**
     * Returns the total cost of all the items in the cart
     * @param cart
     * @return
     */
    public  long getTotalItemCost(ShoppingCart cart){
        return cart.getItemList().stream().mapToLong(item -> item.getQuantity() * productInfoProvider.getUnitPrice(item.getName())).sum();
    }

    /**
     * Returns the total cost of items unde the given name
     * @param cart
     * @param name
     * @return
     */
    public long getItemCost(ShoppingCart cart, String name){
        return cart.getItemList().stream().filter(item -> name.equals(item.getName())).mapToLong(item -> item.getQuantity() * productInfoProvider.getUnitPrice(item.getName())).sum();
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
        Map<String, List<Item>> collect = cart.getItemList().stream().collect(Collectors.groupingBy(Item::getName));
        collect.forEach((key, value) -> {
            int prodTotal = value.stream().mapToInt(Item::getQuantity).sum();
            System.out.println(key + ": " + prodTotal);
        });
    }
}
