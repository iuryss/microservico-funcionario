package com.funcionarios.funcionarios.models.Enums;

import lombok.*;


@NoArgsConstructor
@Getter
public enum Profissao {
    PROFESSOR("PROFESSOR"),
    COORDENADOR("COORDENADOR"),
    DIRETOR("DIRETOR");

    private String profissao;
    Profissao(String profissao) {
        this.profissao = profissao;
    }
    
    public String getAuthority() {
        return profissao;
    }
}
