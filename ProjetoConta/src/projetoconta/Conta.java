
package projetoconta;

public abstract class Conta {
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor){
        saldo = saldo - valor;
    }
    
    void depositoConta(double valor){
        saldo = saldo + valor;
    }
    
    Conta(){
        saldo = 100.00;
    }
}
