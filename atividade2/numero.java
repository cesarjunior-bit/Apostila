import java.util.Scanner;

/**
 * numero
 */
public class numero {
    double numero;
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o número: ");
        double numero = ler.nextDouble();

        if(numero >= 0){
            System.out.println("Inteiro: ");
        }else{
            System.out.println("Negativo: ");
        }
    }
}