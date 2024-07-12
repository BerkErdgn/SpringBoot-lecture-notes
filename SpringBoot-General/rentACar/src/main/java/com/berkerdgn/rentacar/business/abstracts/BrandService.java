package com.berkerdgn.rentacar.business.abstracts;

import com.berkerdgn.rentacar.business.requests.CreateBrandRequest;
import com.berkerdgn.rentacar.business.requests.UpdateBrandRequest;
import com.berkerdgn.rentacar.business.responses.GetAllBrandsResponse;
import com.berkerdgn.rentacar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}
