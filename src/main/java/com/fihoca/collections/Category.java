package com.fihoca.collections;

import java.util.Map;

public class Category {
	
	private int idCategory;
	private String name;
	private Map<Long, Product> productList;
	
	public Category() {
		
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Long, Product> getProductList() {
		return productList;
	}

	public void setProductList(Map<Long, Product> categoryList) {
		this.productList = categoryList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
		result = prime * result + idCategory;
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
		Category other = (Category) obj;
		if (productList == null) {
			if (other.productList != null)
				return false;
		} else if (!productList.equals(other.productList))
			return false;
		if (idCategory != other.idCategory)
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
		builder.append("Category [idCategory=");
		builder.append(idCategory);
		builder.append(", name=");
		builder.append(name);
		builder.append(", categoryList=");
		builder.append(productList);
		builder.append("]");
		return builder.toString();
	}

}
