import java.util.Scanner;

/**
 * nota
 */
public class nota {

 public static void main(String[] args) {
     String nome;
     double n1, n2, n3; 

     Scanner ler = new Scanner(System.in);
     //definição da saida dos dados
     System.out.println("Digite o nome");
     nome = ler.nextLine();
     System.out.println("Digite a n1");
     double N1 = ler.nextDouble();
     System.out.println("Digite a n2");
     double N2 = ler.nextDouble();
     System.out.println("Digite a n3");
     double N3 = ler.nextDouble();
     System.out.println("O peso da nota é:" + (N1 + N2 + N3));
     
}
}