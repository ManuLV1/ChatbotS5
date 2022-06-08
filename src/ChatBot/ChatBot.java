package ChatBot;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ChatBot {

    public static void main(String[] args) {
        Main gui = new Main();
        gui.setVisible(true);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setTitle("Chatbot Manuel Torres");
    }
}
