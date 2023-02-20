package com.juaracoding.acrspringbootjpa.service;

import com.juaracoding.acrspringbootjpa.model.Person;
import com.juaracoding.acrspringbootjpa.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 21:51
@Last Modified 17/02/2023 21:51
Version 1.1
*/
@Service
@Transactional
public class PersonService  {

    @Autowired
    private PersonRepo personRepo;

    public void savePerson(Person person){

        List<Person> l = new ArrayList<>();
        List<Person> ll = new LinkedList<>();
        List<Person> lll = new Vector<>();

        Pageable p = null;
        personRepo.save(person);
        personRepo.findAll();
        personRepo.findByFirstName(person.getFirstName());

    }

    public List<Person> findByName(Person person){
        return personRepo.findByFirstName(person.getFirstName());

    }
}
