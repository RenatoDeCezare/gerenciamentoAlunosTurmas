
package br.com.Unisep.GerenciaAlunosTurmas;


public class Aluno {
    
    private int ra;
    private String nome;
    private float notaG1;
    private float notaG2;
    private Turma turma;
    
    Aluno (int ra , String nome){
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
    protected float  Media (){
       return (notaG1+(notaG2*2))/3;      
   }
   public float getMedia (){
       return Media ();
   }
}
//for normal ou usando for it
//na lista de alunos 
//f1 :for (int x = 0; x<Lista.size();x++;){
    //lista.get(x); mostra quem está na lista
//}
//criar outroF2: for (int y = 0; y< 10; y++{
                    //F3: for (int z = 10; z>0; z--){
//pra interonper sequencia de loop se colocar return interonpe tudo
//break F2 ;nome do for para o for logo acima dele
//continue f2 ele interronpe somente a volta ele pula pra proxima volta 
//tres formas para interomper return break; continue.
//as veses é preciso parar um dos fors



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