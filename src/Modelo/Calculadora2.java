package Modelo;

public class Calculadora2 {
	private int num1;
	private int num2;
	
	public Calculadora2( int a , int b ){
		num1= a;
		num2= b;
	//modificacion	
	}
	public long suma(){
		long resul= num1+ num2;
		return resul;
	}
	public int resta(){
		int resul= num1-num2;
		return resul;
	}
	public int multiplica(){
		int resul=num1 * num2;
		return resul;
		
	}
	public int divide(){
		int resul; 
		if (num2==0)
			throw new java.lang.ArithmeticException("Division por digitos ");
		else
			resul=num1/num2;
		return resul;
	}
	public int divide2() throws java.lang.ArithmeticException{
		int resul;
		
		resul=num1/num2;
		return resul;
		
	}
}
