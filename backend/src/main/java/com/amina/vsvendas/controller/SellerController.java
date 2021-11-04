package com.amina.vsvendas.controller;

import java.util.List;

import com.amina.vsvendas.dto.SellerDTO;
import com.amina.vsvendas.services.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.server.header.PermissionsPolicyServerHttpHeadersWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> list = sellerService.findAll();
        return ResponseEntity.ok(list);
    }
    
}
