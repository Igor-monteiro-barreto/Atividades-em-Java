
public class atividade3 {
    public static void main(String[] args) {
       /*  atvd3 ltpqn = new atvd3();
        ltpqn.Lowcase();
    */
        try {
            atvd3.Lowcase();
        } catch (NullPointerException e) {
            System.out.println("Exceção Do tipo NullPointer identificada");
            System.out.println("Metodo diminuiletras() tratado" + e);
            
        }
}    
}
