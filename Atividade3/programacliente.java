import java.util.Scanner;

public class programacliente {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    cliente p1 = new cliente();
    System.out.println("Informe o Nome: ");
    p1.nome = ler.nextLine();
    System.out.println("Digite a idade: ");
    p1.setidade(ler.nextInt());
    System.out.println("Digite a renda: ");
    p1.setrenda(ler.nextDouble());
    //configuração da saída
    System.out.println("Visualiando dados!");
    //concatenar dado público da classe = instancia da classe.nome do atributo
    System.out.println("Nome: " + p1.nome);
    //concatenar dado privado da classe = instancia da classe.método get do atributo
    System.out.println("Idade: " + p1.getidade());
    System.out.println("Renda: " + p1.getrenda());
}
}
