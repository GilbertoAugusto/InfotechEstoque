/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.CLIENTES;

/**
 *
 * @author Gilberto
 */
public class frmCadastraClientes extends javax.swing.JInternalFrame {

    
   public  void addContainaerBox(){
   
        cbbEstado.addItem("Null");
	cbbEstado.addItem("AC	"); 
	cbbEstado.addItem("AL	"); 
	cbbEstado.addItem("AP	"); 
	cbbEstado.addItem("AM	 ");
	cbbEstado.addItem("BA	 ");
	cbbEstado.addItem("CE	 ");
 	cbbEstado.addItem("DF	 ");
 	cbbEstado.addItem("ES	 ");
	cbbEstado.addItem("GO	 ");
	cbbEstado.addItem("MA	 ");
 	cbbEstado.addItem("MT	 ");
   	cbbEstado.addItem("MS	 ");
 	cbbEstado.addItem("MG	 ");
	cbbEstado.addItem("PA	 ");
	cbbEstado.addItem("PB	 ");
	cbbEstado.addItem("PR	 ");
	cbbEstado.addItem("PE	 ");
	cbbEstado.addItem("PI	 ");
  	cbbEstado.addItem("RJ	 ");
   	cbbEstado.addItem("RN	 ");
   	cbbEstado.addItem("RS	 ");
	cbbEstado.addItem("RO	 ");
	cbbEstado.addItem("RR	 ");
 	cbbEstado.addItem("SC	 ");
 	cbbEstado.addItem("SP	 ");
	cbbEstado.addItem("SE	 ");
	cbbEstado.addItem("TO");


        cbbCidade.addItem("");
        cbbCidade.addItem("Arujá,Barueri");
        cbbCidade.addItem("Biritiba-Mirim");
        cbbCidade.addItem(" Caieiras");
        cbbCidade.addItem("Cajamar");
        cbbCidade.addItem("Carapicuíba");
        cbbCidade.addItem("Cotia");
        cbbCidade.addItem("Diadema");
        cbbCidade.addItem("Embu");
        cbbCidade.addItem(" Embu-Guaçu");
        cbbCidade.addItem(" Ferraz de Vasconcelos");
        cbbCidade.addItem("Francisco Morato");
        cbbCidade.addItem(" Franco da Rocha");
        cbbCidade.addItem("Guararema");
        cbbCidade.addItem("Guarulhos");
        cbbCidade.addItem("Itapevi");
        cbbCidade.addItem(" Itapecerica da Serra");
        cbbCidade.addItem(" Itaquaquecetuba");
        cbbCidade.addItem(" JandirA");
        cbbCidade.addItem("Juquitiba");
        cbbCidade.addItem(" Mairiporã");
        cbbCidade.addItem(" Mauá");
        cbbCidade.addItem(" Mogi das Cruzes");
        cbbCidade.addItem("Osasco");
        cbbCidade.addItem(" Pirapora do Bom Jesus");
        cbbCidade.addItem(" Poá");
        cbbCidade.addItem(" Ribeirão Pires");
        cbbCidade.addItem("Rio Grande da Serra");
        cbbCidade.addItem(" Salesópolis");
        cbbCidade.addItem(" Santa Isabel");
        cbbCidade.addItem(" Santana de Parnaíba");
        cbbCidade.addItem(" Santo André");
        cbbCidade.addItem("São Bernardo do Campo");
        cbbCidade.addItem(" São Caetano do Sul ");
        cbbCidade.addItem("São Lourenço da Serra");
        cbbCidade.addItem(" São Paulo");
        cbbCidade.addItem(" Suzano");
        cbbCidade.addItem(" Taboão da Serra ");
        cbbCidade.addItem(" Vargem Grande Paulista"); 
   }
    
    
    
    
    
    public frmCadastraClientes() {
        initComponents();
        addContainaerBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Cnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        Cnpj1 = new javax.swing.JLabel();
        txtIncricaoEstadual = new javax.swing.JFormattedTextField();
        Cnpj2 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        Cnpj3 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        Cnpj4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        Cnpj5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Cnpj6 = new javax.swing.JLabel();
        txtCnpj1 = new javax.swing.JFormattedTextField();
        Cnpj7 = new javax.swing.JLabel();
        txtIncricaoEstadual1 = new javax.swing.JFormattedTextField();
        Cnpj8 = new javax.swing.JLabel();
        txtRazaoSocial1 = new javax.swing.JTextField();
        Cnpj9 = new javax.swing.JLabel();
        txtNomeFantasia1 = new javax.swing.JTextField();
        Cnpj10 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        Cnpj11 = new javax.swing.JLabel();
        txtCep1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Cnpj12 = new javax.swing.JLabel();
        Cnpj13 = new javax.swing.JLabel();
        cbbEstado = new javax.swing.JComboBox<>();
        cbbCidade = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        Cnpj.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj.setText("Cnpj:");

        txtCnpj.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj1.setText("Incrição Estadual:");

        txtIncricaoEstadual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            txtIncricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIncricaoEstadual.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj2.setText("Razao Social :");

        txtRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj3.setText("Nome Fantasia:");

        txtNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj4.setText("Endereço :");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj5.setText("CEP :");

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton1.setText("Avançar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cnpj5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaoSocial)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIncricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 721, Short.MAX_VALUE))
                            .addComponent(txtNomeFantasia)
                            .addComponent(txtEndereco)
                            .addComponent(txtCep)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIncricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        Cnpj6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj6.setText("Telefone :");

        txtCnpj1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            txtCnpj1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj7.setText("Celular :");

        txtIncricaoEstadual1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            txtIncricaoEstadual1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIncricaoEstadual1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj8.setText("Contato :");

        txtRazaoSocial1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj9.setText("Email :");

        txtNomeFantasia1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj10.setText("Usuario :");

        txtEndereco1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        Cnpj11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj11.setText("CEP :");

        txtCep1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton2.setText("Salvar");

        Cnpj12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj12.setText("Cidade :");

        Cnpj13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cnpj13.setText("Estado :");

        cbbEstado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbCidade.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cnpj11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cnpj7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaoSocial1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIncricaoEstadual1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cnpj12, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(Cnpj13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbCidade, 0, 206, Short.MAX_VALUE)
                                    .addComponent(cbbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11))
                            .addComponent(txtNomeFantasia1)
                            .addComponent(txtEndereco1)
                            .addComponent(txtCep1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaoSocial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFantasia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cnpj7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIncricaoEstadual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cnpj6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cnpj12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cnpj13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 388, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Cadastrais", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cnpj;
    private javax.swing.JLabel Cnpj1;
    private javax.swing.JLabel Cnpj10;
    private javax.swing.JLabel Cnpj11;
    private javax.swing.JLabel Cnpj12;
    private javax.swing.JLabel Cnpj13;
    private javax.swing.JLabel Cnpj2;
    private javax.swing.JLabel Cnpj3;
    private javax.swing.JLabel Cnpj4;
    private javax.swing.JLabel Cnpj5;
    private javax.swing.JLabel Cnpj6;
    private javax.swing.JLabel Cnpj7;
    private javax.swing.JLabel Cnpj8;
    private javax.swing.JLabel Cnpj9;
    private javax.swing.JComboBox<String> cbbCidade;
    private javax.swing.JComboBox<String> cbbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCep1;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JFormattedTextField txtCnpj1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JFormattedTextField txtIncricaoEstadual;
    private javax.swing.JFormattedTextField txtIncricaoEstadual1;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNomeFantasia1;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtRazaoSocial1;
    // End of variables declaration//GEN-END:variables
}
