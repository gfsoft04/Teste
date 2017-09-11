package br.com.gfsoft.locadorasucesso.model;

public class Fita {
	
	public enum Tipo {
        normal, lancamento, infantil
    };
    
    private Tipo codigoDePreco;

	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Tipo getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(Tipo codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }

}
