
/*
    Observer interface that has update function to be implemented with the concretions
    This is a push-pull implementation where the data is not pushed but pulled when notification arrives
 */
public interface Observer {
    public void update();
}
