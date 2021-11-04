package com.amina.vsvendas.dto;

import java.io.Serializable;

import com.amina.vsvendas.entity.Seller;

public class SellerDTO implements Serializable {

    //private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    public SellerDTO(){}

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // recebe uma entidade Seller para que possa copiar de forma facil os dados de uma entidade para um dto
    public SellerDTO(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
          
}


