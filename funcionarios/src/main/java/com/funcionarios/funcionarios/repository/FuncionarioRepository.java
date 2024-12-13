package com.funcionarios.funcionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.funcionarios.funcionarios.models.Funcionario;

public interface FuncionarioRepository  extends JpaRepository<Funcionario, Integer>{}
