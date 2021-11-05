package com.amina.vsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.amina.vsvendas.dto.SellerDTO;
import com.amina.vsvendas.entity.Seller;
import com.amina.vsvendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
        List<Seller> result =  sellerRepository.findAll();
        // CONVERTE a entidade Seller para um SellerDTO
        return result.stream().map((Seller seller) -> new SellerDTO(seller)).collect(Collectors.toList());
    }

}
