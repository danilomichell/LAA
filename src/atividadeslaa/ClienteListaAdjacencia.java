package atividadeslaa;

import java.util.LinkedList;

public class ClienteListaAdjacencia {
	
	static int numeroVertice = 12;
	
	public static void main(String... args)
	{
		LinkedList listas[] = new LinkedList[numeroVertice];
		
		ligarListas(listas);
		
		listas[3].add(8);
		listas[3].add(10);
		listas[5].add(11);
		listas[7].add(11);
		listas[7].add(8);
		listas[11].add(2);
		listas[11].add(9);
                listas[11].add(10);
                listas[8].add(9);
		
		print(listas);
		
	}
	
	static void ligarListas(LinkedList[] listas)
	{
		for (int i = 0; i < numeroVertice; i++)
		{
			listas[i] = new LinkedList();
		}
	}
	
	static void print(LinkedList[] listas)
	{
		for (int i = 0; i < numeroVertice; i++)
		{
			System.out.print(i + ": ");
			for (int j = 0; j < listas[i].size(); j++)
			{
				System.out.print(listas[i].get(j) + " ");
			}
			System.out.println();
		}
	}
	
}
