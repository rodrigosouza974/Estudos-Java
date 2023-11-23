//esse é o exemplo de código e explicações

public class ExemploClasse {

    // Atributo privado
    private int numero;

    // Construtor
    public ExemploClasse(int numero) {
        this.numero = numero;
    }

    // Método público para acessar o atributo privado
    public int getNumero() {
        return this.numero;
    }

    // Método público para modificar o atributo privado
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }
}

/* 

Os métodos get e set são métodos de acesso utilizados para recuperar (obter) e modificar (definir) os valores de atributos de uma classe, respectivamente. Esses métodos são parte do conceito de encapsulamento na programação orientada a objetos, permitindo um controle mais refinado sobre o acesso e modificação de dados.

Método get:

Um método get é usado para obter o valor atual de um atributo (geralmente privado) de uma classe.
O nome do método começa com "get" seguido pelo nome do atributo com a primeira letra em maiúscula.
Esse método retorna o valor atual do atributo.
Exemplo:


public class ExemploClasse {
    private int numero;

    // Método get para o atributo 'numero'
    public int getNumero() {
        return this.numero;
    }
}
Método set:

Um método set é usado para modificar o valor de um atributo (geralmente privado) de uma classe.
O nome do método começa com "set" seguido pelo nome do atributo com a primeira letra em maiúscula.
Esse método geralmente recebe um parâmetro que representa o novo valor a ser atribuído ao atributo.
Exemplo:

java
Copy code
public class ExemploClasse {
    private int numero;

    // Método set para o atributo 'numero'
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }
}
Usando esses métodos, você pode controlar como os atributos de uma classe são acessados e modificados por outras classes. O encapsulamento dessa maneira ajuda a garantir a consistência e integridade dos dados, facilita a manutenção do código e permite a implementação de lógica adicional, se necessário, durante a obtenção ou definição dos valores.


*/


