package com.berkerdgn.rentacar.business.abstracts;

import com.berkerdgn.rentacar.business.requests.CreateModelRequest;
import com.berkerdgn.rentacar.business.responses.GetAllModelsResponse;
import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
