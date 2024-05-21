import java.util.Random;

public class ConcreteSubject extends Observable {

    private final int[] arr = new int[5];

    ConcreteSubject() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; ++i)
            arr[i] = rand.nextInt(4);
    }

    public int[] getArr() {
        return arr;
    }

    public void stochasticChange() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; ++i)
            arr[i] = rand.nextInt(4);

        //when the change happen we need to notify
        notifyObservers();
    }
}
