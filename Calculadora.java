import java.Util.Scanner;
public class Calculadora{
  public static void main(Strings[]args) {
  Scanner sc = new Scanner(System.in);

    Float num1, num2, result;
    char operacao;

    System.Out.Print("Digite o 1 número: ");
    num1 = sc.nextfloat();

    System.Out.Print("Digite o 2 número: ");
    num2 = sc.nextfloat();

    System.Out.Print("Digite a operacao: ");
    operacao = sc.next().charArt(0);

    Switch(operacao) {
      case'+': {
        result = num1 + num2;
      System.Out.Print("Resultado :" +reseult);
      break;
     }
     case'-': {
        result = num1 - num2;
      System.Out.Print("Resultado :" +reseult);
      break;
     }
     case'*': {
        result = num1 * num2;
      System.Out.Print("Resultado :" +reseult);
      break;
     }
     case'/':{
        result = num1 / num2;
      System.Out.Print("Resultado :" +reseult);
      break;
     }
      else{
        System.Out.Print("erro : divisao por zero!");
      }
      break;
      default;
         System.Out.Print("Operador invalido!");
      }
    sc.close();
  }
}
  
        


  
