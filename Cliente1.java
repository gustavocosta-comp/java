import java.util.Scanner;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cliente;
        float pagamento;
        
        System.out.println("Nome do cliente: ");
            cliente = sc.nextLine();
        System.out.println("Pagamento: ");
            pagamento = sc.nextFloat();

        System.out.println("Cliente: " + cliente +" - Valor: " + pagamento);

        sc.close();
            
        
    }
}
