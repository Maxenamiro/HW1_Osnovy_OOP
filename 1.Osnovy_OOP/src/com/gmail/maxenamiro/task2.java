package com.gmail.maxenamiro;

public class task2 {

	public static void main(String[] args) {
		// Описать класс Треугольник.
		// В качестве свойств возьмите длины сторон треугольника.
		// Реализуйте метод, который будет возвращать площадь
		// этого треугольника.
		// Создайте несколько объектов этого класса и протестируйте их.

		Triangle firstTriangle = new Triangle(9, 12, 9);
		Triangle secondTriangle = new Triangle(8, 8, 4);

		System.out.println(firstTriangle.calculateSuare());
		System.out.println(secondTriangle.calculateSuare());
	}

}
