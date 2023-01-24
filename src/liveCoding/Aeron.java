package liveCoding;

public class Aeron extends Chair implements Rollable {


    @Override
    public void sit() {
        System.out.println("Sitting on aeron chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on aeron chair");
    }


    @Override
    public void rollBack() {
        System.out.println("Rolling backward in Aeron");
    }

    @Override
    public void rollForward() {
        System.out.println("Rolling forward in Aeron");
    }
}
