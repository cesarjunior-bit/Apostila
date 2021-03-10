import java.util.Scanner;
public class variavelA {

    public static void main(String[] args) {
        int a1, a2, a3, a4, a5;
        Scanner ler = new Scanner(System.in);
        System.out.println("o dobro de A");
        int A1 = ler.nextInt();
        System.out.println("o triplo do dobro de  A");
        int A2 = ler.nextInt();
        System.out.println("a metade do triplo do dobro de A");
        int A3 = ler.nextInt();
        System.out.println("o quadrado da variável A");
        int A4 = ler.nextInt();
        System.out.println("a quinta parte do dobro de A");
        int A5 = ler.nextInt();
        System.out.println("O dobro de A é" + (A1 + A2));
        System.out.println("O triplo de A é" + (A1 + A2 + A3));
        System.out.println("A metade de A é" + (A1 % A2));
        System.out.println("O quadrado da variável A é" + (A1*A2));
        System.out.println("A quinta parte do dobro de A é" + A1 + A2 + A3 + A4 + A5);

    }
}
