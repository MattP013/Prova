package bll;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import modal.Escritor;

import modal.Auxiliar;
public class Comparar {

	public void Verificar(ArrayList<Auxiliar> Ver) {
		ArrayList<Escritor> escreve = new ArrayList<Escritor>();
		
		double resultado;
		for(Auxiliar view : Ver) 
		{

			Escritor ES = new Escritor();
			if(view.getID_PRECO() == view.getPRECO_ID())
			{
				if(view.getNU_PRAZO_DIAS_CORRIDOS() != 0)
				{
					resultado = view.getVL_PRECO() * view.getQUANTIDADE();
					ES.setResultado(Double.toString(resultado));
					ES.setSUBPRODUTO(view.getNM_SUBPRODUTO());
					escreve.add(ES);
				}
				else
				{
					ES.setResultado("0");
					ES.setSUBPRODUTO(view.getNM_SUBPRODUTO());
					escreve.add(ES);
				}
			}
		}
		
	}
		
}
