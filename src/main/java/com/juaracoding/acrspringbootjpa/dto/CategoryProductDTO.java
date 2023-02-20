package com.juaracoding.acrspringbootjpa.dto;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 21:29
@Last Modified 17/02/2023 21:29
Version 1.1
*/

public class CategoryProductDTO {
    private Long idCategoryProduct;
    private String nameCategoryProduct;
    private String strDescCategoryProduct;

    public Long getIdCategoryProduct() {
        return idCategoryProduct;
    }

    public void setIdCategoryProduct(Long idCategoryProduct) {
        this.idCategoryProduct = idCategoryProduct;
    }

    public String getNameCategoryProduct() {
        return nameCategoryProduct;
    }

    public void setNameCategoryProduct(String nameCategoryProduct) {
        this.nameCategoryProduct = nameCategoryProduct;
    }

    public String getStrDescCategoryProduct() {
        return strDescCategoryProduct;
    }

    public void setStrDescCategoryProduct(String strDescCategoryProduct) {
        this.strDescCategoryProduct = strDescCategoryProduct;
    }

}
