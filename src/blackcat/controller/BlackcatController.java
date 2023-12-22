package blackcat.controller;

import java.util.ArrayList;

import blackcat.model.Produto;
import blackcat.repository.BlackcatRepository;

public class BlackcatController implements BlackcatRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int sku = 0;

	@Override
	public void procurarPorNumero(int sku) {
		var produto = buscarNaCollection(sku);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto: '"+produto+"' não foi encontrado");
		
	}

	@Override
	public void procurarPorNome(String produto) {
		var sku = buscarNaCollection(produto);
		
		if (sku != null)
			sku.visualizar();
		else
			System.out.println("\nO produto: '"+produto+"' não foi encontrado");
		
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
		var produto = buscarNaCollection(sku);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto '"+produto.getProduto()+"' foi deletado com sucesso.");
		}else
			System.out.println("\nO produto '"+produto.getProduto()+"' não foi encontrado" );
		
	}

	@Override
	public void addcart(int quantidade, float qtdcompra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisEstoque(int sku, int novaQuantidade) {
		var produto = buscarNaCollection(sku);
		
		if (produto != null) {
			produto.maisEstoque(novaQuantidade);
			System.out.println("\nAdição de novos '"+produto.getProduto()+"' foi efetuado com sucesso.");
		}else
			System.out.println("\nO produto '"+produto.getProduto()+"' não foi encontrado");
	}	
		
	@Override
	public void colocarcarrinho(int numeroOrigem, int numeroDestino, float valor) {
		
		
	}

	public int gerarSku() {
		return ++sku;
	}
	
	public Produto buscarNaCollection(int sku) {
		for (var produto : listaProdutos) {
			if (produto.getSku() == sku) {
				return produto;
			}
		}
		return null;
		}
	
	public Produto buscarNaCollection(String produto) {
		for (var sku : listaProdutos) {
			if (sku.getProduto() == produto) {
				return sku;
			}
		}
		return null;
		}
}
