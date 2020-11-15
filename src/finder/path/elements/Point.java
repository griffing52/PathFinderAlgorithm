package src.finder.path.elements;

public class Point {
    public int x, y, f, g, h;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, int g, int h) {
        this.x = x;
        this.y = y;
        this.g = g;
        this.h = h;
        this.f = g+h;
    }
    public void setF(int g, int h) {
        this.g = g;
        this.h = h;
        this.f = g+h;
    }
}
