package ink.bignose.factory.absfactory.pizzastore.order;


import ink.bignose.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import ink.bignose.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import ink.bignose.factory.absfactory.pizzastore.pizza.Pizza;


public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
