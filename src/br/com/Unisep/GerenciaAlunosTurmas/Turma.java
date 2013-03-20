package br.com.Unisep.GerenciaAlunosTurmas;
import java.util.ArrayList;

public class Turma {
    private ArrayList <Aluno> alunos = new ArrayList<Aluno>();
    private int cod;
    private String descricao;
    
    public Turma (int cod, String descricao){
        this.cod = cod;
        this.descricao = descricao;
    }
    
    public void matricula(Aluno al){
        alunos.add(al);
        al.setTurma(this);
    }
    
    public void cancelaMatricula(Aluno al){
        alunos.remove(al);
    }
    
    public int quantidadeAlunos(){
        return alunos.size();
    }
    public int quantidadeAlunosAprovados(){
        int x;
        int aprovados=0;
        for (x = 0; x <alunos.size();x++){
            if (alunos.get(x).getMedia()>=7){
                aprovados++;
            }
        }
       return (aprovados);      
    }
    public int quantidadeAlunosReprovados(){
        int x;
        int reprovados = 0;
        for(x = 0; x<alunos.size();x++){
            if (alunos.get(x).getMedia()< 7){
                reprovados ++;
            }
        }
        return (reprovados);
    }
    public float porcentagemAlunosAprovados(){
        return (quantidadeAlunosAprovados() * 100)/alunos.size();
    }
    public float porcentagemAlunosReprovados(){
        return (quantidadeAlunosReprovados() * 100)/alunos.size();
    }
    public float mediaGeralTurma(){
        int x;
        float mediaTotal=0;
        for(x = 0; x<alunos.size();x++){
            mediaTotal = alunos.get(x).getMedia();
            mediaTotal ++;
        }
        
        return mediaTotal/alunos.size();
    }
    
}
/*Turma	 classe
- Código	atributos
- Descrição	atributos
- Lista de alunos	atributo
* Turma ( Código, Descrição )	construtor
= quantidadeAlunos()	metodo
= quantidadeAlunosAprovados()   metodo	
= quantidadeAlunosReprovados()	metodo
= porcentagemAlunosAprovados()	metodo
= porcentagemAlunosReprovados()	metodo
= mediaGeralTurma()	metodo
*/

//e-mail do professor decarli@live.com 