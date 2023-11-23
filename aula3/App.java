public class App {
    public static void main(String[] args) throws Exception {
        // Your code here
        Personagem heroi = new Personagem();

        heroi.nome = "rodrigo";
        heroi.nivel = 20;
        heroi.forca = 400;

        heroi.mostrarStatus();
        heroi.atacar("Monstro");
    }
}
