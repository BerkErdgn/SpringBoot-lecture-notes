package com.berkerdgn.rentacar.business.abstracts;

import com.berkerdgn.rentacar.business.requests.CreateBrandRequest;
import com.berkerdgn.rentacar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
