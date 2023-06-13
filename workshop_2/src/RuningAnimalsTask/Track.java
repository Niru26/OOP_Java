package RuningAnimalsTask;

public class Track implements Obstacle{
    private final int length;

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    public Track(int length) {
        this.length = length;
    }
}
