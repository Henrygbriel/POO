package projetoconta;

import java.util.Scanner;

public class DigitaContaPoupanca {
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        ContaPoupanca cp;
        
        do{
            cp = new ContaPoupanca();
            System.out.println("Cadastro em Poupança \t\t\t\t DigitaConta.Java\n");
            System.out.print("Numero da conta: ");
            cp.numeroConta = tc.nextInt();
            
            if(cp.numeroConta != 0){
                System.out.print("Digite o numero do cliente: ");
                cp.numeroCliente = tc.nextInt();

                System.out.print("Data de abertura da conta: ");
                cp.dataAbertura = tc.next();

                System.out.print("Data de aniversario: ");
                cp.datasAniversarios = tc.next();
                              
                System.out.print("Digite o valor do deposito: ");
                cp.depositoConta(tc.nextDouble());
                
                System.out.print("Valor do saque: ");
                cp.saqueConta(tc.nextDouble());
                
                System.out.println("Valor do saldo: " + cp.saldo + "\n\n\n");
            }
            
        }while(cp.numeroConta != 0);
       
    }
}
