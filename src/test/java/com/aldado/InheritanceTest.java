package com.aldado;

import org.junit.Test;

public class InheritanceTest extends SmallProgram {

    @Test
    public void testInheritance(){
        Surname surname = new Surname();
        surname.setValue("Dampies");

        assert  surname.getValue().equals("Dampies");
    }
}
