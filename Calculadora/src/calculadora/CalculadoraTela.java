/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Giovani Paganini
 */
public class CalculadoraTela extends javax.swing.JFrame {
    /**
     * Creates new form CalculadoraTela
     */
    public CalculadoraTela() {
        super("Calculator2000");
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculadora = new javax.swing.JTextPane();
        botaoCE = new javax.swing.JButton();
        botaoMultiplica = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoDivisao = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botaoSoma = new javax.swing.JButton();
        botaoResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jScrollPane1.setViewportView(visorCalculadora);

        botaoCE.setText("CE");
        botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCEMouseClicked(evt);
            }
        });

        botaoMultiplica.setText("*");
        botaoMultiplica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMultiplicaMouseClicked(evt);
            }
        });

        botao1.setText("1");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });

        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });

        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });

        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });

        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });

        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });

        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });

        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });

        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });

        botao0.setText("0");
        botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao0MouseClicked(evt);
            }
        });

        botaoDivisao.setText("/");
        botaoDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDivisaoMouseClicked(evt);
            }
        });

        botaoSubtracao.setText("-");
        botaoSubtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSubtracaoMouseClicked(evt);
            }
        });

        botaoSoma.setText("+");
        botaoSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSomaMouseClicked(evt);
            }
        });

        botaoResultado.setText("=");
        botaoResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoResultadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(botao4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(botao7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao9))
                            .addComponent(botao0, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(botaoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(botao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao3))
                            .addComponent(botaoCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoMultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMultiplica)
                    .addComponent(botaoCE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1)
                    .addComponent(botao2)
                    .addComponent(botao3)
                    .addComponent(botaoDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao4)
                    .addComponent(botao5)
                    .addComponent(botao6)
                    .addComponent(botaoSubtracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao7)
                    .addComponent(botao8)
                    .addComponent(botao9)
                    .addComponent(botaoSoma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao0)
                    .addComponent(botaoResultado))
                .addGap(0, 57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCEMouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText("");
    }//GEN-LAST:event_botaoCEMouseClicked

    private void botaoMultiplicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMultiplicaMouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "*");
    }//GEN-LAST:event_botaoMultiplicaMouseClicked

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao1MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "1");
    }//GEN-LAST:event_botao1MouseClicked

    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "2");    
    }//GEN-LAST:event_botao2MouseClicked

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao3MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "3");    
    }//GEN-LAST:event_botao3MouseClicked

    private void botaoDivisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDivisaoMouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "/");    
    }//GEN-LAST:event_botaoDivisaoMouseClicked

    private void botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao4MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "4");    
    }//GEN-LAST:event_botao4MouseClicked

    private void botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao5MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "5");    
    }//GEN-LAST:event_botao5MouseClicked

    private void botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao6MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "6");    
    }//GEN-LAST:event_botao6MouseClicked

    private void botaoSubtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSubtracaoMouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "-");    
    }//GEN-LAST:event_botaoSubtracaoMouseClicked

    private void botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao7MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "7");    
    }//GEN-LAST:event_botao7MouseClicked

    private void botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao8MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "8");    
    }//GEN-LAST:event_botao8MouseClicked

    private void botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao9MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "9");    
    }//GEN-LAST:event_botao9MouseClicked

    private void botaoSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSomaMouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "+");    
    }//GEN-LAST:event_botaoSomaMouseClicked

    private void botao0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao0MouseClicked
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "0");
    }//GEN-LAST:event_botao0MouseClicked

    private void botaoResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoResultadoMouseClicked
        String valor = visorCalculadora.getText();
        System.out.println(">>>"+valor);
        Calculos calculos = new Calculos();
        String resultado = calculos.calculadora(valor);
        
        visorCalculadora.setText(resultado);
    }//GEN-LAST:event_botaoResultadoMouseClicked

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
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDivisao;
    private javax.swing.JButton botaoMultiplica;
    private javax.swing.JButton botaoResultado;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane visorCalculadora;
    // End of variables declaration//GEN-END:variables
}
