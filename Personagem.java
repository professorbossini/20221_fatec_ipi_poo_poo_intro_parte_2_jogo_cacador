public class Personagem{
    //byte, short, int, long, float, double: 0
    //char: \0
    //boolean: false
    //variáveis de referência (String, Personagem): null
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    private final static int LIMITE_SUPERIOR = 10;

    public Personagem (int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public Personagem (String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    void cacar(){
        if (this.energia >= 2){
            System.out.println(nome + " caçando...");
            this.energia = this.energia - 2;
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
        }
        this.fome = Math.min (this.fome + 1, LIMITE_SUPERIOR);
        this.sono = Math.min(this.sono + 1, LIMITE_SUPERIOR);
    }

    void comer(){
        if (this.fome >= 1){
            System.out.println(this.nome + " comendo...");
            this.fome -= 1;
            //this.energia += 1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR ? this.energia + 1 : this.energia;
        }
        else{
            System.out.printf("%s sem fome...\n", this.nome);
        }
    }

    void dormir(){
        if (this.sono >= 1){
            System.out.println(String.format(
                "%s dormindo...",
                this.nome
            ));
            this.sono -= 1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR ? this.energia + 1 : this.energia;
        }
        else{
            System.out.println (nome + " sem sono...");
        }
    }
}