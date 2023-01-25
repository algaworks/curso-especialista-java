import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal2 {

	public static void main(String[] args) {
		var produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
		produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
		produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
		produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
		produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

//		produtos.sort(Comparator.comparingInt(produto -> produto.getQuantidade()));
		produtos.sort(Comparator.comparingInt(Produto::getQuantidade));

//		produtos.forEach(produto -> produto.inativar());
		produtos.forEach(Produto::inativar);

		produtos.forEach(produto -> System.out.println(produto));
	}
	
}