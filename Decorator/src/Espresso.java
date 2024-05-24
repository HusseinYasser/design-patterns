public class Espresso implements Beverage{
    /*
        This is a ConcreteComponent
     */
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public int getCost() {
        return 2;
    }
}
