package com.demo.serviceipl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Brand;
import com.demo.pojo.Product;
import com.demo.productrepository.BrandRepositary;
import com.demo.service.BrandService;

@Component
public class BrandServiceImp implements BrandService{
	
	@Autowired
	BrandRepositary brandRepos;
	
	

	@Override
	public Brand addBrandDetails(Brand brand) {
		return brandRepos.save(brand);
	}
	
	public Brand saveBrand(Brand brad) {
        List<Product> product = brad.getProductList();
        brad.setProductList(product);
        Product p = new Product();
        p.setBrands(brad);
        brad = brandRepos.save(brad);
        return brad;
    }
	

}
