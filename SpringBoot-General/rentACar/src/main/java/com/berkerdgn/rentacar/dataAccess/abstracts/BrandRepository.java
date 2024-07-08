package com.berkerdgn.rentacar.dataAccess.abstracts;

import com.berkerdgn.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BrandRepository {
    List<Brand> getAll();


}
