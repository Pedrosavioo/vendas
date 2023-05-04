package vendas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantidadeVendedores, vendedor;
		System.out.print("Digite a quantidade de funcionários: ");
		quantidadeVendedores = input.nextInt();
		
		double valorTotalVendas = 0;
		double mediaVendas;
		double[] vendas = new double[quantidadeVendedores];
		double maiorVenda = 0;
		int maiorVendaVendedor = 0;
		
		
		for(int i = 0; i < vendas.length; i++) {
			vendedor= i + 1;
			System.out.printf("Vendedor %d vendeu: ", vendedor);
			vendas[i] = input.nextDouble();
			
			// Verificar quem fez a maior venda
			if(vendas[i] > maiorVenda) {
				maiorVenda = vendas[i];
				maiorVendaVendedor = i + 1;
			}
			
			// Somatória de todas as vendas...
			valorTotalVendas += vendas[i];
		}
		// Média de vendas...
		mediaVendas = valorTotalVendas / quantidadeVendedores;
		
		System.out.print("\n--------------------------------------------------");
		System.out.printf("%nMédia de vendas: %.2f%n%n", mediaVendas);
		for(int i = 0; i < vendas.length; i++) {
			vendedor= i + 1;
			System.out.println("Vendedor " + vendedor + ": " + vendas[i]);
		}
		System.out.print("\nObteve a maior venda foi o vendedor "+ maiorVendaVendedor +" totalizando: "+ maiorVenda);
		
	}

}
