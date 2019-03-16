package com.aldado;

import com.aldado.Name;
import com.aldado.SmallProgramTest;
import com.aldado.Surname;
import org.junit.Test;

public class PolymorphismTests extends SmallProgramTest {

    @Test
    public void testPolymorphism(){
        Name name = new Name();
        name.setValue("Aldado");
        assert  name.getType().equals("Name");

        Surname surname = new Surname();
        surname.setValue("Dampies");
        assert surname.getType().equals("Surname");

        Name poly = surname;
        assert poly.getType().equals("Surname");
    }
}
