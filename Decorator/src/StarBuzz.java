public class StarBuzz {

    public static void main(String[] args)
    {
        Beverage whippedCreamEspresso = new WhippedCream(new Espresso());
        System.out.println(whippedCreamEspresso.getDescription() + " and cost is " + whippedCreamEspresso.getCost());

        Beverage soyaWhippedCreamDecaf = new Soya(new WhippedCream(new Deacf()));
        System.out.println(soyaWhippedCreamDecaf.getDescription() + " and cost is " + soyaWhippedCreamDecaf.getCost());

        Beverage Decaf = new Deacf();
        System.out.println(Decaf.getDescription() + " and cost is " + Decaf.getCost());

        Beverage caramelWhippedCreamSoyaEspresso = new Caramel(new WhippedCream(new Soya(new Espresso())));
        System.out.println(caramelWhippedCreamSoyaEspresso.getDescription() + " and cost is "
                + caramelWhippedCreamSoyaEspresso.getCost());
    }

}
