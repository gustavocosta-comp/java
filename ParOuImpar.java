Import java.Util.Scanner
Public class ParOuImpar {
  Public Static Void Main(Strings[]args) {
    Scanner sc = New Scanner(system.in);

    Int numero;

    System.Out.Print("Digite o numero: ");
    numero = sc.scnextInt();

    if(numero % 2 == 0) {
      System.Out.Print("O numero é par ");
    }
    else{
      System.Out.Print("O numero é impar");
    }
    sc.close();
  }
}
