package cadastroproduto_tap1;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {
	private static List<Produto> produtos = new ArrayList<Produto>();

	public void salvar(Produto produto) {
		produtos.add(produto);
	}

	public List<Produto> getProduto() {
		return produtos;
	}
	
	
	
}
