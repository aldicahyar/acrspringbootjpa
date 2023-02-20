package com.juaracoding.acrspringbootjpa.utils;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 22:01
@Last Modified 17/02/2023 22:01
Version 1.1
*/

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public class TransformToDTO {


    public Map<String,Object> transformObject(Map<String,Object> mapz, List ls, Page page)
    {
        mapz.put("content",ls);
        mapz.put("currentPage",page.getNumber());
        mapz.put("totalItems",page.getTotalElements());
        mapz.put("totalPages",page.getTotalPages());
        mapz.put("sort",page.getSort());
        mapz.put("numberOfElements",page.getNumberOfElements());

        return mapz;
    }
}
