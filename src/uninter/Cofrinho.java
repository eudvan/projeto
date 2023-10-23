package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaDeMoedas;
	
	public Cofrinho() {
		
		this.listaDeMoedas = new ArrayList<>();
		
	}
	
	public void adicionar(Moeda moeda) {
		this.listaDeMoedas.add(moeda);	
	}
	public void remover(Moeda moeda) {
		this.listaDeMoedas.remove(moeda);
	}
	
	
	public void listagemDeMoedas() {
		
		if (this.listaDeMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho");
		}
		for (Moeda moeda : this.listaDeMoedas) {
			moeda.info();
			
		}
		
	}

	public double totalConvertido() {
		
		if (this.listaDeMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaDeMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
		
	}
}
