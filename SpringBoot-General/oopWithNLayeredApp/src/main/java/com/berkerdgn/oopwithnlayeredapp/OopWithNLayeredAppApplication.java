package com.berkerdgn.oopwithnlayeredapp;

import com.berkerdgn.oopwithnlayeredapp.business.ProductManager;
import com.berkerdgn.oopwithnlayeredapp.dataAccess.JdbcProductDao;
import com.berkerdgn.oopwithnlayeredapp.entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopWithNLayeredAppApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OopWithNLayeredAppApplication.class, args);

        Product product1 = new Product(1,"Iphone Xr", 10000);

        ProductManager productManager = new ProductManager(new JdbcProductDao());
        productManager.add(product1);



    }

}
