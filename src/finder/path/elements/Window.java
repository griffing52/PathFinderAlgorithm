package src.finder.path.elements;

public class Window {
    private int[] getMinMax(Point a) {
        int minL, maxL, minH, maxH;
        int length = 8;
        if (a.x-1<0) {
        minL = 0;
        length--;
        }
        maxL = (a.x+1>map[0].length) ? map[0].length : a.x+1;
        minH = (a.y-1<0) ? 0 : a.y-1;
        maxH = (a.x+1>map.length) ? map.length : a.y+1;
        // return
    }
    private Point formPointAround(int x, int y) {
        Point a = new Point(x, y);
        a.setF(AStar.dBP(a, start), AStar.dBP(a, end));
        return a;
    }
}
