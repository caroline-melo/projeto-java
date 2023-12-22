package blackcat;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import blackcat.model.Produto;
import blackcat.model.ProdutoCachorro;



public class Menu {

	public static void main(String[] args) {
		
		// Teste da Classe Produto
				Produto c1 = new Produto(123, 5, "Areia", 50.0f);
				c1.visualizar();
				c1.addcart(1);
				c1.visualizar();
		
				
		// Teste da Classe Conta Corrente
				Produto c2 = new Produto(123, 5, "Areia", 50.0f);
				c1.visualizar();
				c1.addcart(3);
				c1.visualizar();
				
				
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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