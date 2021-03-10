import java.util.Scanner;
public class usuario {
    public static void main(String[] args) {
        String nome;
        int v1, v2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do Usuario");
        nome = ler.nextLine();
        System.out.println("Digite valor do raio de uma circunferência");
        int V1 = ler.nextInt();
        System.out.println("Digite o valor do diâmetro");
        int V2 =ler.nextInt();
        System.out.println("O programa retorna o valor do diâmetro e de 1 quadrante desta circunferência " + (V2 + V1));
    }
}
