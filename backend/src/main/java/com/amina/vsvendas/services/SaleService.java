package com.amina.vsvendas.services;

import java.util.List;

import com.amina.vsvendas.dto.SaleDTO;
import com.amina.vsvendas.dto.SaleSucessDTO;
import com.amina.vsvendas.dto.SaleSumDTO;
import com.amina.vsvendas.entity.Sale;
import com.amina.vsvendas.repository.SaleRepository;
import com.amina.vsvendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result =  saleRepository.findAll(pageable);
        // CONVERTE a entidade Seller para um SellerDTO
        return result.map((Sale sale) -> new SaleDTO(sale));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupedBySeller(){
        return saleRepository.sucessGroupedBySeller();
    }
    
}
