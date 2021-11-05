package com.amina.vsvendas.repository;

import java.util.List;

import com.amina.vsvendas.dto.SaleSucessDTO;
import com.amina.vsvendas.dto.SaleSumDTO;
import com.amina.vsvendas.entity.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
    @Query("SELECT new com.amina.vsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
     +" FROM Sale AS obj GROUP BY obj.seller" )
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.amina.vsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
    +" FROM Sale AS obj GROUP BY obj.seller" )
   List<SaleSucessDTO> sucessGroupedBySeller();
}
