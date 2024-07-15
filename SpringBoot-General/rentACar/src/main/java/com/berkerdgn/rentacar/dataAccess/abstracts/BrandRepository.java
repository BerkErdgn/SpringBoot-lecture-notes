package com.berkerdgn.rentacar.dataAccess.abstracts;

import com.berkerdgn.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

        boolean existsByName(String name); //exist gibi kelimelersi görünce jpa kendisi otomatik istenilen şeyi yapıyor. Mesela şimdi kendisi gidip isim var mı bakıcak.

}
