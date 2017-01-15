package com.jdbc.BO;

import java.util.List;

import com.jdbc.DAO.ProductDaoImpl;
import com.jdbc.DTO.Product;

public class ProductBO {
	ProductDaoImpl pdimp=new ProductDaoImpl();
	
	// fetch the product by category
	public List<Product> getProductByCategory(int id) throws Exception{
		return pdimp.getAllProductByCategoryId( id);
		
	}
	// delete product info
	public int deleteProductInfo(int id) throws Exception{
		return pdimp.deleteProduct(id);
		
	}
	// fetch the product with largest production
	public List<Product> getProductByLargestDescription() throws Exception{
		return pdimp.getLargestDescription();
		
	}
	//delete product from a category
	public int deleteProductFromaCategory(int id) throws Exception{
		return pdimp.RemoveProductfromaCategory(id);
		
	}
	// fetch most recent five products
	public List<Product> getRecentProducts() throws Exception{
		return pdimp.DisplayRecent5Products();
		
	}
	// get average number of products
	public double getAvgNumberofproducts() throws Exception{
		return pdimp.getAvgNumberPorductsofAllCategory();
	}
	

}
