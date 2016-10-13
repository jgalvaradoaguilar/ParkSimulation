/*
 * CentralDeControlUI.java
 *
 * Created on 11 de agosto de 2008, 4:31
 */

package mi.parque;
import javax.swing.*;

/**
 *
 * @author  owner
 */
public class CentralDeControlUI extends javax.swing.JPanel {

    /** Creates new form CentralDeControlUI */
    public CentralDeControlUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acceder_todas = new javax.swing.JButton();
        acceder_noria = new javax.swing.JButton();
        acceder_montania = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Central de control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        acceder_todas.setText("Acceder a todas las atracciones");
        acceder_todas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceder_todasActionPerformed(evt);
            }
        });

        acceder_noria.setText("Acceder a la noria");
        acceder_noria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceder_noriaActionPerformed(evt);
            }
        });

        acceder_montania.setText("Acceder a la montaña rusa");
        acceder_montania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceder_montaniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(acceder_todas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceder_noria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceder_montania, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(acceder_todas)
                .addGap(18, 18, 18)
                .addComponent(acceder_noria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceder_montania)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void acceder_montaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceder_montaniaActionPerformed
// TODO add your handling code here:
    DatosDeCentralUI rec = new DatosDeCentralUI();
    if(JOptionPane.showConfirmDialog(this, rec, "Introduzca datos",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
    == JOptionPane.OK_OPTION) {
    //Recogida datos RELLENAR
    String velocidad=rec.velocidad_pedida();
    //Procesamos los datos recogidos
    if (velocidad.equals("normal")){
        ParqueUI.montania.velocidad=8;
        ParqueUI.mi_consola.append("Se ha establecido la Montaña Rusa a velocidad NORMAL\n");
    }
    if (velocidad.equals("lento")){
        ParqueUI.montania.velocidad=4;
        ParqueUI.mi_consola.append("Se ha establecido la Montaña Rusa a velocidad LENTO\n");
    }
    if (velocidad.equals("rápido")){
        ParqueUI.montania.velocidad=12;
        ParqueUI.mi_consola.append("Se ha establecido la Montaña Rusa a velocidad RÁPIDO\n");
    }
    }
}//GEN-LAST:event_acceder_montaniaActionPerformed

private void acceder_todasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceder_todasActionPerformed
// TODO add your handling code here:
    DatosDeCentralUI rec = new DatosDeCentralUI();
    if(JOptionPane.showConfirmDialog(this, rec, "Introduzca datos",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
    == JOptionPane.OK_OPTION) {
    //Recogida datos RELLENAR
    String velocidad=rec.velocidad_pedida();
    //Procesamos los datos recogidos
    if (velocidad.equals("normal")){
        ParqueUI.noria.velocidad=4;
        ParqueUI.montania.velocidad=8;
        ParqueUI.mi_consola.append("Se han establecido todas las atracciones a velocidad NORMAL\n");
    }
    if (velocidad.equals("lento")){
        ParqueUI.noria.velocidad=2;
        ParqueUI.montania.velocidad=4;
        ParqueUI.mi_consola.append("Se han establecido todas las atracciones a velocidad LENTO\n");
    }
    if (velocidad.equals("rápido")){
        ParqueUI.noria.velocidad=6;
        ParqueUI.montania.velocidad=12;
        ParqueUI.mi_consola.append("Se han establecido todas las atracciones a velocidad RÁPIDO\n");
    }
    }
}//GEN-LAST:event_acceder_todasActionPerformed

private void acceder_noriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceder_noriaActionPerformed
// TODO add your handling code here:
    DatosDeCentralUI rec = new DatosDeCentralUI();
    if(JOptionPane.showConfirmDialog(this, rec, "Introduzca datos",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
    == JOptionPane.OK_OPTION) {
    //Recogida datos RELLENAR
    String velocidad=rec.velocidad_pedida();
    //Procesamos los datos recogidos
    if (velocidad.equals("normal")){
        ParqueUI.noria.velocidad=4;
        ParqueUI.mi_consola.append("Se ha establecido la Noria a velocidad NORMAL\n");
    }
    if (velocidad.equals("lento")){
        ParqueUI.noria.velocidad=2;
        ParqueUI.mi_consola.append("Se ha establecido la Noria a velocidad LENTO\n");
    }
    if (velocidad.equals("rápido")){
        ParqueUI.noria.velocidad=6;
        ParqueUI.mi_consola.append("Se ha establecido la Noria a velocidad RÁPIDO\n");
    }
    }   
}//GEN-LAST:event_acceder_noriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder_montania;
    private javax.swing.JButton acceder_noria;
    private javax.swing.JButton acceder_todas;
    // End of variables declaration//GEN-END:variables

}
