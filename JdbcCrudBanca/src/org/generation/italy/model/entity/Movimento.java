package org.generation.italy.model.entity;

public class Movimento {

	int idMovimento, importo;
	String tipoOperazione, iban;
	//int dataOperazione;
	
	public Movimento(int idMovimento, int importo, String tipoOperazione, String iban) {
		super();
		this.idMovimento = idMovimento;
		this.importo = importo;
		this.tipoOperazione = tipoOperazione;
		this.iban = iban;
	}

	public Movimento(int importo) {
		super();
		this.importo = importo;
		
	}

	@Override
	public String toString() {
		return "Movimento [idMovimento=" + idMovimento + ", importo=" + importo + ", tipoOperazione=" + tipoOperazione
				+ ", iban=" + iban + "]";
	}
	
	
	
	
}
