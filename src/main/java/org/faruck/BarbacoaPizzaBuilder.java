package org.faruck;

public class BarbacoaPizzaBuilder extends PizzaBuilder {

    @Override
    public void ponerNombre() {
        pizza.setNombre("Barbacoa");
    }

    @Override
    public void crearMasa() {
        pizza.setMasa("Gorda");
    }

    @Override
    public void crearSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void crearIngredientes() {
        pizza.setIngredientes("Mozarrella,cebolla,pinia");
    }
}
