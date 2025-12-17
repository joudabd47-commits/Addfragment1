package com.example.myapplication14;

public class Car {
    private String name ;
    private String phone ;
    private String photo ;
    private int prise ;
    private String category ;
    private String location ;

    public Car(String name , String phone , String photo , int prise,String category,String location)
    {
     this.name = name;
     this.phone = phone;
     this.photo = photo;
     this.prise = prise;
     this.category=category;
     this.location=location;
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
    public int getPrise()
    {
        return prise ;
    }
    public String getCategory(){return category;}
    public String getLocation(){return location;}

}
