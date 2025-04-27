package Atividade_revisão;
import java.text.NumberFormat;
import java.util.Locale;

public class Revisão1 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 31;
        int code= 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products: \n");
        Locale.setDefault(Locale.US);

        System.out.printf("%s, which price is $ %.2f \n", product1, price1);
        System.out.printf("%s, which price is $ %.2f \n", product2, price2);
        System.out.printf("Record: %d years old, %d Code, %s gender \n", age, code, gender);

        System.out.printf("Measure with eight decimal place: %f \n", measure);
        System.out.printf("Rouded (Three decimal places): %.3f \n", measure);
        System.out.printf("US decimal point: %.2f", measure);
        //Aula 24 do curso da UDEMY de java


    }
}
