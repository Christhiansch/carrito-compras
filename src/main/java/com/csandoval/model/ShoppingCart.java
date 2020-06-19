package com.csandoval.model;

import java.time.LocalDateTime;
import java.util.List;

public class ShoppingCart
{

	private List<ProductBuy> products;
	private Double totalAmount;
	private LocalDateTime dateCreate;
	
	public ShoppingCart(List<ProductBuy> products, Double totalAmount, LocalDateTime dateCreate)
	{
		super();
		this.products = products;
		this.totalAmount = totalAmount;
		this.dateCreate = dateCreate;
	}

	public List<ProductBuy> getProducts()
	{
		return products;
	}

	public void setProducts(List<ProductBuy> products)
	{
		this.products = products;
	}

	public Double getTotalAmount()
	{
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount)
	{
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getDateCreate()
	{
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate)
	{
		this.dateCreate = dateCreate;
	}
	
	public void addProduct(ProductBuy product, Integer cantidad)
	{
		product.setCantidad(cantidad);
		products.add(product);
	}
	
	public void removeProduct(Product product)
	{
		products.remove(product);
	}
	
	public void showCar()
	{
	}

}
