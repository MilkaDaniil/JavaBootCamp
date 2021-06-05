package sef.module17.sample;
// Complete Code
class MyCalculator {
	
	public int getSum(int a, int b) {
		if (a<0) {
			System.out.println("number is too short to perform addition");

		}
		else{
			System.out.println("number is too short to perform additon");
		}
		
		return a + b;
	}
	
	public int getDifference(int a, int b){
		return a - b;
	}
	
	public double getProduct(double a, double b){
		return a * b;
	}
	
	public double getQuotient(double a, double b){
		return a / b;
	}
}
