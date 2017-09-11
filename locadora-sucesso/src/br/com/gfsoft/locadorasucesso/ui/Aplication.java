package br.com.gfsoft.locadorasucesso.ui;

import java.util.ArrayList;
import java.util.List;

import br.com.gfsoft.locadorasucesso.controller.AluguelController;
import br.com.gfsoft.locadorasucesso.model.Aluguel;
import br.com.gfsoft.locadorasucesso.model.Cliente;
import br.com.gfsoft.locadorasucesso.model.Fita;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		Fita fita = new Fita();
		fita.setTitulo("A lagoa azul");
		fita.setCodigoDePreco(Fita.Tipo.lancamento);
		
		Aluguel aluguel = new Aluguel(fita, 5);
		
		List<Aluguel> fitasAlugadas = new ArrayList<>();
		fitasAlugadas.add(aluguel);
				
		cliente.setNome("Jose");
		cliente.setFitasAlugadas(fitasAlugadas);
		
		AluguelController aluguelController = new AluguelController();
		
		System.out.println(aluguelController.extrato(cliente, fita));

	}

}
