package com.juaracoding.acrspringbootjpa.repo;

import com.juaracoding.acrspringbootjpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
Runtime version: 17.0.5+1-b653.23 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 10 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 1010M
Cores: 8

Kotlin: 223-1.7.21-release-272-IJ8214.52
@Author aldic 
Java Developer
Created on 17/02/2023 21:46
@Last Modified 17/02/2023 21:46
Version 1.1
*/
public interface ProductRepo extends JpaRepository<Product,Long> {

}
