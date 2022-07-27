package dio.basecamp.vto;

public class Main {
	
	public static void main(String[] args) {
		
		/*
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
		/* 
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
		/*
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
		*/
		
		/*
		//OPERADORES MATEMÁTICOS
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
        */
		
		
        //CASTING
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //downcasting, com perda de informação

        long l1;
        int i1 = 10;
        l1 = i1; //upcasting, não houve perda

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;// downcasting, com perda de informação

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;//downcasting, sem perda de informação

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // truncou parte fracionada

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);

        b1 = (byte) d3;

        System.out.println("b1:" + b1);
		
		
		
	}	
	
    private static void prePos() {

        int k = 10; 

        int i = ++k; //i recebe 11
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b " + r1);
        System.out.println("c-a " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);
        
    }
    
    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" + i);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        // --j: primeiro muda o valor de j e depois usa ele
        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i); // 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c *= i += 5: " + c);

    }

}
