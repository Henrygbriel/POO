
package projetoconta;

import java.util.Scanner;


public class DigitaContaCorrente {

    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ContaCorrente cc;
        
        do{
            cc = new ContaCorrente();
            System.out.println("Cadastro em Corrente \t\t\t\t DigitaConta.Java\n");
            System.out.print("Numero da conta: ");
            cc.numeroConta = tc.nextInt();
            
            if(cc.numeroConta != 0){
                System.out.print("Digite o numero do cliente: ");
                cc.numeroCliente = tc.nextInt();

                System.out.print("Data de abertura da conta: ");
                cc.dataAbertura = tc.next();
                   
                System.out.print("Digite o codigo do gerente: ");
                cc.gerente = tc.nextInt();
                
                System.out.print("Limite de credito: ");
                cc.limite = tc.nextDouble();
                
                System.out.print("Digite o valor da taxa mensal: ");
                cc.taxaMensal = tc.nextDouble();
                
                System.out.print("Digite o valor do deposito: ");
                cc.depositoConta(tc.nextDouble());
                
                System.out.print("Valor do saque: ");
                cc.saqueConta(tc.nextDouble());
                
                System.out.println("Valor do saldo: " + cc.saldo + "\n\n\n");
            }
            
        }while(cc.numeroConta != 0);
    }
    
}
