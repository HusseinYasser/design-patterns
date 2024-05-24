public class Soya extends CoffeeDecorator {

    public Soya(Beverage b) {
        super(b);
    }


    @Override
    public String getDescription() {
        return child.getDescription() + " with Soya shot";
    }

    @Override
    public int getCost() {
        return child.getCost() + 10;
    }
}
