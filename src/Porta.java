
public class Porta {
	
	private boolean aberta;
	private boolean fechada;
	private float abrindo, fechando;
	
	public void abre() {
		this.aberta = true;
		this.fechada = false;
	}
	
	public void fecha() {
		this.aberta = false;
		this.fechada = true;
	}
	
	public boolean permanentementeAberta() {
		return this.aberta;
	}
	

	public float getAbrindo() {
		return abrindo;
	}

	public void setAbrindo(float abrindo) {
		this.abrindo = abrindo;
	}

	public float getFechando() {
		return fechando;
	}


	public void setFechando(float fechando) {
		this.fechando = fechando;
	}
	
}