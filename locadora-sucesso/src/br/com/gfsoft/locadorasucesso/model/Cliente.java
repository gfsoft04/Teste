package br.com.gfsoft.locadorasucesso.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
    private List<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aluguel> getFitasAlugadas() {
		return fitasAlugadas;
	}
	public void setFitasAlugadas(List<Aluguel> fitasAlugadas) {
		this.fitasAlugadas = fitasAlugadas;
	}
    
}
