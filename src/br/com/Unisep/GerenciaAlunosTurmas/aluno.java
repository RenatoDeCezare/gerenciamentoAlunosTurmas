
package br.com.Unisep.GerenciaAlunosTurmas;


public class aluno {
    
    private int ra;
    private String nome;
    private float notaG1;
    private float notaG2;
    private Turma turma;
    
    public aluno (int ra , String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public float getNotaG1() {
        return notaG1;
    }

    public float getNotaG2() {
        return notaG2;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaG1(float notaG1) {
        this.notaG1 = notaG1;
    }

    public void setNotaG2(float notaG2) {
        this.notaG2 = notaG2;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public  float  getMedia (){
       return (notaG1+(notaG2*2))/3;      
   }
   
}



/*public static int Soma (int x, int y){
 * int s = x+y;
 * return s;
 * }
 
 ps um(){
    int v1 = 10;
    int v2 = 20;
    int soma = soma(v1 , v2);
    * }*/

/*tipos primitivos são imutaveis 
 calculo de bascara
 */