public abstract class CoffeeDecorator implements Beverage {
    /*
        This is a Decorator that hasA component (to be able to make any combinations and pass the data along the combination = nesting)
                            and isA component (to be treated as a component at the end)
     */
    Beverage child;

    CoffeeDecorator() {

    }

    CoffeeDecorator(Beverage child) {
        this.child = child;
    }
}
