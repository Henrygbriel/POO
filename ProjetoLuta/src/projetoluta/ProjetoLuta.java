
package projetoluta;

public class ProjetoLuta {

   
    public static void main(String[] args) {
        
        Lutador lutador[] = new Lutador[6];
        
        lutador[0] = new Lutador("Pretty Boy", "Fance", 31, 1.75, 
                                 68.9, "Leve", 11, 2, 1);
        
        lutador[1] = new Lutador("Puts Script", "Brasil", 29, 1.68,
                                 57.8, "Leve", 14, 2, 3);
        
        lutador[2] = new Lutador("Snap Shadow", "EUA", 35, 1.65, 
                                 80.9, "Medio", 12, 2, 1);
        
        lutador[3] = new Lutador("Dead Code", "Australia", 28, 1.93,
                                 81.6, "Medio", 13, 0, 2);
        
        lutador[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 
                                 119.3, "Pesado", 5, 4, 3);
        
        lutador[5] = new Lutador("Nerdat", "EUA", 30, 1.81, 
                                 105.3, "Pesado", 12, 2, 4);
        
        
        System.out.println(lutador[0]);
       
        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[5]);
        luta.lutar();
        
        lutador[0].status();
        lutador[5].status();
        
    }
    
    
}
