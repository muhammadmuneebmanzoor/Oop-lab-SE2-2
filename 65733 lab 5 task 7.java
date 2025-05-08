public class ArrayExample {
    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50, 60};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Just to add a line break

       
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

      
        System.out.println("Average of array elements: " + average);
    }
}
