package com.gmail.maxenamiro;

public class Triangle {
	private double a;
	private double b;
	private double c;
	private String s;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getA() {
		return this.a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getB() {
		return this.b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getC() {
		return this.c;
	}

	public double calculateSuare() {
		double p = (a + b + c) / 2; // знаходимо висоту через сторони трикутника
		double h = ((2 / a) * (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
		double s = 0.5 * a * h; // знаходимо площу трикутника
		return s;
	}
	
	@Override
	public String toString() {
		return "square"+s;
	}
}
