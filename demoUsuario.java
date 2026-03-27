import java.util.Scanner;
public class demoUsuario {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     Usuario user = new Usuario();
     
    
    System.out.println("Diga o seu nome: ");
        user.setNome(sc.nextLine());
        
    if(user.eAutorizado() ){
        System.out.println("Bem vindo ao sistema + user.getNome() + acesso liberado");
    }
    else {
        System.out.println("ALERTA!! + user.getNome() + acesso negado");
        System.out.println("USUÁRIO BANIDO DO SISTEMA!");
    }
     sc.close();
        
    }
}
