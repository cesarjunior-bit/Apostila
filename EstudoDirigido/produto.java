import  java.util.Scanner ;
public class produto 
{

public static void main(String[] args) 
{
Scanner ler = new Scanner (System.in);
String livro;
double valor;
System.out.println ("Digite o Titílo do livro: ");
livro =ler.nextLine();         
        
System.out.println("Digite o preço do livro: ");
valor = ler.nextDouble();

System.out.println("¨¨Verificando o desconto: ¨¨");
System.out.println("Livro " + livro + "recebeu o deconto") ;
System.out.println("Preço riginal: " + valor + "\n" + "Com desconto de 2,5%: " + valor/02.5 );       
}

public int codigo;

public void setDescProd(String nextLine) {
}

public void setQuantidade(int nextInt) {
}

public void setPreco(float nextFloat) {
}

public void ListarDados() {
}

public char[] calcularValorFinal() {
    return null;
}  
}