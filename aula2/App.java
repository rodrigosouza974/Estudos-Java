// criando classes e objetos

public class App {
   
    public static void main (String[] args) throws Exception{

    //declarando um objeto do tipo celular= Instanciando um objeto
    Celular celularA = new Celular();
    celularA.nome = "Iphone";
    celularA.tamanhoTela = 24.2f;
    celularA.armazenamento = 240;
    celularA.sistemaOperacional = "ios"; 

    Celular celularB = new Celular();
    celularB.nome = "samsung";
    celularB.tamanhoTela = 12.2f;
    celularB.armazenamento = 160;
    celularB.sistemaOperacional = "android"; 

    Celular celularC;


    System.out.format("celular %s com tela de %f com %d gb e SO %s \n",celularA.nome,celularA.tamanhoTela,celularA.armazenamento,celularA.sistemaOperacional);
    System.out.format("celular %s com tela de %f com %d gb e SO %s",celularB.nome,celularB.tamanhoTela,celularB.armazenamento,celularB.sistemaOperacional);
   
}
}
