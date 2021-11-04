package com.amina.vsvendas.repository;

import com.amina.vsvendas.entity.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
