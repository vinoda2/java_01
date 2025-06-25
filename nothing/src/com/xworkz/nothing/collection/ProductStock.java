package com.xworkz.nothing.collection;

import java.util.ArrayList;

public class ProductStock {

    private ArrayList<String> stockOfProducts;
    public ProductStock(){
      stockOfProducts = new ArrayList<>();
    }

    public void addItem(String product){
        stockOfProducts.add(product);
    }

    public String removeItem(){
        if(stockOfProducts.isEmpty()){
            return  "Stack is empty we can't remove items";
        }else{
            return stockOfProducts.remove(stockOfProducts.size()-1);
        }
    }

    public static void main(String[] args) {
        ProductStock stock  =   new ProductStock();
       stock.addItem("Laptop");
        stock.addItem("Mobile");
        stock.addItem("Pen");

        System.out.println(stock.removeItem());
    }

}
