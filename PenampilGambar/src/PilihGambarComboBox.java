import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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

        ComboBoxPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();
        pCardLayout = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(390, 530));

        ComboBoxPanel.setBackground(new java.awt.Color(0, 102, 102));
        ComboBoxPanel.setPreferredSize(new java.awt.Dimension(269, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pilih Gambar");
        ComboBoxPanel.add(jLabel1);

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Disini --", "HTML", "JAVA", "PYTHON" }));
        pilihan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanItemStateChanged(evt);
            }
        });
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });
        ComboBoxPanel.add(pilihan);

        getContentPane().add(ComboBoxPanel, java.awt.BorderLayout.PAGE_START);

        pCardLayout.setBackground(new java.awt.Color(153, 153, 153));
        pCardLayout.setMaximumSize(new java.awt.Dimension(375, 499));
        pCardLayout.setMinimumSize(new java.awt.Dimension(375, 499));
        pCardLayout.setPreferredSize(new java.awt.Dimension(375, 499));
        pCardLayout.setLayout(new java.awt.CardLayout());

        pic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pCardLayout.add(pic, "0");
        pic.getAccessibleContext().setAccessibleName("0");

        getContentPane().add(pCardLayout, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed

      
    }//GEN-LAST:event_pilihanActionPerformed

    private void pilihanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanItemStateChanged
        if (pilihan.getSelectedItem()=="Pilih Disini"){
            pic.setIcon(null);
        }else if (pilihan.getSelectedItem()=="HTML"){
            ImageIcon picture = new ImageIcon("src/img/HtmlBook.jpg");
            pic.setIcon(picture);
        }else if (pilihan.getSelectedItem()=="JAVA"){
            ImageIcon picture = new ImageIcon("src/img/JavaBook.jpg");
            pic.setIcon(picture);
        }else if (pilihan.getSelectedItem()=="PYTHON"){
            ImageIcon picture = new ImageIcon("src/img/PythonBook.jpg");
            pic.setIcon(picture);
    }//GEN-LAST:event_pilihanItemStateChanged
    }
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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComboBoxPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pCardLayout;
    private javax.swing.JLabel pic;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables
}
