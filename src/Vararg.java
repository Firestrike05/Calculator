public class Vararg {

    //Below are calc functions
    //Varargs to add 2 or more arguments
    public static void add(Double n, Double... add){
        Double sum = n;
        for(Double i : add) {
            sum += i;
        } System.out.println(sum);
    }

    //Varargs to subtract 2 or more arguments
    public static void sub(Double n, Double... sub){
        Double sum = n;
        for(Double i : sub){
            sum -= i;
        } System.out.println(sum);
    }
    //Varargs to divide 2 or more arguments
    public static void divide(Double n, Double... div){
        Double sum = n;
        for(Double i : div){
            sum /= i;
        } System.out.println(sum);
    }
    //Varargs to multiply 2 or more arguments
    public static void multi(Double n, Double... mul){
        Double sum = n;
        for(Double i : mul){
            sum *= i;
        } System.out.println(sum);
    }

}
