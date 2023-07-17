package org.example.prototype;

 public class Record implements Cloneable {
    private int id;

     public Record(int id) {
         this.id = id;
     }

     @Override
     protected Object clone()  {
         try {
             return super.clone();
         } catch (CloneNotSupportedException e) {
             e.printStackTrace();
         }
         return null;
     }


     public int getId() {
         return id;
     }
 }
