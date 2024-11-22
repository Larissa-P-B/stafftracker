package com.example.stafftracker.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stafftracker.Models.Employee;
import com.example.stafftracker.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
@Tag(name = "Employees", description = "API para gerenciar funcionários")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    @Operation(summary = "Listar todos os funcionários", description = "Retorna uma lista com todos os funcionários cadastrados.")
    public List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar funcionário por ID", description = "Busca um funcionário pelo ID fornecido.")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cadastrar funcionário", description = "Cadastra um novo funcionário no sistema.")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(service.save(employee));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir funcionário", description = "Exclui um funcionário pelo ID fornecido.")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}