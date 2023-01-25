import com.algaworks.estoque.Produto;

import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
//		Function<String, Produto> function = nome -> new Produto(nome);
		Function<String, Produto> function = Produto::new;
		Produto produto = function.apply("Arroz");

		System.out.println(produto);
	}
	
}