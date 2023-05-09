public class Main {
    public Main(){
        Rectangle rectangle = new Rectangle();
        System.out.printf("The rectangle has side a (%f), side b (%f), it's perimeter equals %f and it's area equals %f", rectangle.getSideA(), rectangle.setSideB(), rectangle.getPerimeter(), rectangle.getArea());
    }
    public static void main(String[] args) {
        new Main();
    }
}
