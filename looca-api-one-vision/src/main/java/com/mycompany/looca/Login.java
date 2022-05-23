package com.mycompany.looca;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Login extends javax.swing.JFrame {

    Slack2 slack = new Slack2();
    Connection config = new Connection();
    JdbcTemplate template = new JdbcTemplate(config.getDataSource());
    Integer idMaquina;
    Looca looca = new Looca();
    Sistema sistema = looca.getSistema();
    Memoria memoria = looca.getMemoria();
    Processador processador = looca.getProcessador();
    DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
    ProcessosGroup grupoDeProcessos = new ProcessosGroup();
    ServicosGroup grupoDeServicos = new ServicosGroup();

    List<Processo> processos = grupoDeProcessos.getProcessos();
    List<Servico> servicos = grupoDeServicos.getServicos();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        fraseLogin = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(690, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Realize seu Login");

        jLabel2.setText("E-mail:");

        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha:");

        btnEntrar.setBackground(new java.awt.Color(244, 133, 23));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-icon.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password-icon.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoV1.png"))); // NOI18N
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jSeparator3)
                .addGap(843, 843, 843))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(txtSenha)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(fraseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fraseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {

            String email = txtEmail.getText();
            String senha = txtSenha.getText();
            List<Usuario> listaLoginUsuario = template.query("SELECT idUsuario, fkEmpresa, Email, Senha FROM Usuario WHERE Email = '" + email + "' AND Senha = '" + senha + "';",
                    new BeanPropertyRowMapper<>(Usuario.class));

            if (listaLoginUsuario.isEmpty()) {
                fraseLogin.setText("Insira email e senha corretos");
                fraseLogin.setForeground(Color.red);
                txtEmail.setText("");
                txtSenha.setText("");
            } else {
                txtEmail.setText("");
                txtSenha.setText("");

                Usuario usuario = listaLoginUsuario.get(0);

                template.update("insert into maquina ( hostName, fkUsuario, fkEmpresa) values"
                        + "(?,?,?)",
                        InetAddress.getLocalHost().getHostName(), usuario.getIdUsuario(), usuario.getFkEmpresa());

                Maquina maquina = new Maquina();

                this.idMaquina = maquina.getIdMaquina(usuario);

                System.out.println(String.format("Você entrou com o email: %s", email));
                fraseLogin.setText("Login efetuado com sucesso!");
                fraseLogin.setForeground(Color.blue);

                BigDecimal totalRAM = new BigDecimal(looca.getMemoria().getTotal().doubleValue() / 1073741824).setScale(2, RoundingMode.HALF_EVEN);
                BigDecimal totalCPU = new BigDecimal(looca.getProcessador().getFrequencia() / 1e+9).setScale(2, RoundingMode.HALF_EVEN);
                BigDecimal totalDisco = new BigDecimal(looca.getGrupoDeDiscos().getTamanhoTotal().doubleValue() / 1e+9).setScale(0, RoundingMode.HALF_EVEN);

                InetAddress.getLocalHost().getHostName();

                List<Volume> volumes = grupoDeDiscos.getVolumes();
                Double discoDisponivel = 0.0;

                for (Volume volume : volumes) {
                    discoDisponivel = discoDisponivel + volume.getDisponivel();
                }

                BigDecimal consumoRAM = new BigDecimal(looca.getMemoria().getEmUso().doubleValue() / 1073741824).setScale(2, RoundingMode.HALF_EVEN);
                BigDecimal percentualCPU = new BigDecimal(looca.getProcessador().getUso()).setScale(2, RoundingMode.HALF_EVEN);
                BigDecimal consumoDisco = new BigDecimal(discoDisponivel / 1e+9).setScale(0, RoundingMode.HALF_EVEN);

                System.out.println("Tamanho lista " + processos.size());

                template.update("insert into componenteMaquina (totalComponente, unidadeMedida,  fkComponente, fkMaquina) values"
                        + "(?,?,?,?)",
                        totalRAM, "GB", "1", this.idMaquina);

                template.update("insert into componenteMaquina (totalComponente, unidadeMedida,  fkComponente, fkMaquina) values"
                        + "(?,?,?,?)",
                        totalDisco, "GB", "2", this.idMaquina);

                template.update("insert into componenteMaquina (totalComponente, unidadeMedida,  fkComponente, fkMaquina) values"
                        + "(?,?,?,?)",
                        totalCPU, "GHz", "3", this.idMaquina);

                //conferir se a porcentagem está correta;
                Double RAM = (consumoRAM.doubleValue()*100)/totalRAM.doubleValue();
                Double Disco = (consumoDisco.doubleValue()*100)/totalDisco.doubleValue();
                Double CPU = percentualCPU.doubleValue(); //já está em porcentagem?
                
                
                //pensar nas métricas (muito alerta no slack);
                if(RAM <= 50.0) {
                    Slack2.slackMsg("Teste");
                } else if (RAM > 50.0) {
                    Slack2.slackMsg("Teste");
                } else if (RAM > 80.0) {
                    Slack2.slackMsg("Teste");
                }

                if (Disco <= 50) {
                    Slack2.slackMsg("Teste");
                } else if (Disco > 50) {
                    Slack2.slackMsg("Teste");
                } else if (Disco > 80) {
                    Slack2.slackMsg("Teste");
                }

                if (CPU <= 50) {
                    Slack2.slackMsg("Teste");
                } else if (CPU > 50) {
                    Slack2.slackMsg("Teste");
                } else if (CPU > 80) {
                    Slack2.slackMsg("Teste");
                }

                this.setVisible(false);

                Integer index = 0;

                List<Processo> processosValidos = new ArrayList<>();

                for (Processo processo : processos) {
                    if (processo.getUsoCpu() > 0.1 && processo.getUsoMemoria() > 0.1) {
                        processosValidos.add(processo);
                    }
                }

                while (true) {
                    Date data = new Date();
                    SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dataFormatada = formatar.format(data);
                    Programa programa = new Programa();
                    if (1 + 1 != 2) {

                        Slack2.slackMsg("Teste");
                    } else {
                        if (index <= processosValidos.size()) {

                            String nomePrograma = processos.get(index).getNome();

                            Double usoCPU = processosValidos.get(index).getUsoCpu();
                            Double usoRAM = processosValidos.get(index).getUsoMemoria();

                            System.out.println("testeRAM" + consumoRAM);
                            System.out.println("testeDISCO" + consumoDisco);
                            System.out.println("testeCPU" + percentualCPU);

                            template.update("insert into programa (nomePrograma, fkMaquina) values (?,?)",
                                    nomePrograma, this.idMaquina);

                            template.update("insert into registroPrograma (consumoCPU, consumoMemoria, dataHora, fkPrograma) values"
                                    + " (?,?,?,?)",
                                    usoCPU, usoRAM, dataFormatada, programa.getIdPrograma(maquina, usuario, index));

                            index++;
                        }

                        System.out.println(processos.get(index));

                        template.update("insert into registroComponente (dataHora, consumo, fkComponenteMaquina) values"
                                + "(?,?,?)",
                                dataFormatada, consumoRAM, 8);

                        template.update("insert into registroComponente (dataHora, consumo, fkComponenteMaquina) values"
                                + "(?,?,?)",
                                dataFormatada, consumoDisco, 9);

                        template.update("insert into registroComponente (dataHora, consumo, fkComponenteMaquina) values"
                                + "(?,?,?)",
                                dataFormatada, percentualCPU, 10);

                        System.out.println("teste");

                        Thread.sleep(20000L);

                    }
                    
                    //após o login, a tela fecha continua a captura de dados;
                    this.dispose();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }

            public void hide() {
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel fraseLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}