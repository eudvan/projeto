package uninter;

public class Dolar extends Moeda {
	
	public Dolar(double valorIn) {
		this.valor = valorIn;
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor * 4.8;
	}
	
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor){
			return false;
		}
		return true;
		
		
	}

}
