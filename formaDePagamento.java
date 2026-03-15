import java.util.Scanner;
public class Main {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        
        String cliente, formaDePagamento;
        float valor;
        
        System.out.println("Digite o seu nome:");
            cliente = sc.nextLine();
        System.out.println("Valor a ser pago:");
            valor = sc.nextFloat();
        
        sc.nextLine();
        
        System.out.println("Diga a forma de pagamento(cartao,especie ou pix):");
             formaDePagamento = sc.nextLine();
             
        
        if (formaDePagamento.equals("especie")) {
            System.out.println("Pagamento em especie processado.");
        }
       
        else if (formaDePagamento.equals("cartao")) {
            System.out.println("Pagamento em cartao processado.");
        }
        else if (formaDePagamento.equals("pix")) {
            System.out.println("Pagamento em pix processado.");
        }
        else {
            System.out.println("Forma de pagamento inválida.");
        }
        
        
        
           
        sc.close();
}
}        
