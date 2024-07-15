package com.berkerdgn.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="models")
@Data  // Getter ve setterları otomatik oluşturması için
@AllArgsConstructor  //Parametreli kullanamk için
@NoArgsConstructor   //PArametresiz kullanmak için
@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "model_id")
    private List<Car> cars;

}
