package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import bll.Comparar;
import modal.Auxiliar;


public class Leitor {
	public void buscarDados()
	{

		File mercadoLocal = new File("\\src\\arquivos\\DadosMercado.csv");  
		   File operacaoLocal = new File("\\src\\arquivos\\Operacoes.csv");

		   ArrayList<Auxiliar> verificar = new ArrayList<Auxiliar>();
		   Auxiliar Auxi = new Auxiliar();
		   try {
			   String linesMercado = "";
			   Scanner DadosMercado = new Scanner(mercadoLocal);
			   DadosMercado.nextLine();
			   
			   String linesOperacao= "";
			   Scanner Operacao = new Scanner(operacaoLocal);
			   Operacao.nextLine();

			   while(Operacao.hasNext())
			   {
				   linesOperacao = Operacao.nextLine();
				   String[] separar = linesOperacao.split(";");
				   Auxi.setDT_INICIO(separar[1]);
				   Auxi.setDT_FIM(separar[9]);
				   Auxi.setNM_SUBPRODUTO(separar[9]);
				   Auxi.setQUANTIDADE(Double.parseDouble(separar[12].replace(",", ".")));
				   Auxi.setPRECO_ID(Integer.parseInt(separar[13]));
				   
				   verificar.add(Auxi);
				   
			   }
			   
			   
			   while(DadosMercado.hasNext())
			   {
				   linesMercado = DadosMercado.nextLine();
				   
				   String[] separar = linesMercado.split(";");
				   Auxi.setID_PRECO(Integer.parseInt(separar[0]));
				   Auxi.setNU_PRAZO_DIAS_CORRIDOS(Integer.parseInt(separar[1]));
				  
				  
				   Auxi.setVL_PRECO(Double.parseDouble(separar[2].replace(",", ".")));
				   verificar.add(Auxi);
				   
			   }
			  
			   Comparar comp = new Comparar();
			   comp.Verificar(verificar);
			   
		   }
		   
		   catch(FileNotFoundException e){	
			   JOptionPane.showMessageDialog(null, "Arquivos não encontrados: " + e);
		   }
		  
		   

	}
	   
}
