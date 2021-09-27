
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferdio
 */
public class server extends javax.swing.JFrame {

    
     ArrayList ClientSortie;
     ArrayList<String> utilisateur;
    /**
     * Creates new form server
     */
    public server() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /************************Classe interne*************************/
    public class TraiteurClient implements Runnable{
        
       
        int port = 2222;
        
        BufferedReader lecteur;
        Socket socket;
        PrintWriter client;
        
        public  TraiteurClient(Socket socketClient,PrintWriter sortie) throws IOException{
            this.socket = socketClient;
            this.client = sortie;
            InputStreamReader recuperation = new InputStreamReader(socket.getInputStream());
            lecteur = new BufferedReader(recuperation);
        }
         
        public void run() {
            try {
                
            String msg;
            
            while((msg = this.lecteur.readLine())!= null){
                Affichage.append("Reception d'un message :"+msg+"\n");
                  Send(msg);
           }
            
        } catch (Exception e) {
            Affichage.append("Connexion lente");
            ClientSortie.remove(client);
        }
            
            
        }
        
        
        
    }
    
    /****************Fin Classe interne*****************************/
    
    public class StartServer implements Runnable{
        
        public void run(){
            
            ClientSortie = new ArrayList();
            utilisateur = new ArrayList();
            
            try {
                ServerSocket socketserveur = new ServerSocket(2222);
                while(true){
                    Socket clientsocket = socketserveur.accept();
                    PrintWriter writer = new PrintWriter(clientsocket.getOutputStream());
                    ClientSortie.add(writer);
                    Thread monthread = new Thread(new TraiteurClient(clientsocket, writer));
                    monthread.start();
                    Affichage.append("Connexion etablie \n");
                }
            } catch (Exception e) {
                Affichage.append("Erreur de connexion");
            }
        }
    }
    
        public void Send(String message){
            
            Iterator i = ClientSortie.iterator();
            
            while(i.hasNext()){
                try {
                    PrintWriter w = (PrintWriter) i.next();
                    w.println(message);
                    Affichage.append("Envoi : "+ message + "\n");
                    w.flush();
                    Affichage.setCaretPosition(Affichage.getDocument().getLength());
                } catch (Exception e) {
                    Affichage.append("Erreur Erreur Erreur....");
                }
            }
            
            
            
            
        }
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Affichage = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        portserveur = new javax.swing.JTextField();
        demarrer = new javax.swing.JButton();
        arreter = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Serveur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        Affichage.setColumns(20);
        Affichage.setRows(5);
        jScrollPane1.setViewportView(Affichage);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Port :");

        portserveur.setText("2222");
        portserveur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portserveurActionPerformed(evt);
            }
        });

        demarrer.setText("Demarrer");
        demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demarrerActionPerformed(evt);
            }
        });

        arreter.setText("Arreter");
        arreter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arreterActionPerformed(evt);
            }
        });

        clear.setText("Nettoyer");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(portserveur, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(demarrer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arreter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portserveur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(demarrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(clear)
                .addGap(26, 26, 26)
                .addComponent(arreter)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portserveurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portserveurActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_portserveurActionPerformed

    private void demarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demarrerActionPerformed
        Thread demareur = new Thread(new StartServer());
        demareur.start();

        Affichage.append("Serveur allumé...\n");
    }//GEN-LAST:event_demarrerActionPerformed

    private void arreterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arreterActionPerformed
        try {
            Thread .sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Send("Le serveur est arreter ");
        Affichage.append("Serveur en arret...\n");

        Affichage.setText("");

    }//GEN-LAST:event_arreterActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Affichage.setText("");
    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Affichage;
    private javax.swing.JButton arreter;
    private javax.swing.JButton clear;
    private javax.swing.JButton demarrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField portserveur;
    // End of variables declaration//GEN-END:variables
}
