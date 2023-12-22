package blackcat.repository;

import blackcat.model.Produto;

public interface BlackcatRepository {

	// CRUD dos Produtos
		public void procurarPorNumero(int sku);
		public void procurarPorNome (String produto);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void deletar(int sku);
		
		// Ações possíveis
		public void addcart(int quantidade, float qtdcompra);
		public void colocarcarrinho(int numeroOrigem, int numeroDestino, float valor);
		
}
