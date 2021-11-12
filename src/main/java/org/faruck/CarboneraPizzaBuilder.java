package org.faruck;

public class CarboneraPizzaBuilder extends PizzaBuilder {
    @Override
    public void ponerNombre() {
        pizza.setNombre("Carbonada");
    }

    @Override
    public void crearMasa() {
        pizza.setMasa("Fina");
    }

    @Override
    public void crearSalsa() {
        pizza.setSalsa("Entomatada x2");
    }

    @Override
    public void crearIngredientes() {
        pizza.setIngredientes("Carbon, champillones");
    }
}
