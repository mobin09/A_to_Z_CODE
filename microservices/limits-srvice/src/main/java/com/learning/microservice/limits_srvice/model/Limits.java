package com.learning.microservice.limits_srvice.model;

public class Limits {
   private int minimum;
   private int maximum;

   public Limits(){}

   public Limits(int minimum, int maximum){
       this.minimum = minimum;
       this.maximum = maximum;
   }

   public void setMinimum(int minimum){
       this.minimum = minimum;
   }

   public int getMinimum(){
       return minimum;
   }

   public void setMaximum(int maximum){
       this.maximum = maximum;
   }
   public int getMaximum(){
       return maximum;
   }

}
