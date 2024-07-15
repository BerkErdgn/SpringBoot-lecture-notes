package com.berkerdgn.rentacar.business.rules;

import com.berkerdgn.rentacar.core.utilities.exceptions.BusinessException;
import com.berkerdgn.rentacar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRule {

    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name) {
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand " + name + " already exists");
        }
    }


}
