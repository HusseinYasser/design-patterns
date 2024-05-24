public class WhippedCream extends CoffeeDecorator{

    /*
        This is a ConcreteDecorator
     */

    public WhippedCream(Beverage b)
    {
        super(b);
    }

    @Override
    public String getDescription() {
        return child.getDescription() + " with WhippedCream";
    }

    @Override
    public int getCost() {
        return child.getCost() + 1;
    }
}
