public class LineComparison {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(4, 5);

        Point p3 = new Point(3, 2);
        Point p4 = new Point(4, 5);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        System.out.println("Length of line 1 is " + line1.findLength());
        System.out.println("Length of line 2 is " + line2.findLength());

        System.out.println(line1.equals(line2));
    }
}
