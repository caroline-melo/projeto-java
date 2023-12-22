package blackcat.model;

public class ProdutoCachorro extends Produto {
	
	private int peso;

	public ProdutoCachorro(int sku, int quantidade, String produto, float preco, int peso) {
		super(sku, quantidade, produto, preco);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public boolean addcart(int peso) {
		if (this.getQuantidade() < peso ) {
			System.out.println("\n Quantidade insuficiente no estoque!");
			return false;
	 }
	
	 this.setQuantidade(this.getQuantidade() - peso);
	 return true;
}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quilos de produto em estoque: " + this.peso);}
}