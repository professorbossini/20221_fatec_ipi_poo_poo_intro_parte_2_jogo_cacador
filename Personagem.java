public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar(){
        System.out.println(nome + " caçando...");
    }

    void comer(){
        System.out.printf("%s comendo...\n", nome);
    }

    void dormir(){
        System.out.println(String.format(
            "%s dormindo...",
            nome
        ));
    }
}