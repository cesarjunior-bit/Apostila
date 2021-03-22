import java.util.Scanner;
public class main {
   public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       aluno a1 = new aluno();
       System.out.println("digita o nome do aluno: ");
       a1.nome = ler.nextLine();
       System.out.println("digite a nota 1: ");
       a1.nota1 = ler.nextDouble();
       System.out.println("digita a nota 2: ");
       a1.nota2 = ler.nextDouble();
       System.out.println("\nRESPOSTAS:");
       System.out.println("Aluno: "+a1.nome);
       System.out.println("Nota1: "+a1.nota1);
       System.out.println("Nota2: "+a1.nota2);
       System.out.println("Media "+a1.calcularMedia());
   } 
}
