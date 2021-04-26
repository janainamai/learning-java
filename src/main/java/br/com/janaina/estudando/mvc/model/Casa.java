package br.com.janaina.estudando.mvc.model;

public class Casa {
	private String enderešo;
	private int numero;
	private boolean temAlarme;

	public Casa() {
	}

	public Casa(String enderešo, int numero, boolean temAlarme) {
		this.enderešo = enderešo;
		this.numero = numero;
		this.temAlarme = temAlarme;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isTemTelhado() {
		return temAlarme;
	}

	public void setTemAlarme(boolean temAlarme) {
		this.temAlarme = temAlarme;
	}

}
