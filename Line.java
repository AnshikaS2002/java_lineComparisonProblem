public class Line {
    Point p1;
    Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double findLength() {
        return Math.sqrt((Math.pow((p2.x - p1.x), 2)) + (Math.pow((p2.y - p1.y), 2)));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Line line = (Line) obj;
        return (findLength() == line.findLength());
    }

}
