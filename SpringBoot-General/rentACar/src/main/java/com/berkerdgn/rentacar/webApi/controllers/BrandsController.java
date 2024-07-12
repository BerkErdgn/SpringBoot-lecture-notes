package com.berkerdgn.rentacar.webApi.controllers;

import com.berkerdgn.rentacar.business.abstracts.BrandService;
import com.berkerdgn.rentacar.business.requests.CreateBrandRequest;
import com.berkerdgn.rentacar.business.requests.UpdateBrandRequest;
import com.berkerdgn.rentacar.business.responses.GetAllBrandsResponse;
import com.berkerdgn.rentacar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //Annotation (Bilgilendirme ifadesi)
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

    private BrandService brandService;


    @GetMapping()
    public List<GetAllBrandsResponse> getAll(){
        //Ioc
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getByAll(@PathVariable int id){
        return brandService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        this.brandService.delete(id);
    }


}
