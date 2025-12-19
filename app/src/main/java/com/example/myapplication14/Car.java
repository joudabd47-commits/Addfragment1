package com.example.myapplication14;

public class Car {
    private String name ;
    private String phone ;
    private String photo ;
    private int price;
    private String category ;
    private String location ;
    private String numberplate;

    public Car(String name , String phone , String photo , int price,String category,String location,String numberplate)
    {
     this.name = name;
     this.phone = phone;
     this.photo = photo;
     this.price = price;
     this.category=category;
     this.location=location;
     this.numberplate=numberplate;
    }
    public String getName(){
        return name ;
    }
    public String getPhone(){
        return phone ;
    }
    public String getPhoto(){
        return photo ;
    }
    public int getPrice()
    {
        return price;
    }
    public String getCategory(){return category;}
    public String getLocation(){return location;}
    public String getNumberplate(){return numberplate;}

}
