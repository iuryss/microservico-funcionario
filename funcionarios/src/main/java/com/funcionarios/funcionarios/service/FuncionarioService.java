package com.funcionarios.funcionarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.funcionarios.funcionarios.models.Funcionario;
import com.funcionarios.funcionarios.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> pegarTodos() {
        return repository.findAll();
    }
    
    public Funcionario pegarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }


    public void adicionarFuncionario(Funcionario funcionario) {
        repository.save(funcionario);
    }

    public void removerFuncionario(Integer id) {
        repository.deleteById(id);
    }

    public void editarTelefone(Integer id, String telefone) {
        Funcionario funcionario = repository.findById(id).orElse(null);
        if (funcionario != null) {
            funcionario.setTelefone(telefone);
            repository.save(funcionario);
        }
    }

    public void editarSalario(Integer id, double salario) {
        Funcionario funcionario = repository.findById(id).orElse(null);
        if (funcionario != null) {
            funcionario.setSalario(salario);
            repository.save(funcionario);
        }
    }
}
