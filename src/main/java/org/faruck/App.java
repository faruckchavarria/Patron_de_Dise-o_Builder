package org.faruck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pizza pizza;
        Cocinero cocinero = new Cocinero();
        PizzaBuilder bpb = new BarbacoaPizzaBuilder();
        PizzaBuilder cpb = new CarboneraPizzaBuilder();

        cocinero.setPizzaBuilder(bpb);
        cocinero.crearPizza();
        pizza = cocinero.getPizza();
        System.out.println( pizza.toString());

        cocinero.setPizzaBuilder(cpb);
        cocinero.crearPizza();
        pizza = cocinero.getPizza();
        System.out.println( pizza.toString());
    }
}
