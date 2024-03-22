public class exeção {

    public static int div (int A , int B ) {
        try{
            return A / B ;
        }
        catch(ArithmeticException exception){
            System.err.println("A divisão por zero e indefinida.");
            return 0; 
        }
    }
}
