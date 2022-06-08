package chatbot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Read {

    File file = new File("./datos.txt");

    public String Readtxt(String direccion) {
        String text = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temporal = "";
            String bfread;
            while ((bfread = bf.readLine()) != null) {
                temporal = temporal + bfread + "\r\n";
            }
            text = temporal;
        } catch (Exception e) {
        }
        return text;
    }

    public String newQuestion(String question, String answer) {

        //String myword="";
        // String respuesta=""; 
        String newQuestion = "";
        String[] tupla3 = question.split(" ");
        //System.out.println(tupla3[0]);
        for (int i = 0; i <= tupla3.length - 1; i++) {
            if (i == tupla3.length - 1) {
                newQuestion = newQuestion + tupla3[i] + "#" + tupla3[i] + "?" + "#" + answer;
            } else if (tupla3[i].equalsIgnoreCase("que") || tupla3[i].equalsIgnoreCase("es")
                    || tupla3[i].equalsIgnoreCase("un") || tupla3[i].equalsIgnoreCase("de")
                    || tupla3[i].equalsIgnoreCase("hijo")) {
                continue;
            } else {
                newQuestion = newQuestion + tupla3[i] + "#";
            }
        }
        System.out.println(newQuestion);
        // palabra.guardar(palabra.leertxt("fileName1.txt"), nuevaPalabra);
        return newQuestion;
    }

    public void save(String lastContentTxt, String newWord) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            // pw.write(leertxt("fileName1.txt"));
            //String palabra=leertxt("fileName1.txt");
            pw.append(lastContentTxt + newWord);

            // pw.append(leertxt("fileName1.txt"))
            pw.close();
            System.out.println("Done");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
