package com.csandoval.model;

public abstract class Product
{

	private Integer idProduct;
	private String name;
	private Category category;
	private Double buyPrice;
	private Double salePrice;	
	
	public Product()
	{
		
	}

	public Product(Integer idProduct, String name, Category category, Double buyPrice, Double salePrice)
	{
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.category = category;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
	}

	public Integer getIdProduct()
	{
		return idProduct;
	}

	public void setIdProduct(Integer idProduct)
	{
		this.idProduct = idProduct;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public Double getBuyPrice()
	{
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice)
	{
		this.buyPrice = buyPrice;
	}

	public Double getSalePrice()
	{
		return salePrice;
	}

	public void setSalePrice(Double salePrice)
	{
		this.salePrice = salePrice;
	}

	@Override
	public String toString()
	{
		return "Product [idProduct=" + idProduct + ", name=" + name + ", category=" + category + ", buyPrice=" + buyPrice
		    + ", salePrice=" + salePrice + "]";
	}
	
	

}
