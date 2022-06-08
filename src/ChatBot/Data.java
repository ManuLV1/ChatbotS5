package ChatBot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Data extends FileController{
    private static final String DATABASE = "./datos.txt";
    private RandomAccessFile fileReader;
    
    public Data(){
        super(DATABASE);
        try{
            fileReader = new RandomAccessFile(file, "r");
            
        }catch(FileNotFoundException fne){
            JOptionPane.showMessageDialog(null, "La base de datos de traducción no fue encontrada", "ERROR BASE DE DATOS TRADUCCION",ERROR_MESSAGE);
            fne.printStackTrace();
        }
        
    }
    public String translate(String word){
        String translation = "OK";
        String savedWords = "";
        String firstWord= word;
        int counter=0, counter2=0;
        
        try{
        String line = fileReader.readLine();
        boolean found = false;
        
        while(line !=null && found!=true){
            String[] tupla= line.split("#");
            String[] tuplados= firstWord.split(" ");
            
            for(int i=0;i<=tuplados.length-1;i++){
                for(int j=0;j<=tupla.length-1;j++){
                    if(tuplados[i].equalsIgnoreCase(tupla[j])){
                        translation = tupla[tupla.length-1];
                        counter++;
                    }
                }
            }
            if(counter>=counter2){
                counter2=counter;
                savedWords=translation;
                
            }
            counter=0;
            line = fileReader.readLine();
        }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al leer el contenido de las palabras","DATA BASE ERROR",ERROR_MESSAGE);
            e.printStackTrace();
        }finally{
            try{
                fileReader.close();
            }catch(IOException ioe){
                JOptionPane.showMessageDialog(null, "Error al cerrar la base de datos de palabras","DATA BASE ERROR",ERROR_MESSAGE);
                ioe.printStackTrace();
            }
        }
        return savedWords;
    }
}

