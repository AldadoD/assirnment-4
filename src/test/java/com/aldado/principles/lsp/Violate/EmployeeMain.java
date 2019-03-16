package com.aldado.principles.lsp.Violate;

import com.aldado.principles.lsp.Obey.Project;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String args[]) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new EmployeeOnHoliday());
        employees.add(new Employee());

        Project project = new Project();
        project.start(employees);

    }
}
