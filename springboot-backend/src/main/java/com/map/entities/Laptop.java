package com.map.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jpa_laptop")
public class Laptop {
    @Id
    private int laptopId;
    private int modelNumber;
    private String brand;
    @OneToOne
    private  Student student;
}
