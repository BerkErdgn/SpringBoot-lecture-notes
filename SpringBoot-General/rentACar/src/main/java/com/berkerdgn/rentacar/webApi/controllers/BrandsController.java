package com.berkerdgn.rentacar.webApi.controllers;

import com.berkerdgn.rentacar.business.abstracts.BrandService;
import com.berkerdgn.rentacar.business.requests.CreateBrandRequest;
import com.berkerdgn.rentacar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<GetAllBrandsResponse> getAll(){
        //Ioc
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }


}
