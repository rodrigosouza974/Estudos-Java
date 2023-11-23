public class Personagem {
    String nome;
    int nivel; // Change 'Int' to 'int'
    int forca; // Change 'Int' to 'int'

    // métodos são com letras minúsculas
    // void = não retorna nada
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    void atacar(String inimigo) {
        System.out.format("%s atacou  %s e causou %d de dano", nome,inimigo, forca);
}
}
