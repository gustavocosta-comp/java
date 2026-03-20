import java.util.Scanner;
public class Main {
    public static void main(String[]args ) {
        Scanner sc = new Scanner(System.in);
        int num, i;
        
        System.out.println("Diga um número: ");
        num = sc.nextInt();
        
        sc.nextLine();
        

        if(num%2==0) {
            System.out.println("O número é par" + num);
        }
        else {
            System.out.println("O número é impar" + num);
        }
        
        for(i=num;i<50;i++) {
            System.out.println("O número está chegando!!!" + i);
            System.out.println(i);
            
        }
        sc.close();

    }    
}
