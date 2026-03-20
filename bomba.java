import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num,i;
	    System.out.println("Digite um número para a ativação da bomba: ");
	    num = sc.nextInt();

        sc.nextLine();
    
        for(i = num; i > 0; i--) {
            System.out.println("A bomba irá explodir em....." + i);
                System.out.print(i);
        }
    sc.close();
    
	}
}
