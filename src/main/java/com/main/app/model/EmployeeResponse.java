package com.main.app.model;

import lombok.Data;
import java.util.List;

@Data
public class EmployeeResponse {
    private String status;
    private String message;
    private List<Employee> data;
}
