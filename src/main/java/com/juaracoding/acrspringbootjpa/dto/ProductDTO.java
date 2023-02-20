package com.juaracoding.acrspringbootjpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 21:30
@Last Modified 17/02/2023 21:30
Version 1.1
*/
@JsonIgnoreProperties(ignoreUnknown = true)

public class ProductDTO {

    private Long idProduct;
    private String nameProduct;
    private CategoryProductDTO categoryProduct;
    private String descriptionProduct;

    public CategoryProductDTO getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(CategoryProductDTO categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

//    public CategoryProductDTO getCategoryProductDTO() {
//        return categoryProductDTO;
//    }
//
//    public void setCategoryProductDTO(CategoryProductDTO categoryProductDTO) {
//        this.categoryProductDTO = categoryProductDTO;
//    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }
}



