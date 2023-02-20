package com.juaracoding.acrspringbootjpa.model;

import com.juaracoding.acrspringbootjpa.utils.ConstantMessage;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 13/02/2023 20:03
@Last Modified 13/02/2023 20:03
Version 1.1
*/
@Entity
@Table (name = "MstCategoryProduct")
public class CategoryProduct implements Serializable {

    private static final long serialversionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCategoryProduct")
    private Long idCategoryProduct;


    @Length(message = ConstantMessage.WARNING_CATPROD_MAX_LENGTH_NAME, max = 40)
    @NotEmpty(message = ConstantMessage.WARNING_CATPROD_NAME_CANNOT_EMPTY)
    @Column(name = "NameCategoryProduct", nullable = false, length = 40)
    private String nameCategoryProduct;

    public String getNameCategoryProduct() {
        return nameCategoryProduct;
    }

    public void setNameCategoryProduct(String nameCategoryProduct) {
        this.nameCategoryProduct = nameCategoryProduct;
    }

    @NotEmpty(message = ConstantMessage.WARNING_CATPROD_DESC_CANNOT_EMPTY)
    @Length(message = ConstantMessage.WARNING_CATPROD_MAX_LENGTH_DESC, max = 500)
    @Column(name = "DescCategoryProduct", nullable = false, length = 500)
    private String strDescCategoryProduct;
    /*
        start audit trails
     */
    @Column(name ="CreatedDate" , nullable = false)
    private Date createdDate = new Date();

    @Column(name = "CreatedBy", nullable = false)
    private Integer createdBy;

    @Column(name = "ModifiedDate")
    private Date modifiedDate;
    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete", nullable = false)
    private Byte isDelete = 1;
    /*
        end audit trails
     */


    public Long getIdCategoryProduct() {
        return idCategoryProduct;
    }

    public void setIdCategoryProduct(Long idCategoryProduct) {
        this.idCategoryProduct = idCategoryProduct;
    }



    public String getStrDescCategoryProduct() {
        return strDescCategoryProduct;
    }

    public void setStrDescCategoryProduct(String strDescCategoryProduct) {
        this.strDescCategoryProduct = strDescCategoryProduct;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}
