public class Aluno {
    private String nome;
    private int telefone;
    private int matricula;
    

public Aluno(String nome, int telefone,int matricula){
    this.nome = nome;
    this.telefone = telefone;
    this.matricula = matricula;
}
    // Método get para o atributo
    public String getNome() {
        return this.nome;
    }
    public int gettelefone() {
        return this.telefone;
    }
    public String getmatricula() {
        return this.matricula;
    }

     // Método set para o atributo 
     public void setNome(String novoNome) {
        this.nome = novoNome;
    } 
    public void setNome(int novoTelefone) {
        this.telefone = novoTelefone;
    } 
    public void setMatricula(int novoMatricula) {
        this.matricula = novoMatricula;
    }
}
