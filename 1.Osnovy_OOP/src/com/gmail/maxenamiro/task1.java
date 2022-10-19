package com.gmail.maxenamiro;

public class task1 {

	public static void main(String[] args) {
		// Создайте пользовательский класс
		//для описания товара (предположим, это задел
		//для интернет-магазина).
		//В качестве свойств товара можете использовать значение цены,
		//описание, вес товара.
		//Создайте пару экземпляров вашего класса 
		//и протестируйте их работу.
		Mint mint = new Mint();
		Fish fish = new Fish();
		
		mint.price = 23.51;
		mint.description = "an aromatic plant native to temperate regions of the Old World, several kinds of which are used as culinary herbs.";
		mint.weight = 0.2;
		
		fish.price = 112.23;
		fish.description = "Fish are aquatic vertebrate animals that have gills but lack limbs with digits, like fingers or toes. Recall that vertebrates are animals with internal backbones. Most fish are streamlined in their general body form. The word fish is the same whether it is singular or plural—you can talk about one fish or ten fish.";
		fish.weight = 2.34;
		
		System.out.println(mint);
		System.out.println(fish);
	}

}
