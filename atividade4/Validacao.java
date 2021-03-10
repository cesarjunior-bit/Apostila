

public class Validacao {
	
	public static void notNull(Object value, String field) {
		if (value == null) {
			throw new RuntimeException("Campo " + field +" � obrigatorio");
		}
	}
	
	public void alugado(boolean alugado) {
		if (alugado == true) {
			System.out.println("Livro alugado");
		}else {
			System.out.println("Livro disponivel");
		}
	}

}
