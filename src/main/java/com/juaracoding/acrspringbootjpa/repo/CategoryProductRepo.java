package com.juaracoding.acrspringbootjpa.repo;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 21:43
@Last Modified 17/02/2023 21:43
Version 1.1
*/
import com.juaracoding.acrspringbootjpa.model.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryProductRepo extends JpaRepository<CategoryProduct,Long> {


//    List<CategoryProductDTO> findByNameCategoryProduct(String value);

    /*
        findByNameCategoryProduct
        SELECT * FROM MstCategoryProduct WHERE NameCategoryProduct = ?
    */
}
