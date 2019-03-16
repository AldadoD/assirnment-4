package com.aldado.principles.isp.Obey;

public abstract class NewAthlete implements SwimmingAthlete{
    @Override
    public void compete() {

        System.out.println("John Doe started competing");

    }

    @Override
    public void swim() {

        System.out.println("John Doe started swimming");

    }


}
