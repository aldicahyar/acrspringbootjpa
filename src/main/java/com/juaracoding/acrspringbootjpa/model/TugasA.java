package com.juaracoding.acrspringbootjpa.model;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author ASUS a.k.a. Aldi Cahya Ramadhan
Java Developer
Created on 20/02/2023 14:46
@Last Modified 20/02/2023 14:46
Version 1.0
*/

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MstTugasA")
public class TugasA {

    @Id
    @Column(name = "IDTugasA")
    private String idTugasA;

    @Column(name = "Nama", nullable = false, length = 40)
    private String strNama;

    @Column(name = "Alamat",nullable = false, length = 500)
    private String strAlamat;

    @Column(name = "TanggalLahir", nullable = false)
    private Date tanggalLahir;

    @Column(name = "JenisKelamin",nullable = false, length = 1)
    private Character chJenisK;

    @Column(name = "MasihHidup", nullable = false)
    private Short shMasihHidup;


    /*
       start audit trails
    */
    @Column(name ="CreatedDate" , nullable = false, length = 7)
    private Date createdDate = new Date();

    @Column(name = "CreatedBy", nullable = false)
    private Integer createdBy;

    @Column(name = "ModifiedDate",length = 7)
    private Date modifiedDate = new Date();
    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete", nullable = false)
    private Byte isDelete = 1;
    /*
        end audit trails
     */

    public String getIdTugasA() {
        return idTugasA;
    }

    public void setIdTugasA(String idTugasA) {
        this.idTugasA = idTugasA;
    }

    public String getStrNama() {
        return strNama;
    }

    public void setStrNama(String strNama) {
        this.strNama = strNama;
    }

    public String getStrAlamat() {
        return strAlamat;
    }

    public void setStrAlamat(String strAlamat) {
        this.strAlamat = strAlamat;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Character getChJenisK() {
        return chJenisK;
    }

    public void setChJenisK(Character chJenisK) {
        this.chJenisK = chJenisK;
    }

    public Short getShMasihHidup() {
        return shMasihHidup;
    }

    public void setShMasihHidup(Short shMasihHidup) {
        this.shMasihHidup = shMasihHidup;
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
