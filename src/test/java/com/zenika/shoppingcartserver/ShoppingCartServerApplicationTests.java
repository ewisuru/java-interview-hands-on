package com.zenika.shoppingcartserver;

import com.zenika.shoppingcartserver.controller.ShoppintCartController;
import com.zenika.shoppingcartserver.service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartServerApplicationTests {

	@Autowired
	ShoppingCartService shoppingCartService;

	@Autowired
	ShoppintCartController shoppintCartController;

	@Test
	public void contextLoads() {
		Assert.notNull(shoppingCartService, "shoppingCartService is null");
		Assert.notNull(shoppintCartController, "shoppingCartController is null");
	}

}
