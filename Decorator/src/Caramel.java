public class Caramel extends CoffeeDecorator{

    public Caramel(Beverage b)
    {
        super(b);
    }

    @Override
    public String getDescription() {
        return child.getDescription() + " with Caramel";
    }

    @Override
    public int getCost() {
        return child.getCost() + 4;
    }
}
