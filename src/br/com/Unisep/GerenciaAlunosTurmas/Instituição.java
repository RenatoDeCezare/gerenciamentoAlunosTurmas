package br.com.Unisep.GerenciaAlunosTurmas;

import java.util.ArrayList;

public class Instituição {

    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    
    public void turma (Turma tu){
        turmas.add(tu);
    }
    /*
     * > Instituição	classe
     - Lista de Turmas	atributo
     * Instituição ()	contrutor
     
     */
}