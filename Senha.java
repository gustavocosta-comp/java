import java.util.scanner;
public class Senha {
  public static void main(strings[]args ){

  scanner sc = new scanner(system.in);
    
    string senha;
    string senhaCorreta ="1234";

  system.out.print("digite a senha:");
  string senhaDigitada = sc.nextLine();

    boolean acessoPermitido = senhaDigitada.equals(senhaCorreta);

    if (acesso permitido) {
      system.out.print("acesso permitido");
    }else{
      system.out.print("acesso negado");
    }

    sc.close();
  }
}
    
