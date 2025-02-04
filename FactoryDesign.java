abstract class Pizza {
    public abstract void prepare();
}

class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza.");
    }
}

class IndianaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Indiana Pizza.");
    }
}

class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie Pizza.");
    }
}

class PizzaFactory {
    public static Pizza getPizza(String pizzaType) {
        if (pizzaType == null) {
            return null;
        }
        switch (pizzaType) {
            case "Cheese":
                return new CheesePizza();
            case "Indiana":
                return new IndianaPizza();
            case "Veggie":
                return new VeggiePizza();
        }
        return null;
    }
}

public class FactoryDesign {
    public static void main(String[] args) {
        Pizza pizza1 = PizzaFactory.getPizza("Cheese");
        pizza1.prepare();

        Pizza pizza2 = PizzaFactory.getPizza("Indiana");
        pizza2.prepare();

        Pizza pizza3 = PizzaFactory.getPizza("Veggie");
        pizza3.prepare();
    }
}
