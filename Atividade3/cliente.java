

/**
 * cliente
 */
public class cliente {
    public String nome;
    private int idade;
    private double renda;
    
    public String getnome(){
        return nome;
      }         
    public void setnome(String nome){
        this.nome = nome;
    }
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public double getrenda(){
        return renda;
    }
    public void setrenda(double renda){
        this.renda = renda;
    }
    
    }