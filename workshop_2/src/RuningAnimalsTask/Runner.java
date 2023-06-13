package RuningAnimalsTask;

public interface Runner {
    String getName();
    int getMaxRun();
    int getMaxJump();

    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s: Jump - OK, height equals to %s \n", getName(), height);
            return true;
        } else {
            System.out.printf("%s failed to jump heighter than %s \n", getName(), height);
            return false;
        }
    }

    default boolean run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.printf("%s: Run - OK, distance equals to %s \n", getName(), distance);
            return true;
        } else {
            System.out.printf("%s failed to run longer than %s \n", getName(), distance);
            return false;
        }
    }
}
