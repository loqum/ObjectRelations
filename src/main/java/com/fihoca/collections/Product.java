package com.fihoca.collections;

import java.util.Map;

public class Product {
	
	private int idProduct; 
	private String name;
	private Map<Long, Category> categoryList;
	
	public Product() {
		
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Long, Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(Map<Long, Category> categoryList) {
		this.categoryList = categoryList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryList == null) ? 0 : categoryList.hashCode());
		result = prime * result + idProduct;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (categoryList == null) {
			if (other.categoryList != null)
				return false;
		} else if (!categoryList.equals(other.categoryList))
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [idProduct=");
		builder.append(idProduct);
		builder.append(", name=");
		builder.append(name);
		builder.append(", categoryList=");
		builder.append(categoryList);
		builder.append("]");
		return builder.toString();
	}

}
