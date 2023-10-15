import java.util.Scanner;
public class XnPrincipal {
// ESTE PROGRAMA RECEBE A BASE E O EXPOENTE DE UM NUMERO INTEIRO E CALCULA A PONTENCIA USANDO RECURSIVIDADE
	public static int  Xexponencial(int x, int n){

		if (n==0) // SEGUNDO O AXIOMA MATEMÁTICO:TODO NUMERO ELEVADO A 0 RETORNA 1. 
		{
			return 1;
		} else {
			
			return x * Xexponencial(x, n-1);
		}
	}
			
	public static void main(String[] args) {
		Scanner leitor= new java.util.Scanner(System.in);

		int base =0;
		int expoente=0;
		int resultado= 0;
		
		System.out.println("Digite a base");
		base=leitor.nextInt();
		
		System.out.println("Digite o expoente");
		expoente=leitor.nextInt();
		
		resultado =Xexponencial(base, expoente);
		System.out.println("O resultado da potencia é: " + resultado);
		
	}

}
