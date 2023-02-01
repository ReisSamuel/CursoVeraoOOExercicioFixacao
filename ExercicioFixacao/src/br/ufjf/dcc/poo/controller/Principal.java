package br.ufjf.dcc.poo.controller;

import javax.sql.rowset.CachedRowSet;

import br.ufjf.dcc.poo.model.Automovel;
import br.ufjf.dcc.poo.model.Caminhao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Automovel automovel = new Automovel();
        automovel.setMarca("Mercedes");
        automovel.setKmPorLitro(15f);
        automovel.setCapacidadeTanque(55);
        System.out.println("Valor do consumo do automovel: "+ automovel.calcularConsumo(5.11f));
        
        Caminhao caminhao = new Caminhao();
        caminhao.setMarca("Volvo");
        caminhao.setKmPorLitro(13);
        caminhao.setCapacidadeTanque(100);
        caminhao.setTara(1500);
        System.out.println("Valor do consumo do caminhao: "+ caminhao.calcularConsumo(5.11f));
	}

}
