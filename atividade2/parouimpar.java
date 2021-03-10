import java.util.Scanner;
public class parouimpar {
    public static void main(String[] args) {
		int x = 0;
		
		while (x <= 100) {
			if(x % 2 == 0) {
				System.out.println(Integer.toString(x)+ "-Par");
			}else {
				System.out.println(Integer.toString(x)+ "-Impar");
			}
			x = x + 1;
		}
	}

}
