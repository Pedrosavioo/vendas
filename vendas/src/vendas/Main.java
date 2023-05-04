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
		
		
		for(int i = 0; i < vendas.length; i++) {
			vendedor= i + 1;
			System.out.printf("Digite quanto o vendedor %d vendeu: ", vendedor);
			vendas[i] = input.nextDouble();
			
			// Somatória de todas as vendas...
			valorTotalVendas += vendas[i];
		}
		// Média de vendas...
		mediaVendas = valorTotalVendas / quantidadeVendedores;
		
		System.out.print("\n--------------------------------------------------");
		System.out.printf("%nMedia de vendas: %.2f%n%n", mediaVendas);
		for(int i = 0; i < vendas.length; i++) {
			vendedor= i + 1;
			System.out.println("Vendedor " + vendedor + ": " + vendas[i]);
		}
	}

}
