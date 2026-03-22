import java.util.Scanner;
public class Aprovacao{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nome;
		double n1,n2,media;
		
		System.out.println("Diga o nome: ");
		nome = sc.nextLine();
		System.out.println("digite a nota 1:  ");
		n1 = sc.nextDouble();
		System.out.println("Digite a nota 2:  ");
		n2 = sc.nextDouble();
		
	    sc.nextLine();
	    
	    media = (n1+n2)/2;
	    
	    if(media>7.0){
	        System.out.println("Aluno(a) passou " + nome);
	    }
	    else if(media<7.0 && media>=5.0){
	        System.out.println("Aluno(a) deverá fazer a prova final " + nome);
	    }
	    else {
	        System.out.println("Aluno(a) repetiu essa matéria " + nome );
	    }
	    sc.close();
	        
	}
}
