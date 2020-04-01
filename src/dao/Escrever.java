package dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modal.Escritor;
public class Escrever {
	public void Documentar(ArrayList<Escritor> Esc)
	{
		try
		{
			FileOutputStream arquivo = new FileOutputStream("\\src\\arquivos\\Resultado.csv");
			
			PrintWriter pr = new PrintWriter(arquivo);
			pr.println("NM_SUBPRODUTO;Resultado");
			for(Escritor escreve : Esc )
			{
				pr.println(escreve.getSUBPRODUTO() + ";" + escreve.getResultado());
			}
			pr.close();
			arquivo.close();
			System.out.println( "Arquivo entregue");
		}
		catch(Exception e)
		{
			
		}
	}
}
