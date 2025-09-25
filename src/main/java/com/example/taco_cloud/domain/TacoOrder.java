package com.example.taco_cloud.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {
    private String delivaryName;
    private String delivaryStreet;
    private String delivaryCity;
    private String delivaryState;
    private String delivaryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }

}
