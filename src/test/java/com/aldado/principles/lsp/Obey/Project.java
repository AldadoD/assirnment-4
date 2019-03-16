package com.aldado.principles.lsp.Obey;

import com.aldado.principles.lsp.Violate.Employee;

import java.util.List;

public class Project {

    public void start(List<Employee> workingEmployees) {

        for(WorkingEmployee workingEmployee:workingEmployees) {

            workingEmployee.work();

        }
    }
}
