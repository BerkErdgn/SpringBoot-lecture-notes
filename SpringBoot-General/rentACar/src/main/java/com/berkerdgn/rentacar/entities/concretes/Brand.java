package com.berkerdgn.rentacar.entities.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="brands")
@Data  // Getter ve setterları otomatik oluşturması için
@AllArgsConstructor  //Parametreli kullanamk için
@NoArgsConstructor   //PArametresiz kullanmak için
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

}
