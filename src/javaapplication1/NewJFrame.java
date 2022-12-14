/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author sergio.lima
 */
public class NewJFrame extends javax.swing.JFrame {

    Color corAtual1;
    Color corAtual2;
    
    enum TipoFigura {tpPonto,tpRetangulo};
    
    Ponto p = new Ponto();
    Retangulo r = new Retangulo();
    
    private TipoFigura tipoFigura = TipoFigura.tpPonto;
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jpPaint = new javax.swing.JPanel();
        BtnPonto = new javax.swing.JButton();
        cbArea = new java.awt.Checkbox();
        jpCor1 = new javax.swing.JPanel();
        jpCor2 = new javax.swing.JPanel();
        BtnRet = new javax.swing.JButton();
        BtnCor1 = new javax.swing.JButton();
        BtnCor2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(java.awt.Color.white);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jpPaint.setBackground(new java.awt.Color(255, 255, 204));
        jpPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpPaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpPaintMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpPaintLayout = new javax.swing.GroupLayout(jpPaint);
        jpPaint.setLayout(jpPaintLayout);
        jpPaintLayout.setHorizontalGroup(
            jpPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jpPaintLayout.setVerticalGroup(
            jpPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        BtnPonto.setText("Ponto");
        BtnPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPontoMouseClicked(evt);
            }
        });

        cbArea.setLabel("??rea");

        jpCor1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jpCor1Layout = new javax.swing.GroupLayout(jpCor1);
        jpCor1.setLayout(jpCor1Layout);
        jpCor1Layout.setHorizontalGroup(
            jpCor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jpCor1Layout.setVerticalGroup(
            jpCor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpCor2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jpCor2Layout = new javax.swing.GroupLayout(jpCor2);
        jpCor2.setLayout(jpCor2Layout);
        jpCor2Layout.setHorizontalGroup(
            jpCor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jpCor2Layout.setVerticalGroup(
            jpCor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BtnRet.setText("Ret??ngulo");
        BtnRet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRetMouseClicked(evt);
            }
        });

        BtnCor1.setText("Cor 1");
        BtnCor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCor1MouseClicked(evt);
            }
        });

        BtnCor2.setText("Cor 2");
        BtnCor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCor2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPonto)
                    .addComponent(BtnRet)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnCor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpCor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnCor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66)
                .addComponent(jpPaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpPaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRet)
                        .addGap(21, 21, 21)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpCor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpCor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(413, 413, 413))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:     
             
        
        
        
        
            
    }//GEN-LAST:event_formAncestorMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        
                
        
    }//GEN-LAST:event_formMousePressed

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
    
    }//GEN-LAST:event_panelMousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseReleased

    private void BtnPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPontoMouseClicked
        // TODO add your handling code here:
        tipoFigura = TipoFigura.tpPonto;  
    }//GEN-LAST:event_BtnPontoMouseClicked

    private void BtnRetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRetMouseClicked
        // TODO add your handling code here:
        tipoFigura = TipoFigura.tpRetangulo;  
    }//GEN-LAST:event_BtnRetMouseClicked

    private void jpPaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPaintMousePressed
        // TODO add your handling code here:
        if (tipoFigura == TipoFigura.tpPonto){
            p.x = evt.getX();
            p.y = evt.getY();
            p.cor = jpCor1.getBackground();
            p.desenhar(jpPaint.getGraphics());
        }
        else if (tipoFigura == TipoFigura.tpRetangulo) {
            r.x = evt.getX();
            r.y = evt.getY();       
            
        }
            
            
    }//GEN-LAST:event_jpPaintMousePressed

    private void jpPaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPaintMouseReleased
        // TODO add your handling code here:
        if (tipoFigura == TipoFigura.tpRetangulo) {
            
            //r.corInterna = JColorChooser.showDialog(null, "Escolha uma cor: ", Color.BLACK);
            
            r.base = evt.getX() - r.x;
            r.largura = evt.getY()- r.y;       
            r.cor = jpCor1.getBackground();
            r.corInterna = corAtual2;
            r.showArea = cbArea.getState();
            r.desenhar(jpPaint.getGraphics());
        }
    }//GEN-LAST:event_jpPaintMouseReleased

    private void BtnCor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCor1MouseClicked
        corAtual1 = JColorChooser.showDialog(null, "Escolha uma cor: ", Color.BLACK);
        jpCor1.setBackground(corAtual1);
    }//GEN-LAST:event_BtnCor1MouseClicked

    private void BtnCor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCor2MouseClicked
        corAtual2 = JColorChooser.showDialog(null, "Escolha uma cor: ", Color.BLACK);
        jpCor2.setBackground(corAtual2);
    }//GEN-LAST:event_BtnCor2MouseClicked
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCor1;
    private javax.swing.JButton BtnCor2;
    private javax.swing.JButton BtnPonto;
    private javax.swing.JButton BtnRet;
    private java.awt.Canvas canvas1;
    private java.awt.Checkbox cbArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpCor1;
    private javax.swing.JPanel jpCor2;
    private javax.swing.JPanel jpPaint;
    // End of variables declaration//GEN-END:variables
}
