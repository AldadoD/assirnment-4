package com.aldado;

import org.springframework.boot.SpringApplication;

public class SmallProgram {

    public static void main(String[] args) {
        SpringApplication.run(SmallProgram.class, args);

        Name name = new Name();
        Surname surname = new Surname();
//        name.getType().equals("Dampies");



        System.out.println("Name: " + name.getType()+ " " + surname.getType() );
    }
}
