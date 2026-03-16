import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        String nome;
        float n1,n2,media;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Diga a primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("Diga a segunda nota: ");
        n2 = sc.nextFloat();
        
        sc.nextLine();
        
        media=(n1+n2)/2;
            System.out.println("A media aritimetica do aluno ou aluna" );
                System.out.println(media);
        
    sc.close();
        
}
}
