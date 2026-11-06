public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        double term;

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            term = Math.pow(-1, i) / (2 * i + 1);
            approxPi += 4*term;
        }
        
        System.out.println(approxPi + " " + actualPi);
    }
}
