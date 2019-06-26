package com.zenika.shoppingcartserver.service;

import org.springframework.stereotype.Service;

@Service
public class ProductInfoProvider {

    public long getUnitPrice(String productName){
        return 10;
    }

}
