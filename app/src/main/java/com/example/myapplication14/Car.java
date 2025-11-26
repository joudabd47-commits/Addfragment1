package com.example.myapplication14;

public class Car {
    private String name ;
    private String phone ;
    private String photo ;
    private int prise ;

    public Car(String name , String phone , String photo , int prise)
    {
     this.name = name;
     this.phone = phone;
     this.photo = photo;
     this.prise = prise;
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

}
