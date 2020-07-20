package ink.bignose.factory.factorymethod.pizzastore.order;

import ink.bignose.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import ink.bignose.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import ink.bignose.factory.factorymethod.pizzastore.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {

	
	@Override
    Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
