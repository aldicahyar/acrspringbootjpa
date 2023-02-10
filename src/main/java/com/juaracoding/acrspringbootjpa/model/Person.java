package com.juaracoding.acrspringbootjpa.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 09/02/2023 19:10
@Last Modified 09/02/2023 19:10
Version 1.1
*/
@Entity
@Table(name = "MstPerson")
public class Person {


    @Column(name = "createdDate")
    private Date createDate = new Date();

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "modifiedDate")
    private Date modifiedDate;

    @Column(name = "modifiedBy")
    private Integer modifiedBy;

    @Column(name = "isDelete")
    private Byte isDelete = 1;

    @Id
    @Column(name = "IDPerson")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FirstName", nullable = false, length = 15)
    private String firstName;

    @Column(name = "MiddleName", nullable = true, length = 15)
    private String middleName;

    @Column(name = "LastName", length = 15)
    private String lastName;

    @Column(name = "dayOfBirth")
    private LocalDate dayOfBirth;

    private Integer age;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Integer getAge() {
        return Period.between(this.dayOfBirth,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
