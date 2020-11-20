package com.tugasPBO;

public class Biografi {
    protected String nama, dubber, julukan, jenisKelamin, role, RoleOnMovie;
    public Biografi(String nama, String dubber, String julukan, String jenisKelamin, String role, String RoleOnMovie){
        this.nama = nama;
        this.dubber = dubber;
        this.jenisKelamin = jenisKelamin;
        this.julukan = julukan;
        this.role = role;
        this.RoleOnMovie = RoleOnMovie;
    }

    public void tampilBio(){
        System.out.println("Nama                    : "+nama);
        System.out.println("Role                    : "+role);
        System.out.println("Peran yang dimainkan    : "+RoleOnMovie);
        System.out.println("Jenis Kelamin           : "+jenisKelamin);
        System.out.println("Julukan                 : "+julukan);
        System.out.println("Pengisi suara           : "+dubber+"\n");
    }

}
