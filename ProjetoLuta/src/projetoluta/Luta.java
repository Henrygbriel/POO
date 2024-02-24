 
package projetoluta;
import java.util.Random;
public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    Random aleatorio = new Random();
    
    public void marcarLuta(Lutador l1, Lutador l2){
        
       if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
           this.aprovada = true;
           this.desafiado = l1;
           this.desafiante = l2;
       }else{
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
           System.out.println("Luta invalida");
       }
    }
    
    public void lutar(){
        if(aprovada == true){
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                break;
                case 1:
                    System.out.println("Ganhou desafiado");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                break;
                case 2:
                    System.out.println("Ganhou desafiante");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                break;
            }
            
        }else{
            System.out.println("A luta nao pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
