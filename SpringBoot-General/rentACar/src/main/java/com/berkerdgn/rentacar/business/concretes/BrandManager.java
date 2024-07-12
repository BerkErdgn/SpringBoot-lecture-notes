package com.berkerdgn.rentacar.business.concretes;

import com.berkerdgn.rentacar.business.abstracts.BrandService;
import com.berkerdgn.rentacar.business.requests.CreateBrandRequest;
import com.berkerdgn.rentacar.business.requests.UpdateBrandRequest;
import com.berkerdgn.rentacar.business.responses.GetAllBrandsResponse;
import com.berkerdgn.rentacar.business.responses.GetByIdBrandResponse;
import com.berkerdgn.rentacar.core.utilities.mappers.ModelMapperService;
import com.berkerdgn.rentacar.dataAccess.abstracts.BrandRepository;
import com.berkerdgn.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();

//       List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
//        for (Brand brand : brands){
//            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
//            responseItem.setId(brand.getId());
//            responseItem.setName(brand.getName());
//            brandsResponse.add(responseItem);
//        }

        List<GetAllBrandsResponse> brandsResponse = brands
                .stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class))
                .toList();

        //iş kuralları
        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        // Brand brand = new Brand();
        // brand.setName(createBrandRequest.getName());

        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);

        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
        //Buradaki save bizim datada id var diye update gibi görev görürü.
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

}
