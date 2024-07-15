package com.berkerdgn.rentacar.dataAccess.abstracts;

import com.berkerdgn.rentacar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {



}
