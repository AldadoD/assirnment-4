package com.aldado.principles.isp.Violate;

public class NewAthlete implements Athlete {

        @Override
        public void compete() {

            System.out.println("New Athlete started competing");

        }
        @Override
        public void swim() {

            System.out.println("New Athlete started swimming");

        }
        @Override
        public void highJump() {

        }
        @Override
        public void longJump() {

        }
}
