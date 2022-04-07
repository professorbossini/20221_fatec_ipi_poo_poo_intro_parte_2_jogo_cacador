import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception{
        Personagem cacador = new Personagem(10, 0, 0);
        Personagem soneca = new Personagem (2, 4, 10);
        Personagem guloso = new Personagem(4, 10, 2);
        cacador.setNome("Caçador");
        Random gerador = new Random();
        // 1: cacar
        // 2: comer
        // 3: dormir    

        while(true){
            int oQueFazer = + gerador.nextInt(3) + 1; //[1, 3]
            System.out.println(oQueFazer);
            //fall-through
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println("======================================");
            Thread.sleep(2000);
        }
        
        
        
        // // Personagem p1 = new Personagem();
        // // Personagem p2 = new Personagem();
        
        // // System.out.printf("%d %d", p1.energia, p2.energia);
        // // // Personagem p = new Personagem();
        // // // p.nome = "João";
        // // // p.cacar();
        // // // p.dormir();
        // // // p.comer(); 
        
        
    }
}
