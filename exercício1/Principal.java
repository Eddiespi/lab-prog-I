package exerc�cio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int n = 0;
			
		
		System.out.println("Informe quantas pessoas responderam a pesquisa?");
		n = ler.nextInt();

		Pesquisa pesq = new Pesquisa(n);
		
		for (int i = 0; i < n; i++){
			System.out.println("Informe o sexo (M {masculino} ou F {feminino})");
			pesq.setSexo(ler.next().charAt(0), i);
			
			System.out.println("Informe se gostou do produto (S {sim} ou N {n�o}");
			pesq.setOpcao(ler.next().charAt(0), i);
			
		}
		
		System.out.println("O n�mero de pessoas que gostaram do produto: " + pesq.getGostaram());
//		System.out.println("O n�mero de pessoas que n�o gostaram do produto: " + pesq.getNaoGostaram());
	//	System.out.println("O percentual de pessoas do g�nero masculino que n�o gostaram do produto: " + pesq.getPerMascNao());
//		System.out.println(pesq.getMensagem());
	}

}
