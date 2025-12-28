package com.restapi.learning.model;

public class Product {
   private String name;
   private String desc;
   private String category;

   public Product(String name, String desc, String category){
       this.name = name;
       this.desc = desc;
       this.category = category;
   }
   public String getName(){
       return name;
   }
   public String getDesc(){
       return desc;
   }
   public String getCategory(){
       return category;
   }
}
