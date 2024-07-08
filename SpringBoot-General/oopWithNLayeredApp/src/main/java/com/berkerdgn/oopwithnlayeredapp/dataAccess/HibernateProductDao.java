package com.berkerdgn.oopwithnlayeredapp.dataAccess;

import com.berkerdgn.oopwithnlayeredapp.entities.Product;

public class HibernateProductDao implements ProductDao {

    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır.. SQL
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }

}
