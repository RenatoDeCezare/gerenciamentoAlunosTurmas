package br.com.Unisep.GerenciaAlunosTurmas;

import java.util.ArrayList;

public class Turma {
    ArrayList <Aluno> Alunos = new ArrayList<Aluno>();
    int cod;
    String descricao;

    Turma (int cod, String descricao){
        this.cod = cod;
        this.descricao = descricao;
    }
    
}

