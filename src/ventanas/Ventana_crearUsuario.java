/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import ventanas.Ventana_login;
import clases.Usuario;
import clases.contar_usuario;
import clases.contrasena;
import ventanas.Ventana_cargarImagen;
import java.io.File;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author megan
 */
public class Ventana_crearUsuario extends javax.swing.JFrame {
    File archivo;    //file que va a contener el archivo
    
    
    /**
     * Creates new form Ventana_crearUsuario
     */
    public Ventana_crearUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_imagen = new javax.swing.JButton();
        jPath = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Crear usuario:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Contraseña:");

        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setText("Correo alterno:");

        jLabel8.setText("Teléfono:");

        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });

        txt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApellidoKeyTyped(evt);
            }
        });

        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jButton1.setText("Crear usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Fotografía:");

        btn_imagen.setText("Agregar");
        btn_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagenActionPerformed(evt);
            }
        });

        jPath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPathKeyTyped(evt);
            }
        });

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });

        jLabel10.setText("Nivel: ");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Nombre)
                                    .addComponent(txt_Apellido)
                                    .addComponent(txt_usuario)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txt_telefono)
                                    .addComponent(txt_correo))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 153, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jPath, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btn_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Crear un nuevo usuario
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
    
        String strError="";
        File usuario = new File("C:\\MEIA\\usuario.txt");
        File bitacoraUsuario = new File("C:\\MEIA\\bitacora_usuario.txt");
        
        String Nombre= txt_Nombre.getText();
        String Apellido= txt_Apellido.getText();
        String Usuario = txt_usuario.getText();
        String Correo = txt_correo.getText();
        int Telefono = Integer.parseInt(txt_telefono.getText());
        Date Fecha = jCalendar1.getDate();
        String Password = new String(jPasswordField1.getPassword());
        String Path = jPath.getText();
        
        String resultado = contrasena.verificar(Password);
        
        if (resultado == "Debe ser mayor a 6 caracteres." || resultado == "Contraseña Insegura" | resultado == "Contraseña poco Segura") {
            
            jLabel10.setText(resultado);
            jPasswordField1.setText("");
        }
        else
        {   
            jLabel10.setText(resultado);
            try {
                contar_usuario.contar();
            } catch (IOException ex) {
                Logger.getLogger(Ventana_crearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try{
                
                BufferedReader usuariol = new BufferedReader(new FileReader(usuario));
                BufferedReader bitacoraUsuariol = new BufferedReader(new FileReader(bitacoraUsuario));

                String[] columnas;
                String[] columnas2;
                String lineaArchivo1;
                String lineaArchivo2;

                boolean encontro= false;  
                if((lineaArchivo1 = usuariol.readLine()) == null && (lineaArchivo2 = bitacoraUsuariol.readLine())==null ){
                    Usuario usuarioNuevo = new Usuario(Usuario,Nombre,Apellido, getMD5(Password),1 ,Fecha, Correo, Telefono,Path, 1);
                    if(LlenarArchivo("C:\\MEIA\\usuario.txt", usuarioNuevo.toString(), strError)){
                        JOptionPane.showMessageDialog(null, "Se ingreso correctamente el registro: ", "Guardar", WIDTH);
                        Ventana_login login = new Ventana_login();
                        login.setVisible(true);
                        this.dispose();
                    }
                }
                else{
                    
                    while((lineaArchivo1 =usuariol.readLine()) != null){
                        columnas=lineaArchivo1.split("\\|");
                        if(columnas[0].equals(Usuario)){
                            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
                            encontro = true;
                        }
                    }
                    while((lineaArchivo2 = bitacoraUsuariol.readLine()) != null && encontro== false ){
                        columnas2 = lineaArchivo2.split(";");
                        if(columnas2[0].equals(Usuario)){
                            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
                            encontro = true;
                        }
                    }
                    if(encontro == false){
                        Usuario usuarioNuevo = new Usuario(Usuario,Nombre,Apellido, getMD5(Password) ,0 ,Fecha, Correo, Telefono,Path, 1);
                        if(LlenarArchivo("C:\\MEIA\\usuario.txt", usuarioNuevo.toString(), strError)){
                            JOptionPane.showMessageDialog(null, "Se ingreso correctamente el registro: ", "Guardar", WIDTH);
                            Ventana_login login = new Ventana_login();
                            login.setVisible(true);
                            this.dispose();
                        }
                    } 
                }
            }
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "Error " + error);
            }                
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagenActionPerformed
        int resultado;
        Ventana_cargarImagen buscarImagen = new Ventana_cargarImagen();
        FileNameExtensionFilter formatoArchivo = new FileNameExtensionFilter("JPG, PNG", "png","jpg"); //colocar formato en flitros
        buscarImagen.jFileChooser1.setFileFilter(formatoArchivo);
        
        resultado = buscarImagen.jFileChooser1.showOpenDialog(null); //guardar el resultado de ok o cancelar
        
        if(JFileChooser.APPROVE_OPTION == resultado){
            archivo = buscarImagen.jFileChooser1.getSelectedFile();
            jPath.setText(archivo.getAbsolutePath()); //accedo a la ruta
            
            try{
                ImageIcon imagenUusuario = new ImageIcon(archivo.toString());
                
            }
            catch (Exception error){
                JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo: " + error);
            }
            
        }
        
        
        
    }//GEN-LAST:event_btn_imagenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Ventana_login ventana = new Ventana_login();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        if(txt_Nombre.getText().length()>=30){
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApellidoKeyTyped
        if(txt_Apellido.getText().length()>=30){
            evt.consume();
        }
    }//GEN-LAST:event_txt_ApellidoKeyTyped

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        if(txt_usuario.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
       if(jPasswordField1.getText().length()>=40){
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
        if(txt_correo.getText().length()>=40){
            evt.consume();
        }
    }//GEN-LAST:event_txt_correoKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        if(txt_telefono.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void jPathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPathKeyTyped
        if(jPath.getText().length()>=200){
            evt.consume();
        }
    }//GEN-LAST:event_jPathKeyTyped

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
            java.util.logging.Logger.getLogger(Ventana_crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_crearUsuario().setVisible(true);
            }
        });
    }
    
    /**
     * Metodo para guardar en el archivo de texto
     * @param strPath
     * @param strContenido
     * @param strError
     * @return 
     */
    
    public boolean LlenarArchivo(String strPath,String strContenido,String strError) throws IOException
    {
        FileWriter fw = null; 
        BufferedWriter bw = null; 
        PrintWriter pw = null;
        
        try
        {
            fw = new FileWriter(strPath, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw); 
            
            pw.println(strContenido);   
            pw.flush();                   
        }
        finally 
        {
            try
            {
                pw.close();
                bw.close();
                fw.close();
                return true;
                
            }
            catch (IOException io)
            {
                JOptionPane.showMessageDialog(null, "Error " + io);
                return false;
            }
        }
        
    }
    
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jPath;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
