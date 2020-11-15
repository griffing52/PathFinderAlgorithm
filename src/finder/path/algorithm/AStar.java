package src.finder.path.algorithm;

import src.finder.path.elements.Point;
import src.finder.path.algorithm.Constants.Sensitivity.*;

public class AStar {
    Point[] OPEN, CLOSED;
    int[][] map;
    Point start, end;
    boolean done;
    public AStar(int size, int[][] map, Point start, Point end) {
        this.OPEN = new Point[size];
        this.CLOSED = new Point[size];
        this.map = map;
        this.done = (start.x == end.x && start.y == start.y) ? true : false;
    }
    public void run() {
        // Point last = start;
        while (!done) {
            // Point[] neighbors = this.aroundPoint(last);
        }
    }
    public Point[] aroundPoint(Point a) {
        
        Point[] around = new Point[8];
        // if ()
        around[0] = new Point(a.x, a.y);
        return around;
    }
    //distance between two points
    public static int dBP(Point a, Point b) {
        return (int) Math.round(Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y))*10);
    }
}



// int minL = (a.x-1<0) ? 0 : a.x-1;
// int maxL = (a.x+1>map[0].length) ? map[0].length : a.x+1;
// int minH = (a.y-1<0) ? 0 : a.y-1;
// int maxH = (a.x+1>map.length) ? map.length : a.y+1;