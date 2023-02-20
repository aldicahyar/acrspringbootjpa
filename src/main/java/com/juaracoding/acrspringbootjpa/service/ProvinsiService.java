package com.juaracoding.acrspringbootjpa.service;

import com.juaracoding.acrspringbootjpa.handler.ResourceNotFoundException;
import com.juaracoding.acrspringbootjpa.handler.ResponseHandler;
import com.juaracoding.acrspringbootjpa.model.Provinsi;
import com.juaracoding.acrspringbootjpa.repo.ProvinsiRepo;
import com.juaracoding.acrspringbootjpa.utils.ConstantMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author ASUS a.k.a. Aldi Cahya Ramadhan
Java Developer
Created on 20/02/2023 15:05
@Last Modified 20/02/2023 15:05
Version 1.0
*/
@Service
@Transactional
public class ProvinsiService {

    @Autowired
    private ProvinsiRepo provinsiRepo;

    
    @Autowired
    public ProvinsiService(ProvinsiRepo provinsiRepo) {
        String [] strExceptionArr = new String[2];
        strExceptionArr[0] = "ProvinsiService";
        this.provinsiRepo = provinsiRepo;
    }

    public ResponseEntity<Object> saveProvinsi(Provinsi provinsi)
    {
        String [] strExceptionArr = new String[2];
        String strMessage = ConstantMessage.SUCCESS_SAVE;
        try
        {
            provinsiRepo.save(provinsi);
        }
        catch (Exception e)
        {
            strExceptionArr[1]="saveProvinsi(Provinsi provinsi)";
            return new ResponseHandler().generateResponse(ConstantMessage.ERROR_SAVE_FAILED,
                    HttpStatus.BAD_REQUEST,null,"FI02001",null);
        }

        return new ResponseHandler().generateResponse(strMessage,
                HttpStatus.CREATED,null,null,null);
    }

    public ResponseEntity<Object> uploadProvinsiBatch(List<Provinsi> provinsiList) {
        String strMessage = ConstantMessage.SUCCESS_SAVE;
        String [] strExceptionArr = new String[2];
        try {
            provinsiRepo.saveAll(provinsiList);
        } catch (Exception e) {
            strExceptionArr[1] = "uploadProvinsiBatch(List<Provinsi> provinsiList)";
            return new ResponseHandler().generateResponse(ConstantMessage.ERROR_SAVE_FAILED,
                    HttpStatus.BAD_REQUEST,null,"FI02001",null);
        }

        return new ResponseHandler().generateResponse(strMessage,
                HttpStatus.CREATED,null,null,null);
    }

    @Transactional(rollbackOn = {Exception.class, SQLException.class})
    public ResponseEntity<Object> saveUploadFile(List<Provinsi> listProvinsi,
                                                 MultipartFile multipartFile,
                                                 WebRequest request) throws ResourceNotFoundException {
        List<Provinsi> provinsiList = null;
        String [] strExceptionArr = new String[2];
        String strMessage = ConstantMessage.SUCCESS_SAVE;
        try
        {
            provinsiList = provinsiRepo.saveAll(listProvinsi);
            if(provinsiList.size()==0)
            {
                return new ResponseHandler().generateResponse(ConstantMessage.ERROR_EMPTY_FILE +" -- "+multipartFile.getOriginalFilename(),
                        HttpStatus.BAD_REQUEST,null,"FI01020",request);
            }
        }
        catch (Exception e)
        {
            strMessage = e.getMessage();
            strExceptionArr[1]="saveUploadFile(List<Provinsi> listProvinsi, MultipartFile multipartFile, WebRequest request) --- LINE 77";
            return new ResponseHandler().generateResponse(strMessage,
                    HttpStatus.BAD_REQUEST,null,"FI01021",request);
        }

        return new ResponseHandler().generateResponse(strMessage,
                HttpStatus.CREATED,null,null,request);
    }
}


