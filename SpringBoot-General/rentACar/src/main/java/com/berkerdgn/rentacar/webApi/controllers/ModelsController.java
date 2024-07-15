package com.berkerdgn.rentacar.webApi.controllers;

import com.berkerdgn.rentacar.business.abstracts.ModelService;
import com.berkerdgn.rentacar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController //Annotation (Bilgilendirme ifadesi)
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;
    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }


}
