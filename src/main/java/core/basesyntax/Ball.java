package core.basesyntax;

public class Ball {
    Color color;
    int number;

    public Ball(Color color, int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
