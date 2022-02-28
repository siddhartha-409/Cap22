package ecommerce.main;

import java.util.List;

import ecommerce.com.Product;
import ecommerce.com.businesslogic.Service;

public class Main {

	public static void main(String[] args) {
				
		//id automatically generated
		
		Service serve = new Service();
		Product newproducts = new Product();
				
		newproducts.setColor("black");
		newproducts.setLaptopName("Dell");
		newproducts.setModel("SVM45");
		newproducts.setScreensize("18 inches");
		newproducts.setWeight("1.6 Kg");
				
		serve.addProduct(newproducts);
				
		Product updateProduct = new Product();
		updateProduct.setColor("White");
		updateProduct.setLaptopName("Lenovo");
		updateProduct.setModel("RGB240");
		updateProduct.setScreensize("14 inches");
		updateProduct.setWeight("1.4 Kg");
				
		Product updated = serve.updateProductById(updateProduct, 1);
		String laptopNameNow = updated.getLaptopName();
		System.out.println("Now the LaptopName is: " + laptopNameNow);
				
		Product gotid =serve.findProductById(3);
		gotid.getId();
		System.out.println("is.."+gotid.getId());
		serve.deleteProductRecordById(3);
				
		serve.deleteAllProductRecord();
				
				
		// list of products
		        
		List<Product> productlist = serve.getListOfAllProducts();
				
		for (Product newlist : productlist) {
		System.out.println("screensize is: " + newlist.getScreensize());
		System.out.println("laptopName is: " + newlist.getLaptopName());
		System.out.println("model is: " + newlist.getModel());

		}
				
		Product prod = serve.getProductDetailsById(2);
		System.out.println("laptopName is: " + prod.getLaptopName());
		System.out.println("Color is: " + prod.getColor());
		System.out.println("Model is: " + prod.getModel());
				
		//Delete All items
				
		String result = serve.deleteAllProductRecord();
		System.out.println(result);


	}

}
