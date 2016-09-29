package br.unipe.cc.calculadora.gui;

import java.util.Scanner;

import br.unipe.cc.calculadora.model.Functions;
import br.unipe.cc.calculadora.model.Menu;

public class Calculadora {
	public static void main(String[] args) {
		int option = 0;
		int sair = 0;
		Scanner leitor = new Scanner(System.in);
		Menu tela = new Menu();
		Functions calc = new Functions();
		
		while(sair != 1){
			tela.tela();
			option = leitor.nextInt();
			switch(option){
			case 1: System.out.println(calc.soma());break;
			case 2: System.out.println(calc.sub()); break;
			case 3: System.out.println(calc.mult()); break;
			case 4: System.out.println(calc.div()); break;
			case 5: sair = 1; System.out.println("PROGRAMA ENCERRANDO!"); break;
			default: System.out.println("OPCAO INVALIDA!!"); break;
			}
		}
	}
}
