package RuningAnimalsTask;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat(1500, 300, "Kitten"),
                new Cat(2500, 200, "Meo"),
                new Robot(23500, 0 , "R2D2"),
                new Robot(2500, 2, "C3PO"),
                new Human(2000, 5, "Pete"),
                new Human(2500, 2, "Tomas"),
        };
        Obstacle[] obstacles = {
                new Track(1500),
                new Wall(2),
                new Track(2500),
                new Wall(3),
                new Track(500),
                new Wall(1)
        };
        for (Runner runner:
             runners) {
            for (Obstacle obstacle:
                    obstacles) {
                if (obstacle instanceof Track) {
                    if (!runner.run(obstacle.getLength())) {
                        break;
                    }
                } else if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeight())) {
                        break;
                    }
                }
            }
        }
    }
}
