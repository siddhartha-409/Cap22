package com.demo.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Brand;

public interface BrandRepositary extends JpaRepository<Brand, Long> {

}
