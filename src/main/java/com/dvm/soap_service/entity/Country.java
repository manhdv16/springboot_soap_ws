package com.dvm.soap_service.entity;


import com.dvm.soap_service.dto.Currency;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Country name is not blank")
    private String name;
    @NotBlank(message = "Capital is not blank")
    private String capital;
    @NonNull
    private Currency currency;
}
