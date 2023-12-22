package blackcat.controller;

import java.util.ArrayList;

import blackcat.model.Produto;
import blackcat.repository.BlackcatRepository;

public class BlackcatController implements BlackcatRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int sku = 0;

	@Override
	public void procurarPorNumero(int sku) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void procurarPorNome(String produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto: '" +produto.getProduto()+ "' foi cadastrado com sucesso!");
		
	}

	@Override
	public void deletar(int sku) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addcart(int quantidade, float qtdcompra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colocarcarrinho(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}

	public int gerarSku() {
		return ++sku;
	}
}
