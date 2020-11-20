package com.tugasPBO;

public class Character extends Biografi{
    private int rate;
    public Character(String nama, String dubber, String julukan, String jenisKelamin, String role, String RoleOnMovie) {
        super(nama, dubber, julukan, jenisKelamin, role, RoleOnMovie);
    }

    public void setRating(int rate){
        this.rate = rate;
    }

    public int getRating(){
        return rate;
    }


}
