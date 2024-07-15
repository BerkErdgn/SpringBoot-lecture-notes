package com.berkerdgn.rentacar.business.concretes;


import com.berkerdgn.rentacar.business.abstracts.ModelService;
import com.berkerdgn.rentacar.business.requests.CreateModelRequest;
import com.berkerdgn.rentacar.business.responses.GetAllModelsResponse;
import com.berkerdgn.rentacar.core.utilities.mappers.ModelMapperManager;
import com.berkerdgn.rentacar.dataAccess.abstracts.ModelRepository;
import com.berkerdgn.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);

        this.modelRepository.save(model);
    }

    private ModelRepository modelRepository;
    private ModelMapperManager modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();


        List<GetAllModelsResponse> modelsResponse = models
                .stream()
                .map(model -> this.modelMapperService.forResponse().map(model,GetAllModelsResponse.class))
                .toList();

        //iş kuralları
        return modelsResponse;
    }
}
