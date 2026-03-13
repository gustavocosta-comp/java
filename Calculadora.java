import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float num1, num2, result;
        char operacao;

        System.out.print("Digite o 1 numero: ");
        num1 = sc.nextFloat();

        System.out.print("Digite o 2 numero: ");
        num2 = sc.nextFloat();

        System.out.print("Digite a operacao (+ - * /): ");
        operacao = sc.next().charAt(0);

        switch (operacao) {

            case '+':
                result = num1 + num2;
                System.out.print("Resultado: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.print("Resultado: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.print("Resultado: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.print("Erro: divisao por zero!");
                } else {
                    result = num1 / num2;
                    System.out.print("Resultado: " + result);
                }
                break;

            default:
                System.out.print("Operador invalido!");
        }

        sc.close();
    }
}
        


  
