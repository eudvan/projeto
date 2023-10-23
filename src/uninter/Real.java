package uninter;

public class Real extends Moeda {
	
	public Real(double valorIn) {
		this.valor = valorIn;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor){
			return false;
		}
		return true;
		
		
	}
	

}
