
import javax.swing.JOptionPane;
public class atvd3  {
    public static void Lowcase() throws NullPointerException{
        String word = null;
        String newword = null;

        word = JOptionPane.showInputDialog(null, "digite uma palavra: ");

        newword = word.toLowerCase();
        System.out.println("A palavra informada e: " + word);
        System.out.println("A palavra corrigida e: "+ newword);
    }
}
