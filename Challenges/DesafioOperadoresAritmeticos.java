package Challenges;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {

        double c1 = Math.pow(6 * (3 + 2), 2);
        double c2 = 3*2;
        double c4 = Math.pow((1-5)*(2-7), 2);
        double c5 = Math.pow(2,2);

        double resultA = c1/c2;
        double resultB = c4/c5;

        double c6 = Math.pow((resultA - resultB), 3);
        double c7 = Math.pow(10, 3);

        double resultC = c6/c7;

        System.out.println(resultC);

    }
}
