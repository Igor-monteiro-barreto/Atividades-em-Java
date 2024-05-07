import javax.swing.*;

public class Interface {
    public static void main(String[] args) {
        tela minhaTela = new tela();
    }
    // Classe interna que representa a tela
    public static class tela {
        public tela() {
            JFrame jFrame = new JFrame();
            jFrame.setVisible(true);
            jFrame.setSize(800, 500);
            jFrame.setTitle("Primeiro");
        }
    }
}

