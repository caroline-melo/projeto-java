package blackcat.model;

public abstract class Produto {
	
	private int sku;
	private int quantidade;
	private String produto;
	private float preco;

	
	public Produto(int sku, int quantidade, String produto, float preco) {
		this.sku = sku;
		this.quantidade = quantidade;
		this.produto = produto;
		this.preco = preco;
	}


	public int getSku() {
		return sku;
	}


	public void setSku(int sku) {
		this.sku = sku;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	

	public boolean addcart(int qtdcompra) {
		if (this.getQuantidade() < qtdcompra ) {
			System.out.println("\n Quantidade insuficiente no estoque!");
			return false;
	 }
	
	 this.setQuantidade(this.getQuantidade() - qtdcompra);
	 return true;
	}
	
	public void visualizar () {
		
		String tipo = "";
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("SKU do produto: " + this.sku);
		System.out.println("Produto: " + this.produto);
		System.out.println("Preço: " + this.preco);
		System.out.println("Quantidade em estoque: " + this.quantidade);
		
	}

}
