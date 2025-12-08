package com.mycompany.inventorymanager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryManager {

    private List<Product> productList;
    public List<Product> getAllProducts() {
        return productList;
    }

    public void addProduct(String id, String supplierId, String name, String type, int quantity, double price) {
        Product newProduct = new Product(id, name, type, quantity, supplierId, price);
        productList.add(newProduct);
    }

    public boolean updateProduct(int rowIndex, String newId, String newSupplierId, String newName, String newType, int newQuantity, double newPrice) {
        if (rowIndex >= 0 && rowIndex < productList.size()) {
            Product product = productList.get(rowIndex);
            
            product.setName(newName);
            product.setSupplierId(newSupplierId); 
            product.setType(newType);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            
            return true;
        }
        return false;
    }

    public boolean deleteProduct(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < productList.size()) {
            productList.remove(rowIndex);
            return true;
        }
        return false;
    }

}