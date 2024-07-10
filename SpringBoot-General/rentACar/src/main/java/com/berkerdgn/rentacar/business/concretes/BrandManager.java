package com.berkerdgn.rentacar.business.concretes;

import com.berkerdgn.rentacar.business.abstracts.BrandService;
import com.berkerdgn.rentacar.business.requests.CreateBrandRequest;
import com.berkerdgn.rentacar.business.responses.GetAllBrandsResponse;
import com.berkerdgn.rentacar.dataAccess.abstracts.BrandRepository;
import com.berkerdgn.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand : brands){
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);
        }
        //iş kuralları
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }

}
