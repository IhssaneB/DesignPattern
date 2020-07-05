package _1_decorator._1_characters;

public class SampleMobileElement implements MobileElement {
    private int x;
    private int y;

    public SampleMobileElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
