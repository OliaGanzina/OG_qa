public class Task3 {
    public static void main(String[] args) {

        int a = 100;
        int b = 999;
        int c = a + (int) (Math.random() * (b - a));
            System.out.println("Generated number: " + c);
        int first = c / 100;
        int second = c / 10;
        int secondFinal = second % 10;
        int third = c % 10;
        if (first > secondFinal & first > third) {
            System.out.println("Largest number: " + first);
        } else if (secondFinal > first & secondFinal > third) {
            System.out.println("Largest number: " + secondFinal);
        } else {
            System.out.println("Largest number: " + third);}

    }
}
