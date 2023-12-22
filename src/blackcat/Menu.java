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
		
		int opcao, sku, quantidade,tipo;
		float preco, peso;
		String produto;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Black Cat Pet Store                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Ver produtos                         ");
			System.out.println("            2 - Adicionar produtos ao carrinho    	 ");
			System.out.println("            3 - Ver carrinho						 ");
			System.out.println("            4 - Ver estoque                          ");
			System.out.println("            5 - Cadastrar novo produto               ");
			System.out.println("            6 - Excluir produto                      ");
			System.out.println("            7 - Sair                                 ");
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

			if (opcao == 7) {
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
				System.out.println("Adicionar produto ao carrinho");
				
			
				keyPress();				
				break;
			case 3:
				System.out.println("Ver carrinho");
				keyPress();				
				break;
			case 4:
				System.out.println("Ver estoque ");
				
				keyPress();				
				break;
			case 5:
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
				
			case 6:
				System.out.println("Excluir produto");
				
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