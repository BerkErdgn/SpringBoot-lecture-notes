package com.berkerdgn.oopwithnlayeredapp.business;

import com.berkerdgn.oopwithnlayeredapp.dataAccess.HibernateProductDao;
import com.berkerdgn.oopwithnlayeredapp.dataAccess.JdbcProductDao;
import com.berkerdgn.oopwithnlayeredapp.dataAccess.ProductDao;
import com.berkerdgn.oopwithnlayeredapp.entities.Product;

public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice() < 10 ) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        //ProductDao productDao = new HibernateProductDao();

        productDao.add(product);


    }


}
