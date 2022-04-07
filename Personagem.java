public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;
    final static int LIMITE_SUPERIOR = 10;
    

    void cacar(){
        if (this.energia >= 2){
            System.out.println(nome + " caçando...");
            this.energia = this.energia - 2;
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
        }
        this.fome = Math.min (this.fome + 1, 10);
        this.sono = Math.min(this.sono + 1, 10);
    }

    void comer(){
        if (this.fome >= 1){
            System.out.println(this.nome + " comendo...");
            this.fome -= 1;
            //this.energia += 1;
            this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
        }
        else{
            System.out.printf("%s sem fome...\n", nome);
        }
    }

    void dormir(){
        System.out.println(String.format(
            "%s dormindo...",
            this.nome
        ));
    }
}