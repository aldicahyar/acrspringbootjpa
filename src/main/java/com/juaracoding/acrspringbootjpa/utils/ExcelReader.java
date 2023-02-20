package com.juaracoding.acrspringbootjpa.utils;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author aldic  a.k.a Aldi Cahya Ramadhan
Java Developer
Created on 17/02/2023 21:56
@Last Modified 17/02/2023 21:56
Version 1.1
*/

import org.springframework.web.multipart.MultipartFile;

public class ExcelReader {

    public static boolean isExcel(MultipartFile multipartFile)
    {
        if(!ConstantMessage.CONTENT_TYPE_XLS.equals(multipartFile.getContentType()) && !ConstantMessage.CONTENT_TYPE_XLSX.equals(multipartFile.getContentType()))
        {
            return false;
        }
        return true;


//        if(ConstantMessage.CONTENT_TYPE_XLS.equals(multipartFile.getContentType()) || ConstantMessage.CONTENT_TYPE_XLSX.equals(multipartFile.getContentType()))
//        {
//            return true;
//        }
//        return false;
    }
}
