package br.unipe.cc.calculadora.model;

import java.util.Scanner;

public class Functions {
	private double result;
	private double num1;
	private double num2;
	
	Scanner leitor = new Scanner(System.in);
	
	public double getResult() {
		return result;
	}
	public void setNum1() {
		System.out.println("INFORME O PRIMEIRO NUMERO: \n");
		this.num1 = leitor.nextDouble();
	}
	
	public void setNum2() {
		System.out.println("INFORME O SEGUNDO NUMERO: \n");
		this.num2 = leitor.nextDouble();
	}
	public double soma(){
		setNum1();
		setNum2();
		this.result = num1 + num2;
		return result;
	}
	public double sub(){
		setNum1();
		setNum2();
		this.result = num1 - num2;
		return result;
	}
	public double mult(){
		setNum1();
		setNum2();
		this.result = num1 * num2;
		return result;
	}
	public double div(){
		setNum1();
		setNum2();
		if(num2 == 0){
			System.out.println("NAO E POSSIVEL DIVIDIR UM NUMERO POR 0");}
		this.result = num1 / num2;
		return result;
	}

}
