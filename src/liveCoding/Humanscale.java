package liveCoding;

public class Humanscale extends Chair implements Rollable, Collapsable {


    @Override
    public void sit() {
        System.out.println("Sitting on Humanscale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Humanscale chair");
    }

    @Override
    public void lock() {
        System.out.println("Hiumanscale is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Humanscale is unlocked");
    }

    @Override
    public void fold() {
        System.out.println("Humanscale is fold");
    }

    @Override
    public void unfold() {
        System.out.println("Humanscale is unfold");
    }

    @Override
    public void rollBack() {
        System.out.println("HUmanscale is rolling backward");
    }

    @Override
    public void rollForward() {
        System.out.println("Humanscale is rolling forward");
    }
}
