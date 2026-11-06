public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int first = 1,second = 0,temp;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (first % 2 != 0) {
                numOdd++;
            }
            System.out.print(first);
            temp = first + second;
            second = first;
            first = temp;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
