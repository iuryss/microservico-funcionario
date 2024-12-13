package com.funcionarios.funcionarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.funcionarios.funcionarios.models.*;
import com.funcionarios.funcionarios.service.*;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService gestor;

    @GetMapping
    public List<Funcionario> getAll(){
        return gestor.pegarTodos();
    }

    @GetMapping("/{id}")
    public Funcionario findById(@PathVariable Integer id) {
        Funcionario funcionario = gestor.pegarPorId(id);
        if (funcionario == null) {
            return null;
        }
        return funcionario;
    }

    @PostMapping
    public void addFuncionario(@RequestBody Funcionario funcionario){
        gestor.adicionarFuncionario(funcionario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        gestor.removerFuncionario(id);
    }

    @PutMapping("/telefone/{id}/{telefone}")
    public void editNumber(@PathVariable Integer id, @PathVariable String telefone){
        gestor.editarTelefone(id, telefone);
    }

    @PutMapping("/salario/{id}/{salario}")
    public void editSalary(@PathVariable Integer id, @PathVariable double    salario){
        gestor.editarSalario(id, salario);
    }

}
