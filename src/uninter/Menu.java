package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sn;
	private Cofrinho cofrinho;
	
	 
	public Menu() {
		sn = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	public void mostrarMenuPrincipal() {
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover moeda:");
		System.out.println("3-Listar moedas:");
		System.out.println("4-Calcular valor total convertido para real:");
		System.out.println("0-Encerrar");
		
		String opcaoSelecionada = sn.next();
		
		switch (opcaoSelecionada) {
			case "0":
				System.out.println("Encerrando sistema");
				break;
				
			case "1":
				mostrarSubMenuAdicionarMoedas();
				//vai chamar o menu principal novamente
				mostrarMenuPrincipal();
				break;
				
			case "2":
			mostrarSubMenuRemoverMoedas();
			mostrarMenuPrincipal();
			break;
				
			case "3":
				cofrinho.listagemDeMoedas();
				mostrarMenuPrincipal();
				break;
				
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				String valorEmTextoConvertido = String.format("%.2f", valorTotalConvertido);
				valorEmTextoConvertido = valorEmTextoConvertido.replace(".", ",");
				System.out.println("total convertido para real? " + valorTotalConvertido);
				mostrarMenuPrincipal();
				break;
				
			default:
				System.out.println("Opção invalida");
				mostrarMenuPrincipal();
				break;
		}
	}
	//caso 1 e 2 foi coloado em baixo para ter uma organização melhor.
	private void mostrarSubMenuAdicionarMoedas() {
		System.out.println("Escolha Moeda:");
		System.out.println("1- Real:");
		System.out.println("2- Dólar:");
		System.out.println("3- Euro:");
		
		int opcaoDeMoeda = sn.nextInt();
		
		System.out.println("Digite o Valor: ");
		
		String valorMoedaEmTexto = sn.next();
		
		
		valorMoedaEmTexto = valorMoedaEmTexto.replace(",", ".");
		double ValorMoeda = Double.parseDouble(valorMoedaEmTexto);
		
		Moeda moeda = null;
				
		if (opcaoDeMoeda == 1) {
			moeda = new Real(ValorMoeda);
		} else if(opcaoDeMoeda == 2) {
			moeda = new Dolar(ValorMoeda);
		} else if(opcaoDeMoeda == 3) {
			moeda = new Euro(ValorMoeda);
		} else {
			//dará um retorno ao usuario
			System.out.println("Essa moeda não existe! Favor, escolha a moeda correta!");
			mostrarMenuPrincipal();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada!");
	}
	
	private void mostrarSubMenuRemoverMoedas() {
		System.out.println("Escolha Moeda:");
		System.out.println("1- Real:");
		System.out.println("2- Dólar:");
		System.out.println("3- Euro:");
		
		int opcaoDeMoeda = sn.nextInt();
		
		System.out.println("Digite o Valor: ");
		
		String valorMoedaEmTexto = sn.next();
		
		
		valorMoedaEmTexto = valorMoedaEmTexto.replace(",", ".");
		double ValorMoeda = Double.parseDouble(valorMoedaEmTexto);
		
		Moeda moeda = null;
				
		if (opcaoDeMoeda == 1) {
			moeda = new Real(ValorMoeda);
		} else if(opcaoDeMoeda == 2) {
			moeda = new Dolar(ValorMoeda);
		} else if(opcaoDeMoeda == 3) {
			moeda = new Euro(ValorMoeda);
		} else {
			//dará um retorno ao usuario
			System.out.println("Essa moeda não existe! Favor, escolha a moeda correta!");
			mostrarMenuPrincipal();
		}
		
		cofrinho.remover(moeda);
	}

}
