package blackcat;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import blackcat.model.Produto;
import blackcat.model.ProdutoCachorro;
import blackcat.controller.BlackcatController;


public class Menu {

	public static void main(String[] args) {
		BlackcatController produtos = new BlackcatController();				
					
		Scanner leia = new Scanner(System.in);
		
		int opcao, sku, quantidade,tipo, novaQuantidade;
		float preco, peso;
		String produto;
		
		System.out.println("Criar primeiros produtos:");
		//produtos.gerarSku(), quantidade, produto, preco, peso
		ProdutoCachorro pc1 = new ProdutoCachorro(produtos.gerarSku(), 15, "Areia", 45, 0);
		produtos.cadastrar(pc1);
		ProdutoCachorro pc2 = new ProdutoCachorro(produtos.gerarSku(), 10, "Catnip", 20, 0);
		produtos.cadastrar(pc2);
		ProdutoCachorro pc3 = new ProdutoCachorro(produtos.gerarSku(), 5, "Brinquedo", 5, 0);
		produtos.cadastrar(pc3);
		ProdutoCachorro pc4 = new ProdutoCachorro(produtos.gerarSku(), 2, "Caminha", 2, 0);
		produtos.cadastrar(pc4);
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Black Cat Pet Store                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Ver todos os produtos                ");
			System.out.println("            2 - Procurar produtos por sku         	 ");
			System.out.println("            3 - Procurar produtos por nome         	 ");
			System.out.println("            4 - Adicionar produtos ao carrinho    	 ");
			System.out.println("            5 - Ver carrinho						 ");
			System.out.println("            6 - Ver estoque                          ");
			System.out.println("            7 - Incluir compras no estoque           ");
			System.out.println("            8 - Cadastrar novo produto               ");
			System.out.println("            9 - Excluir produto                      ");
			System.out.println("            10 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 10) {
				System.out.println("\nEsperamos que o gato preto da sorte cruze o seu caminho!");
				sobre();
                 		leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println("Ver produtos");
				produtos.listarTodas();
							
				keyPress();
				break;
				
				
			case 2:
				System.out.println("Procurar produto por SKU");
				
				System.out.println("Digite o sku do produto:");
				sku = leia.nextInt();
				
				produtos.procurarPorNumero(sku);
			
				keyPress();				
				break;
				
			case 3:
				System.out.println("Procurar produto por nome");
				
				System.out.println("Digite o nome do produto:");
				produto = leia.nextLine();
				
				//sku.procurarPorNome(produto);
			
				keyPress();				
				break;
				
			case 4:
				System.out.println("Adicionar produto ao carrinho");
				
			
				keyPress();				
				break;
				
			case 5:
				System.out.println("Ver carrinho");
				keyPress();				
				break;
				
			case 6:
				System.out.println("Ver estoque ");
				
				keyPress();				
				break;
				
			case 7:
				System.out.println("Adicionar compras ao estoque ");
				
				do {
					System.out.println("É cliente ou colaborador (1-cliente | 2-colaborador):");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				switch(tipo) {
				case 1 -> {
					System.out.println("Não possui acesso para esta ação.");
				}
				
				case 2 -> {
				System.out.println("Digite o SKU do produto:");
				sku = leia.nextInt();
				
				do {
					System.out.println("Digite a quantidade a ser adicionada ao estoque existente: ");
					novaQuantidade = leia.nextInt();
					
				}while(novaQuantidade <=0);
				produtos.maisEstoque(sku, novaQuantidade);
				
				}
				}
				
				keyPress();				
				break;
				
			case 8:
				System.out.println("Cadastrar novo produto");
				
				
				do {
					System.out.println("É cliente ou colaborador (1-cliente | 2-colaborador):");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				switch(tipo) {
				case 1 -> {
					System.out.println("Não possui acesso para esta ação.");
				}
				case 2 -> {
					System.out.println("Digite o nome do produto:");
					leia.skip("\\R?");
					produto = leia.nextLine();
					System.out.println("Digite o valor de venda:");
					preco = leia.nextFloat();
					System.out.println("Digite a quantidade:");
					quantidade = leia.nextInt();
					produtos.cadastrar(new ProdutoCachorro(produtos.gerarSku(), quantidade, produto, preco, 0));
				}
				
				}
				
						
				keyPress();
				break;
				
			case 9:
				System.out.println("Excluir produto");
				
				System.out.println("\nDigite o número do produto: ");
				sku = leia.nextInt();
				
				produtos.deletar(sku);
				
				keyPress();
				break;
				
			default:
				System.out.println("\nOpção Inválida" );
				
				keyPress();
				break;
			}

	}

}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Caroline Prado de Melo");
		System.out.println("caroline.pmelo@outlook,com");
		System.out.println("github.com/caroline-melo");
		System.out.println("*********************************************************");

	}
	
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

}
}}