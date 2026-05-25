package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Color randomColor = getRandomColor();
        Ball ball = new Ball(randomColor, randomNumber);
        return ball;
    }
}