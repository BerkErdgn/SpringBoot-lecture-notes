package com.berkerdgn.oopgiris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopGirisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OopGirisApplication.class, args);

        Product product1 = new Product();
        //set Value
        product1.setName("Delonghi kahve makinası");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        //Get Value
        //System.out.println(product1.name);


        Product product2 = new Product();

        product2.setName("başka kahve makinası");
        product2.setDiscount(5);
        product2.setUnitPrice(3500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();

        product3.setName("diğer kahve makinası");
        product3.setDiscount(9);
        product3.setUnitPrice(6500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};


        for (Product product : products) {
            System.out.println(product.getName());
        }


        IndividualCustomer individualCustomer1 = new IndividualCustomer();

        individualCustomer1.getPhone();





    }



}
