package dio.basecamp;

public class Main {
	
	public static void main(String[] args) {
		
		//VARIÁVEIS
		
		final int j = 10; //é uma cte 
		//j = 15; dá erro
		
		//nomenclatura correta para variáveis
		int quantidadeProduto = 10;
		final int NUMERO_TENTATIVAS = 5;
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		
		/* TIPOS DE DADOS
		 * byte, int, long: sãi tipos inteiros que suportam
		 * tamanhos diferentes
		 */
		 
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		//short s2 = 40000; o valor está ultrapassando o tamanho 
		// que o tipo suporta
		
		//int i1 = -10000000000; ferindo o valor negatio que int suporta 
		int i2 = 28500;
		
		//inteiro com capacidade maior
		long l1 = 1000000000000000000L; // tem que colocar o L no final
		long l2 = 2004005000500055000L; // para saber que é long
		
		//float f1 = 4.5; tem que colocar f no final para não ser double
		float f2 = 10.68F;
		
		double d1 = 85.89; // jpa inferiu que é double
		double d2 = 99.04d;
		
		//Tipos de dados textuais
		char c1 = 'W';
		//char c2 = 'Tw'; mais de 1 caractere
		char c3 = '\u0057'; // W em unicode
		
		String st1 = "Fulano";
		String st2 = "Cicrano";
		String st3 = "ag dgb se  se et t KNBJBJBB";
		
		//String dt1 = "09/02/1981"; data usa outo tipo
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(bo1);
		System.out.println(bo2);
		
	}

}
