package com.berkerdgn.rentacar.webApi.controllers;

import com.berkerdgn.rentacar.business.abstracts.BrandService;
import com.berkerdgn.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //Annotation (Bilgilendirme ifadesi)
@RequestMapping("/api/brands")
public class BrandsController {


    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }


    @GetMapping("/getAll")
    public List<Brand> getAll(){
        //Ioc
        return brandService.getAll();
    }


}
