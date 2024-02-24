
package projetoconta;

import java.util.Scanner;


public class ProjetoConta {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        ContaPoupanca cp = new ContaPoupanca();
        System.out.println("Cadastro conta poupanca");
        System.out.println("Numero da conta:");
        cp.numeroConta = ler.nextInt();
        System.out.println("Numero cliente:");
        cp.numeroCliente = ler.nextInt();
        System.out.println("data de abertura:");
        cp.dataAbertura = ler.next();
        System.out.println("Valor do deposito");
        cp.depositoConta(ler.nextDouble());
        System.out.println("Valor do saque");
        cp.saqueConta(ler.nextDouble());
        System.out.println("Valor atualizado do saldo na poupanca" + cp.saldo);
        
        ContaCorrente cc = new ContaCorrente();
        System.out.println("Cadastro em Conta corrente");
        System.out.println("Numero conta");
        cc.numeroConta = ler.nextInt();
        System.out.println("Numero cliente:");
        cc.numeroConta = ler.nextInt();
        System.out.println("data de abertura:");
        cc.dataAbertura = ler.next();
        System.out.println("Limite de credito");
        cc.limite = ler.nextDouble();
        System.out.println("Taxa mensal");
        cc.taxaMensal = ler.nextDouble();
        System.out.println("Valor do deposito");
        cc.depositoConta(ler.nextDouble());
        System.out.println("Valor atualizado do saldo na corrente" + cc.saldo);
        
    }
    
}
