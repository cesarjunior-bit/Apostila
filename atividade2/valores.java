import java.util.Scanner;
public class valores {
    int A,B;
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Digite o Primeiro valor: ");
    int A = ler.nextInt();
    System.out.println("Digite o segundo valor: ");
    int B = ler.nextInt();
    if(A >= B){
        System.out.println("São iguais: ");
    }else{
        System.out.println("São diferentes: ");
    }

} 
}
