package cadastroproduto_tap1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ProdutoController"})
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GerenciadorProduto gp = new GerenciadorProduto();
		List<Produto> produtos = gp.getProduto();
		
		request.setAttribute("produtos", produtos);
		
		RequestDispatcher rd = request.getRequestDispatcher("produto.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id1 = request.getParameter("id");
		String descricao = request.getParameter("descricao");
		String valor1 = request.getParameter("valor");
		
		int id = Integer.parseInt(id1);
		double valor = Double.parseDouble(valor1);
		
		Produto produto = new Produto();
		produto.setId(id);
		produto.setDescricao(descricao);
		produto.setValor(valor);
		
		GerenciadorProduto gp = new GerenciadorProduto();
		gp.salvar(produto);
		
		
	}

}
