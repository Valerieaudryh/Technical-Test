package com.main.app.service;

import com.main.app.model.Employee;
import com.main.app.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {
    private final String API_URL = "https://dummy.restapiexample.com/";

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {
        EmployeeResponse response = restTemplate.getForObject(API_URL, EmployeeResponse.class);
        return response.getData();
    }
}