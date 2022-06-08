package ChatBot;

import chatbot.Read;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame {

    String question, answer, generated_Question;
    boolean playing = false;
    AudioClip sound1, sound2, alive1;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jpMain1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();
        txtChat = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameBot = new javax.swing.JLabel();
        onLine = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        onLine2 = new javax.swing.JLabel();
        btnTeach = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMain1.setBackground(new java.awt.Color(204, 255, 204));

        Screen.setBackground(new java.awt.Color(255, 255, 255));
        Screen.setColumns(20);
        Screen.setRows(5);
        jScrollPane1.setViewportView(Screen);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        nameBot.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nameBot.setText("SIRI");

        onLine.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/siri_macos_bigsur_icon_189739 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameBot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onLine, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(onLine, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)))
                    .addComponent(nameBot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Estás hablando con:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("SIRI");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/siri_macos_bigsur_icon_189739 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(onLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onLine2))
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTeach.setText("Teach");
        btnTeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMain1Layout = new javax.swing.GroupLayout(jpMain1);
        jpMain1.setLayout(jpMain1Layout);
        jpMain1Layout.setHorizontalGroup(
            jpMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMain1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpMain1Layout.createSequentialGroup()
                            .addComponent(txtChat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSend)
                            .addGap(7, 7, 7)
                            .addComponent(btnTeach)
                            .addContainerGap())
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpMain1Layout.setVerticalGroup(
            jpMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMain1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSend)
                        .addComponent(btnTeach))
                    .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeachActionPerformed
        String userQuestion = JOptionPane.showInputDialog("Ingrese pregunta");
        String answerUserToQuestion = JOptionPane.showInputDialog("La respuesta a la pregunta es: '" + userQuestion + "'");
        Read learn = new Read();
        String newWord = learn.newQuestion(userQuestion, answerUserToQuestion);
        learn.save(learn.Readtxt("./datos.txt"), newWord);
    }//GEN-LAST:event_btnTeachActionPerformed

    public JButton txtSend() {
        return btnSend;
    }

    public void setScreen() {
        Screen.append("Machine: " + answer + "\n");
    }

    public JTextArea backScreen() {
        return Screen;
    }

    public JTextField returnText() {
        return txtChat;
    }
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        Thread hilo = new Thread(new Runnable() { //Thread es una clase que nos ayuda a ejecutar los procesos que se van a realizar reiteradas veces en un programa
            @Override
            public void run() {
                try {
                    question = txtChat.getText();
                    answer = (new Data().translate(txtChat.getText()));
                    generated_Question = (new Data().translate(createQuestion()));
                    Screen.append("Usted: " + txtChat.getText() + "\n");
                    if (answer.equalsIgnoreCase("OK")) {
                        Screen.append("Siri: Podrias enseñarme que debo responder si me dicen: '" + question + "' " + "Por favor si/no\n");
                        String userAnswer = JOptionPane.showInputDialog("¿Desea enseñarle (si/no)");
                        if (userAnswer.equalsIgnoreCase("si")) {
                            String answerUserToQuestion = JOptionPane.showInputDialog("¿Que responder a '" + question + "'");
                            Read teach = new Read();
                            String newWord = teach.newQuestion(question, answerUserToQuestion);
                        }
                    }
                    txtChat.setText("");
                    typeAnimation(answer);
                    int probability = halfProbability();
                    if (probability > 1) {
                        questionAnimation(generated_Question);
                        if (generated_Question.equalsIgnoreCase("Pongamos musica") && playing != true) {
                            alive1 = java.applet.Applet.newAudioClip(getClass().getResource("./alive.wav"));
                            alive1.play();
                        }
                    }
                } catch (Exception e) {

                }
            }

        });
        hilo.start();

    }//GEN-LAST:event_btnSendActionPerformed

    public String createQuestion() {
        int number;
        number = (int) (Math.random() * 9) + 1;
        String randomQuestion = Integer.toString(number);
        String completedQuestion = randomQuestion + "p";
        return completedQuestion;
    }

    public int halfProbability() {
        int number;
        number = (int) (Math.random() * 9) + 1;
        return number;
    }

    public void typeAnimation(String answer1) throws InterruptedException, URISyntaxException, IOException {
        sound1 = java.applet.Applet.newAudioClip(getClass().getResource("./mensajellegada.wav"));
        sound2 = java.applet.Applet.newAudioClip(getClass().getResource("./pop.wav"));
        Thread.sleep(generateRandom());
        onLine.setForeground(Color.blue);
        onLine2.setForeground(Color.gray);
        sound2.play();
        Thread.sleep(generateRandom());
        onLine.setText("Visto");
        onLine2.setText("Visto");
        sound1.play();
        Screen.append("Siri: " + answer1 + "\n");

        if (question.equalsIgnoreCase("Reproducir música")) {
            playing = true;
            alive1 = java.applet.Applet.newAudioClip(getClass().getResource("./alive.wav"));
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=I_izvAbhExY"));
        }
    }

    public void questionAnimation(String answer1) throws InterruptedException {
        sound1 = java.applet.Applet.newAudioClip(getClass().getResource("./mensajellegada.wav"));
        Thread.sleep(1500);
        onLine.setText("Escribiendo");
        onLine2.setText("Escribiendo");
        Thread.sleep(1000);
        onLine.setText("");
        onLine2.setText("");
        sound1.play();
        Screen.append("Siri: " + answer1 + "\n");
    }

    public int generateRandom() {
        int number;
        number = (int) (Math.random() * 4000) + 1000;
        return number;
    }

    public void attachText() {
        Screen.append("Siri: " + answer + "\n");
        txtChat.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Screen;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnTeach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpMain1;
    private javax.swing.JLabel nameBot;
    private javax.swing.JLabel onLine;
    private javax.swing.JLabel onLine2;
    private javax.swing.JTextField txtChat;
    // End of variables declaration//GEN-END:variables
}
