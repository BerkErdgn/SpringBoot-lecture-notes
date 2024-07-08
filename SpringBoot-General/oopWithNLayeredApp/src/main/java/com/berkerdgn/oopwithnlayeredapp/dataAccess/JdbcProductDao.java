package com.berkerdgn.oopwithnlayeredapp.dataAccess;

import com.berkerdgn.oopwithnlayeredapp.entities.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır.. SQL
        System.out.println("JDBC ile veri tabanına eklendi.");
    }


}



