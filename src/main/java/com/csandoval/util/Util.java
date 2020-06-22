package com.csandoval.util;

import com.csandoval.model.ProductStore;

public class Util
{
	
	public static int orderProductsAlphabetically(ProductStore fproduct, ProductStore sproduct)
	{
		return fproduct.getName().compareTo(sproduct.getName()); 
	}
}
