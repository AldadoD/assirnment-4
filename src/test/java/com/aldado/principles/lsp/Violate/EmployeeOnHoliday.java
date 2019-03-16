package com.aldado.principles.lsp.Violate;

import com.aldado.principles.lsp.Violate.Employee;

public class EmployeeOnHoliday extends Employee {

    @Override
    public void work() {

        throw new IllegalArgumentException("Employees on vacation should not work");

    }
}
