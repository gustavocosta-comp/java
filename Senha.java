import java.util.Scanner;

public class Senha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String senha;
    String senhaCorreta = "1234";

    System.out.print("digite a senha: ");
    String senhaDigitada = sc.nextLine();

    boolean acessoPermitido = senhaDigitada.equals(senhaCorreta);

    if (acessoPermitido) {
      System.out.print("acesso permitido");
    } else {
      System.out.print("acesso negado");
    }

    sc.close();
  }
}
