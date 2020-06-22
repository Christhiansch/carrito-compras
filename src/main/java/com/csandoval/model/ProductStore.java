package com.csandoval.model;

import com.csandoval.util.Column;

public class ProductStore extends Product
{

	private Integer stock;
	private Integer stockMin;
	
	public ProductStore(String[] campos)
	{
		this.setIdProduct(Integer.valueOf(campos[Column.IDPRODUCTO]));
		this.setName(String.valueOf(campos[Column.NAMEPRODUCT]));	
		this.setCategory(Category.valueOf(campos[Column.CATEGORY]));
		this.setBuyPrice(Double.valueOf(campos[Column.BUYPRICE]));
		this.setSalePrice(Double.valueOf(campos[Column.SALEPRICE]));
		this.setStock(Integer.valueOf(campos[Column.STOCKTOTAL]));
		this.setStockMin(Integer.valueOf(campos[Column.STOCKMIN]));
	}

	public ProductStore(Integer idProduct, String name, Category category, Double buyPrice, Double salePrice,
	    Integer stock, Integer stockMin)
	{
		super(idProduct, name, category, buyPrice, salePrice);
		this.stock = stock;
		this.stockMin = stockMin;
	}

	public Integer getStock()
	{
		return stock;
	}

	public void setStock(Integer stock)
	{
		this.stock = stock;
	}

	public Integer getStockMin()
	{
		return stockMin;
	}

	public void setStockMin(Integer stockMin)
	{
		this.stockMin = stockMin;
	}

	@Override
	public String toString()
	{
		return "ProductStore [stock=" + stock + ", stockMin=" + stockMin + ", " + super.toString() + "]";
	}

	
	

}
