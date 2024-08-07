package com.berkerdgn.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cars")
@Data  // Getter ve setterları otomatik oluşturması için
@AllArgsConstructor  //Parametreli kullanamk için
@NoArgsConstructor   //PArametresiz kullanmak için
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true)
    private String plate;


    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state; //1 - Available  2- Rented  3-Maintenance

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
