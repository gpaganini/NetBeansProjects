package rh.visao;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaCargo extends JFrame {
    private JTextField jtfNome = new JTextField(10);
    private JLabel lbMsg = new JLabel();
    private JLabel lbResp = new JLabel();
    private JComboBox<String> cbSexo = new JComboBox<>();
    private JCheckBox cxMaioridade = new JCheckBox("Sou maior de 18 anos!");
    private JRadioButton rbAmigo = new JRadioButton("Um amigo");
    private JRadioButton rbAnuncio = new JRadioButton("Um anuncio na internet");
    private JRadioButton rbSozinho = new JRadioButton("Encontrei sozinho");
    private JTextArea taSeuComentario = new JTextArea(5, 30);
    
    public TelaCargo() throws HeadlessException {
        super("Cadastro/Alteração de Cargos");
        this.setLayout(new FlowLayout());
        Container p = this.getContentPane();
        
        cbSexo.addItem("Masculino");
        cbSexo.addItem("Feminino");
        
        p.add(new JLabel("Nome: "));        
        p.add(jtfNome);        
        
        if(jtfNome.getText() == null){
            lbMsg.setText("Por favor digite o nome!");
        }
        
        p.add(cbSexo);  
        
        JButton btOk = new JButton("Me aperte!");        
        p.add(btOk);
        
        JButton btEntrar = new JButton("Clique aqui para entrar!");
        p.add(btEntrar);
        
        p.add(cxMaioridade);
        //cbSexo.setSelectedIndex(0); se true = marcado
        cxMaioridade.isSelected(); //saber o que esta marcado; boolean
        p.add(rbAmigo);
        p.add(rbAnuncio);
        p.add(rbSozinho);
        
        ButtonGroup bgZona = new ButtonGroup();
        //agrupamento lógico, nao aparece na tela, inserção dos componentes do container painel
        bgZona.add(rbAmigo);
        bgZona.add(rbAnuncio);
        bgZona.add(rbSozinho);
        
        p.add(taSeuComentario);
        
        p.add(lbMsg);
        p.add(lbResp);
        
        
        
        btOk.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                          if(cbSexo.getSelectedIndex() == 0) {
                              lbMsg.setText("Boa noite, Sr. ".concat(jtfNome.getText()));
                           } else {
                              lbMsg.setText("Boa noite, Sra. ".concat(jtfNome.getText()));
                          }                          
                    }
        }
        );
        
        btEntrar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                lbResp.setText("\nVsa ".concat(cbSexo.getSelectedIndex()==0?"Sr. ":"Sra. ")
                        .concat(jtfNome.getText())
                        .concat(" pode entrar!"));
            }
        });
        
        
        this.setSize(800,600);        
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
    }
}
