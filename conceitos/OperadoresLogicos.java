package conceitos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean cond1 = true;
        boolean cond2 = 3 > 7;

        //E
        System.out.println(cond1 && cond2);
        System.out.println(cond1 ^ cond2);
        //OU
        System.out.println(cond1 || cond2);
        System.out.println(!cond2);
        System.out.println(!cond1);
        
    }
}
