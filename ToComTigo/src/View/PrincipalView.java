package View;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import Model.*;
import DAO.*;
import util.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class PrincipalView extends javax.swing.JFrame {

    // Inicializando Objetos do modelo
    Cliente cliente = new Cliente();
    Funcionario funcionario = new Funcionario();
    Produto produto = new Produto();
    // Inicializando Objeto do banco
    ClienteDAO clientedao = new ClienteDAO();
    FuncionarioDAO funcionariodao = new FuncionarioDAO();
    ProdutoDAO produtodao = new ProdutoDAO();
    // Inicializando Listas
    List<Cliente> listaCliente;
    List<Funcionario> listaFuncionario;
    List<Produto> listaProduto;
    
    Document doc;
    public PrincipalView() {
        initComponents();
        
        clientes.setSize(941, 595);
        produtos.setSize(939, 570);
        funcionarios.setSize(995, 540);
        relatorios.setSize(995, 599);
        
        this.setLocationRelativeTo(null);
        clientes.setLocationRelativeTo(null);
        produtos.setLocationRelativeTo(null);
        funcionarios.setLocationRelativeTo(null);
        relatorios.setLocationRelativeTo(null);
        
        lblQuantidade.setText("500");
        txtRua.setDocument(new LimiteDigitos(15));
        
        listaCliente = new ArrayList<>();
        listaFuncionario = new ArrayList<>();
        listaProduto = new ArrayList<>();
        
        for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
            System.out.println( info.getName() );
        }
        atualizaTabelaCliente();
        atualizaTabelaFuncionario();
        atualizaTabelaProduto();
        txtIDCliente.setVisible(false);
        txtIDFuncionario.setVisible(false);
        txtIDProduto.setVisible(false);
        PreparaSalvareCancelarCliente();
        PreparaSalvareCancelarFuncionario();
        PreparaSalvareCancelarProduto();
        LimparCamposCliente();
        LimparCamposFuncionario();
        LimparCamposProduto();
        DesativaCamposCliente();
        DesativaCamposFuncionario();
        DesativaCamposProduto();
        btnAlterar.setEnabled(false);
        btnAlterar1.setEnabled(false);
        btnAlterar2.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnExcluir1.setEnabled(false);
        btnExcluir2.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientes = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlCliente = new javax.swing.JPanel();
        TablePaneCliente = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtBuscaCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnExcluir = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtNasc = new javax.swing.JFormattedTextField();
        RadioCpf = new javax.swing.JRadioButton();
        RadioRg = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        txtRua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        txtTelCom = new javax.swing.JFormattedTextField();
        txtCel = new javax.swing.JFormattedTextField();
        txtLimite = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        txtIDCliente = new javax.swing.JTextField();
        btnNovo = new javax.swing.JToggleButton();
        funcionarios = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        lblVoltar1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnlCliente1 = new javax.swing.JPanel();
        TablePaneFuncionario = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtBuscaFuncionario = new javax.swing.JTextField();
        btnBuscarFuncionario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        btnExcluir1 = new javax.swing.JToggleButton();
        btnAlterar1 = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCPF1 = new javax.swing.JFormattedTextField();
        txtRG1 = new javax.swing.JFormattedTextField();
        txtNasc1 = new javax.swing.JFormattedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtTel1 = new javax.swing.JFormattedTextField();
        txtFuncao = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JToggleButton();
        btnSalvar1 = new javax.swing.JToggleButton();
        txtIDFuncionario = new javax.swing.JTextField();
        btnNovo1 = new javax.swing.JToggleButton();
        produtos = new javax.swing.JFrame();
        jPanel15 = new javax.swing.JPanel();
        lblVoltar2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pnlCliente2 = new javax.swing.JPanel();
        TablePaneProduto = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        txtBuscaProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnExcluir2 = new javax.swing.JToggleButton();
        btnAlterar2 = new javax.swing.JToggleButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        txtUnidade = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNome2 = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        txtKilo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        sldQuantidade = new javax.swing.JSlider();
        lblQuantidade = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtIDProduto = new javax.swing.JTextField();
        btnCancelar2 = new javax.swing.JToggleButton();
        btnSalvar2 = new javax.swing.JToggleButton();
        btnNovo2 = new javax.swing.JToggleButton();
        relatorios = new javax.swing.JFrame();
        jPanel20 = new javax.swing.JPanel();
        lblVoltar3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        pnlCliente3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        txtRelatorioCliente = new javax.swing.JTextField();
        btnRelatorioCliente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRelatorioCliente = new javax.swing.JTable();
        btnGerarCliente = new javax.swing.JToggleButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        txtRelatorioProduto = new javax.swing.JTextField();
        btnRelatorioProduto = new javax.swing.JButton();
        btnGerarProduto = new javax.swing.JToggleButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblRelatorioProduto = new javax.swing.JTable();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        txtRelatorioFuncionario = new javax.swing.JTextField();
        btnRelatorioFuncionario = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRelatorioFuncionario = new javax.swing.JTable();
        btnGerarFuncionario = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlMenu = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        imgPerfil = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        clientes.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        clientes.setTitle("Clientes");
        clientes.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(137, 137, 137));

        lblVoltar.setFont(new java.awt.Font("Shruti", 0, 16)); // NOI18N
        lblVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar.setText("Voltar");
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Shruti", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clientes");

        pnlCliente.setBackground(new java.awt.Color(51, 51, 51));

        TablePaneCliente.setBackground(new java.awt.Color(201, 201, 201));
        TablePaneCliente.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TablePaneCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        TablePaneCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePaneClienteMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(211, 211, 211));

        jPanel4.setBackground(new java.awt.Color(211, 211, 211));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(175, 49, 49)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 1, 18), new java.awt.Color(17, 17, 17))); // NOI18N

        txtBuscaCliente.setBackground(new java.awt.Color(223, 231, 239));
        txtBuscaCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtBuscaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        btnBuscarCliente.setBackground(new java.awt.Color(181, 208, 221));
        btnBuscarCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 175, 190)));
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        tblCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnExcluir.setBackground(new java.awt.Color(200, 120, 120));
        btnExcluir.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(122, 45, 45));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 69, 69), 2));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(111, 189, 111));
        btnAlterar.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(33, 68, 33));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePaneCliente.addTab("Clientes", jPanel1);

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));

        jLabel3.setFont(new java.awt.Font("Shruti", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Novo Cliente");

        jPanel5.setBackground(new java.awt.Color(211, 211, 211));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(26, 26, 26));
        jLabel8.setText("CNPJ");

        jLabel4.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 26, 26));
        jLabel4.setText("Nome Completo");

        txtNome.setBackground(new java.awt.Color(231, 233, 237));
        txtNome.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setText("Pedrinho Nascimento de Pinto Rocha");
        txtNome.setToolTipText("Nome completo do cliente");
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNome.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(26, 26, 26));
        jLabel6.setText("CPF");

        jLabel7.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(26, 26, 26));
        jLabel7.setText("RG");

        jLabel9.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(26, 26, 26));
        jLabel9.setText("Data de Nacimento");

        txtCNPJ.setBackground(new java.awt.Color(231, 233, 237));
        txtCNPJ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCNPJ.setText("33.858.760/0001-93");
        txtCNPJ.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtCPF.setBackground(new java.awt.Color(231, 233, 237));
        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPF.setText("000.000.000-00");
        txtCPF.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtRG.setBackground(new java.awt.Color(231, 233, 237));
        txtRG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRG.setText("00.000.000");
        txtRG.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtNasc.setBackground(new java.awt.Color(231, 233, 237));
        txtNasc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNasc.setText("00/00/0000");
        txtNasc.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        RadioCpf.setBackground(new java.awt.Color(211, 211, 211));
        buttonGroup1.add(RadioCpf);
        RadioCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioCpfMouseClicked(evt);
            }
        });
        RadioCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCpfActionPerformed(evt);
            }
        });

        RadioRg.setBackground(new java.awt.Color(211, 211, 211));
        buttonGroup1.add(RadioRg);
        RadioRg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioRgMouseClicked(evt);
            }
        });
        RadioRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioRgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioCpf))
                            .addComponent(jLabel8)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RadioRg))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNasc)
                            .addComponent(txtRG, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(13, 13, 13))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(RadioCpf))
                    .addComponent(RadioRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF)
                    .addComponent(txtRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(211, 211, 211));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        txtRua.setBackground(new java.awt.Color(231, 233, 237));
        txtRua.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRua.setText("Rua Canavial de muita você sabe o quê");
        txtRua.setToolTipText("Nome completo do cliente");
        txtRua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtRua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRua.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtRua.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 26, 26));
        jLabel5.setText("Rua");

        txtBairro.setBackground(new java.awt.Color(231, 233, 237));
        txtBairro.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBairro.setText("Auto Boa Vista");
        txtBairro.setToolTipText("Nome completo do cliente");
        txtBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBairro.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtBairro.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(26, 26, 26));
        jLabel10.setText("Bairro");

        txtCidade.setBackground(new java.awt.Color(231, 233, 237));
        txtCidade.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCidade.setText("São José do Rio Preto");
        txtCidade.setToolTipText("Nome completo do cliente");
        txtCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCidade.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtCidade.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(26, 26, 26));
        jLabel11.setText("Cidade");

        txtComplemento.setBackground(new java.awt.Color(231, 233, 237));
        txtComplemento.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtComplemento.setText("Coisas aqui...");
        txtComplemento.setToolTipText("Nome completo do cliente");
        txtComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtComplemento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtComplemento.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtComplemento.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(26, 26, 26));
        jLabel13.setText("Complemento");

        txtPais.setBackground(new java.awt.Color(231, 233, 237));
        txtPais.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtPais.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPais.setText("Brasil");
        txtPais.setToolTipText("Nome completo do cliente");
        txtPais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtPais.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPais.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtPais.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(26, 26, 26));
        jLabel18.setText("País");

        txtNumero.setBackground(new java.awt.Color(231, 233, 237));
        txtNumero.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtNumero.setText("554");
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel38.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel38.setText("Número");

        txtCep.setBackground(new java.awt.Color(231, 233, 237));
        txtCep.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel36.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel36.setText("Cep");

        jLabel12.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(26, 26, 26));
        jLabel12.setText("Estado");

        txtEstado.setBackground(new java.awt.Color(231, 233, 237));
        txtEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtEstado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstado.setText("SP");
        txtEstado.setToolTipText("");
        txtEstado.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCep)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtNumero))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRua)
                    .addComponent(txtNumero))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCep)
                    .addComponent(txtCidade))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(211, 211, 211));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(26, 26, 26));
        jLabel14.setText("Telefone");

        jLabel15.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(26, 26, 26));
        jLabel15.setText("Telefone Comercial");

        jLabel16.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(26, 26, 26));
        jLabel16.setText("Celular");

        txtTel.setBackground(new java.awt.Color(231, 233, 237));
        txtTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTel.setText("(34) 0000-0000");
        txtTel.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtTelCom.setBackground(new java.awt.Color(231, 233, 237));
        txtTelCom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtTelCom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelCom.setText("(34) 0000-0000");
        txtTelCom.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtCel.setBackground(new java.awt.Color(231, 233, 237));
        txtCel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCel.setText("(34) 4 4444-4444");
        txtCel.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 296, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtLimite.setBackground(new java.awt.Color(231, 233, 237));
        txtLimite.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtLimite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimite.setText("1000.00");
        txtLimite.setToolTipText("Limite em Reais para comprar fiado na loja.");
        txtLimite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel17.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(26, 26, 26));
        jLabel17.setText("Limite");

        btnCancelar.setBackground(new java.awt.Color(200, 120, 120));
        btnCancelar.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(122, 45, 45));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 69, 69), 2));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(111, 189, 111));
        btnSalvar.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(33, 68, 33));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(111, 189, 111));
        btnNovo.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(33, 68, 33));
        btnNovo.setText("Novo");
        btnNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        TablePaneCliente.addTab("Novo Cliente", jPanel3);

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePaneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePaneCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addComponent(pnlCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout clientesLayout = new javax.swing.GroupLayout(clientes.getContentPane());
        clientes.getContentPane().setLayout(clientesLayout);
        clientesLayout.setHorizontalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        funcionarios.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        funcionarios.setResizable(false);

        jPanel8.setBackground(new java.awt.Color(137, 137, 137));

        lblVoltar1.setFont(new java.awt.Font("Shruti", 0, 16)); // NOI18N
        lblVoltar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar1.setText("Voltar");
        lblVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltar1MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Shruti", 0, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Funcionários");

        pnlCliente1.setBackground(new java.awt.Color(51, 51, 51));

        TablePaneFuncionario.setBackground(new java.awt.Color(201, 201, 201));
        TablePaneFuncionario.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TablePaneFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        TablePaneFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePaneFuncionarioMouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(211, 211, 211));

        jPanel10.setBackground(new java.awt.Color(211, 211, 211));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(175, 49, 49)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 1, 18), new java.awt.Color(17, 17, 17))); // NOI18N

        txtBuscaFuncionario.setBackground(new java.awt.Color(223, 231, 239));
        txtBuscaFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtBuscaFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        btnBuscarFuncionario.setBackground(new java.awt.Color(181, 208, 221));
        btnBuscarFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnBuscarFuncionario.setText("Buscar");
        btnBuscarFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 175, 190)));
        btnBuscarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(txtBuscaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        tblFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFuncionario);

        btnExcluir1.setBackground(new java.awt.Color(200, 120, 120));
        btnExcluir1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnExcluir1.setForeground(new java.awt.Color(122, 45, 45));
        btnExcluir1.setText("Excluir");
        btnExcluir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 69, 69), 2));
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnAlterar1.setBackground(new java.awt.Color(111, 189, 111));
        btnAlterar1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnAlterar1.setForeground(new java.awt.Color(33, 68, 33));
        btnAlterar1.setText("Alterar");
        btnAlterar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePaneFuncionario.addTab("Funcionário", jPanel9);

        jPanel11.setBackground(new java.awt.Color(211, 211, 211));

        jLabel20.setFont(new java.awt.Font("Shruti", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Novo Funcionário");

        jPanel12.setBackground(new java.awt.Color(211, 211, 211));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(26, 26, 26));
        jLabel22.setText("Nome Completo");

        txtNome1.setBackground(new java.awt.Color(231, 233, 237));
        txtNome1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtNome1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome1.setText("Pedrinho Nascimento de Pinto Rocha");
        txtNome1.setToolTipText("Nome completo do cliente");
        txtNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNome1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel23.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(26, 26, 26));
        jLabel23.setText("CPF");

        jLabel24.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(26, 26, 26));
        jLabel24.setText("RG");

        jLabel25.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(26, 26, 26));
        jLabel25.setText("Data de Nacimento");

        txtCPF1.setBackground(new java.awt.Color(231, 233, 237));
        txtCPF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPF1.setText("000.000.000-00");
        txtCPF1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtRG1.setBackground(new java.awt.Color(231, 233, 237));
        txtRG1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtRG1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRG1.setText("00.000.000");
        txtRG1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        txtNasc1.setBackground(new java.awt.Color(231, 233, 237));
        txtNasc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtNasc1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNasc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNasc1.setText("00/00/0000");
        txtNasc1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(161, 161, 161)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(txtRG1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtCPF1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(211, 211, 211));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(26, 26, 26));
        jLabel26.setText("Usuário");

        txtUsu.setBackground(new java.awt.Color(231, 233, 237));
        txtUsu.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtUsu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsu.setText("adm1");
        txtUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel27.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(26, 26, 26));
        jLabel27.setText("Senha");

        txtSenha.setBackground(new java.awt.Color(231, 233, 237));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setText("Senha");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(211, 211, 211));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(26, 26, 26));
        jLabel32.setText("Telefone");

        txtTel1.setBackground(new java.awt.Color(231, 233, 237));
        txtTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        try {
            txtTel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTel1.setText("(34) 0000-0000");
        txtTel1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtFuncao.setBackground(new java.awt.Color(231, 233, 237));
        txtFuncao.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtFuncao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFuncao.setText("Dar o Lolo");
        txtFuncao.setToolTipText("Limite em Reais para comprar fiado na loja.");
        txtFuncao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel35.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(26, 26, 26));
        jLabel35.setText("Função");

        btnCancelar1.setBackground(new java.awt.Color(200, 120, 120));
        btnCancelar1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(122, 45, 45));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 69, 69), 2));
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnSalvar1.setBackground(new java.awt.Color(111, 189, 111));
        btnSalvar1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnSalvar1.setForeground(new java.awt.Color(33, 68, 33));
        btnSalvar1.setText("Salvar");
        btnSalvar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnNovo1.setBackground(new java.awt.Color(111, 189, 111));
        btnNovo1.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnNovo1.setForeground(new java.awt.Color(33, 68, 33));
        btnNovo1.setText("Novo");
        btnNovo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35)
                                    .addComponent(txtIDFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(185, 185, 185))
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIDFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePaneFuncionario.addTab("Novo Funcionário", jPanel11);

        javax.swing.GroupLayout pnlCliente1Layout = new javax.swing.GroupLayout(pnlCliente1);
        pnlCliente1.setLayout(pnlCliente1Layout);
        pnlCliente1Layout.setHorizontalGroup(
            pnlCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePaneFuncionario)
                .addContainerGap())
        );
        pnlCliente1Layout.setVerticalGroup(
            pnlCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePaneFuncionario)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(pnlCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout funcionariosLayout = new javax.swing.GroupLayout(funcionarios.getContentPane());
        funcionarios.getContentPane().setLayout(funcionariosLayout);
        funcionariosLayout.setHorizontalGroup(
            funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        funcionariosLayout.setVerticalGroup(
            funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        produtos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        produtos.setResizable(false);

        jPanel15.setBackground(new java.awt.Color(137, 137, 137));

        lblVoltar2.setFont(new java.awt.Font("Shruti", 0, 16)); // NOI18N
        lblVoltar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar2.setText("Voltar");
        lblVoltar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltar2MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Shruti", 0, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Produtos");

        pnlCliente2.setBackground(new java.awt.Color(51, 51, 51));

        TablePaneProduto.setBackground(new java.awt.Color(201, 201, 201));
        TablePaneProduto.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TablePaneProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        TablePaneProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePaneProdutoMouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(211, 211, 211));

        jPanel17.setBackground(new java.awt.Color(211, 211, 211));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(175, 49, 49)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 1, 18), new java.awt.Color(17, 17, 17))); // NOI18N

        txtBuscaProduto.setBackground(new java.awt.Color(223, 231, 239));
        txtBuscaProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtBuscaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        btnBuscarProduto.setBackground(new java.awt.Color(181, 208, 221));
        btnBuscarProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 175, 190)));
        btnBuscarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        tblProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduto);

        btnExcluir2.setBackground(new java.awt.Color(200, 120, 120));
        btnExcluir2.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnExcluir2.setForeground(new java.awt.Color(122, 45, 45));
        btnExcluir2.setText("Excluir");
        btnExcluir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 69, 69), 2));
        btnExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir2ActionPerformed(evt);
            }
        });

        btnAlterar2.setBackground(new java.awt.Color(111, 189, 111));
        btnAlterar2.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnAlterar2.setForeground(new java.awt.Color(33, 68, 33));
        btnAlterar2.setText("Alterar");
        btnAlterar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnAlterar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePaneProduto.addTab("Produtos", jPanel16);

        jPanel18.setBackground(new java.awt.Color(211, 211, 211));

        jLabel28.setFont(new java.awt.Font("Shruti", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Novo Produto");

        jPanel19.setBackground(new java.awt.Color(211, 211, 211));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 52, 52)), "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 0, 14))); // NOI18N

        txtUnidade.setBackground(new java.awt.Color(231, 233, 237));
        txtUnidade.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtUnidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUnidade.setText("10");
        txtUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel29.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(26, 26, 26));
        jLabel29.setText("Unidade");

        jLabel30.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(26, 26, 26));
        jLabel30.setText("Nome");

        txtNome2.setBackground(new java.awt.Color(231, 233, 237));
        txtNome2.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtNome2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome2.setText("Estabilizador");
        txtNome2.setToolTipText("Nome completo do cliente");
        txtNome2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtNome2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNome2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        txtMarca.setBackground(new java.awt.Color(231, 233, 237));
        txtMarca.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtMarca.setText("SMS");
        txtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        jLabel31.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(26, 26, 26));
        jLabel31.setText("Marca");

        jLabel33.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(26, 26, 26));
        jLabel33.setText("Grupo");

        txtGrupo.setBackground(new java.awt.Color(231, 233, 237));
        txtGrupo.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtGrupo.setText("Eletrônicos");
        txtGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        txtKilo.setBackground(new java.awt.Color(231, 233, 237));
        txtKilo.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtKilo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKilo.setText("20");
        txtKilo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        txtKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKiloActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(26, 26, 26));
        jLabel34.setText("Kilo");

        sldQuantidade.setBackground(new java.awt.Color(211, 211, 211));
        sldQuantidade.setMaximum(1000);
        sldQuantidade.setToolTipText("Utilize as setas do teclado para maior precisão");
        sldQuantidade.setValue(0);
        sldQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldQuantidadeStateChanged(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(26, 26, 26));
        lblQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel37.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(26, 26, 26));
        jLabel37.setText("Quantidade");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                                .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel30)
                                        .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel33)
                                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel34)
                                        .addGap(161, 161, 161))
                                    .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(668, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(sldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                    .addContainerGap(221, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)))
        );

        btnCancelar2.setBackground(new java.awt.Color(200, 120, 120));
        btnCancelar2.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnCancelar2.setForeground(new java.awt.Color(122, 45, 45));
        btnCancelar2.setText("Cancelar");
        btnCancelar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 69, 69), 2));
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnSalvar2.setBackground(new java.awt.Color(111, 189, 111));
        btnSalvar2.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnSalvar2.setForeground(new java.awt.Color(33, 68, 33));
        btnSalvar2.setText("Salvar");
        btnSalvar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        btnNovo2.setBackground(new java.awt.Color(111, 189, 111));
        btnNovo2.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnNovo2.setForeground(new java.awt.Color(33, 68, 33));
        btnNovo2.setText("Novo");
        btnNovo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePaneProduto.addTab("Novo Produto", jPanel18);

        javax.swing.GroupLayout pnlCliente2Layout = new javax.swing.GroupLayout(pnlCliente2);
        pnlCliente2.setLayout(pnlCliente2Layout);
        pnlCliente2Layout.setHorizontalGroup(
            pnlCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePaneProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCliente2Layout.setVerticalGroup(
            pnlCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePaneProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pnlCliente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout produtosLayout = new javax.swing.GroupLayout(produtos.getContentPane());
        produtos.getContentPane().setLayout(produtosLayout);
        produtosLayout.setHorizontalGroup(
            produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        produtosLayout.setVerticalGroup(
            produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        relatorios.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        relatorios.setTitle("Clientes");
        relatorios.setResizable(false);

        jPanel20.setBackground(new java.awt.Color(137, 137, 137));

        lblVoltar3.setFont(new java.awt.Font("Shruti", 0, 16)); // NOI18N
        lblVoltar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar3.setText("Voltar");
        lblVoltar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltar3MouseExited(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Shruti", 0, 20)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Relatórios");

        pnlCliente3.setBackground(new java.awt.Color(51, 51, 51));

        jTabbedPane4.setBackground(new java.awt.Color(201, 201, 201));
        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane4.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(211, 211, 211));

        jPanel22.setBackground(new java.awt.Color(211, 211, 211));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(175, 49, 49)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 1, 18), new java.awt.Color(17, 17, 17))); // NOI18N

        txtRelatorioCliente.setBackground(new java.awt.Color(223, 231, 239));
        txtRelatorioCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtRelatorioCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        btnRelatorioCliente.setBackground(new java.awt.Color(181, 208, 221));
        btnRelatorioCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnRelatorioCliente.setText("Buscar");
        btnRelatorioCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 175, 190)));
        btnRelatorioCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(txtRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tblRelatorioCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        tblRelatorioCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRelatorioCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRelatorioClienteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblRelatorioCliente);

        btnGerarCliente.setBackground(new java.awt.Color(111, 189, 111));
        btnGerarCliente.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnGerarCliente.setForeground(new java.awt.Color(33, 68, 33));
        btnGerarCliente.setText("Gerar Relatório");
        btnGerarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnGerarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(699, 699, 699)
                        .addComponent(btnGerarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGerarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Clientes", jPanel21);

        jPanel23.setBackground(new java.awt.Color(211, 211, 211));

        jPanel27.setBackground(new java.awt.Color(211, 211, 211));

        jPanel28.setBackground(new java.awt.Color(211, 211, 211));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(175, 49, 49)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 1, 18), new java.awt.Color(17, 17, 17))); // NOI18N

        txtRelatorioProduto.setBackground(new java.awt.Color(223, 231, 239));
        txtRelatorioProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtRelatorioProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        btnRelatorioProduto.setBackground(new java.awt.Color(181, 208, 221));
        btnRelatorioProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnRelatorioProduto.setText("Buscar");
        btnRelatorioProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 175, 190)));
        btnRelatorioProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(txtRelatorioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelatorioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        btnGerarProduto.setBackground(new java.awt.Color(111, 189, 111));
        btnGerarProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnGerarProduto.setForeground(new java.awt.Color(33, 68, 33));
        btnGerarProduto.setText("Gerar Relatório");
        btnGerarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnGerarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarProdutoActionPerformed(evt);
            }
        });

        tblRelatorioProduto.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        tblRelatorioProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRelatorioProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRelatorioProdutoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblRelatorioProduto);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGerarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGerarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Produtos", jPanel23);

        jPanel30.setBackground(new java.awt.Color(211, 211, 211));

        jPanel31.setBackground(new java.awt.Color(211, 211, 211));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(175, 49, 49)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shruti", 1, 18), new java.awt.Color(17, 17, 17))); // NOI18N

        txtRelatorioFuncionario.setBackground(new java.awt.Color(223, 231, 239));
        txtRelatorioFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        txtRelatorioFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));

        btnRelatorioFuncionario.setBackground(new java.awt.Color(181, 208, 221));
        btnRelatorioFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnRelatorioFuncionario.setText("Buscar");
        btnRelatorioFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 175, 190)));
        btnRelatorioFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(txtRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tblRelatorioFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        tblRelatorioFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRelatorioFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRelatorioFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblRelatorioFuncionario);

        btnGerarFuncionario.setBackground(new java.awt.Color(111, 189, 111));
        btnGerarFuncionario.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        btnGerarFuncionario.setForeground(new java.awt.Color(33, 68, 33));
        btnGerarFuncionario.setText("Gerar Relatório");
        btnGerarFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 160, 66), 2));
        btnGerarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGerarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGerarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Funcionários", jPanel29);

        javax.swing.GroupLayout pnlCliente3Layout = new javax.swing.GroupLayout(pnlCliente3);
        pnlCliente3.setLayout(pnlCliente3Layout);
        pnlCliente3Layout.setHorizontalGroup(
            pnlCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlCliente3Layout.setVerticalGroup(
            pnlCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addComponent(pnlCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout relatoriosLayout = new javax.swing.GroupLayout(relatorios.getContentPane());
        relatorios.getContentPane().setLayout(relatoriosLayout);
        relatoriosLayout.setHorizontalGroup(
            relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        relatoriosLayout.setVerticalGroup(
            relatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToContigo");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlMenu.setBackground(new java.awt.Color(51, 51, 51));

        lblCliente.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(228, 228, 228));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("Clientes");
        lblCliente.setToolTipText("Menu do cliente, aqui você adiciona e busca clientes");
        lblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblClienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblClienteMouseReleased(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(228, 228, 228));
        lblProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto.setText("Produtos");
        lblProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProdutoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProdutoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblProdutoMouseReleased(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(185, 33, 33));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setText("Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSairMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSairMouseReleased(evt);
            }
        });

        lblFuncionario.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        lblFuncionario.setForeground(new java.awt.Color(228, 228, 228));
        lblFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncionario.setText("Funcionáros");
        lblFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFuncionarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseReleased(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(228, 228, 228));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Leonardo");

        imgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/user-icon-2098873_640.png"))); // NOI18N

        lblRelatorios.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        lblRelatorios.setForeground(new java.awt.Color(228, 228, 228));
        lblRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorios.setText("Relatórios");
        lblRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRelatoriosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addComponent(imgPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenu);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ToContigo (fundo).png"))); // NOI18N
        getContentPane().add(jLabel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void atualizaTabelaCliente(){
        listaCliente = null;
        cliente = new Cliente();
        try {
        listaCliente = clientedao.listaTodos();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }        
        String dados[][] = new String[listaCliente.size()][6];
            int i = 0;
            for (Cliente cliente : listaCliente) {
                dados[i][0] = String.valueOf(cliente.getId_cliente());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getTel();
                dados[i][3] = cliente.getRua();
                dados[i][4] = cliente.getBairro();
                dados[i][5] = cliente.getCidade();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Telefone","Rua", "Bairro", "Cidade"};
            DefaultTableModel tabelacliente = new DefaultTableModel();
            tabelacliente.setDataVector(dados, tituloColuna);
            tblCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblCliente.setRowHeight(25);
            tblCliente.updateUI();
    }
    
    // Update Table Cliente from Search By name
    public void atualizaTabelaClienteBusca(){
        cliente = new Cliente();

       
        String dados[][] = new String[listaCliente.size()][6];
            int i = 0;
            for (Cliente cliente : listaCliente) {
                dados[i][0] = String.valueOf(cliente.getId_cliente());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getTel();
                dados[i][3] = cliente.getRua();
                dados[i][4] = cliente.getBairro();
                dados[i][5] = cliente.getCidade();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Telefone","Rua", "Bairro", "Cidade"};
            DefaultTableModel tabelacliente = new DefaultTableModel();
            tabelacliente.setDataVector(dados, tituloColuna);
            tblCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblCliente.setRowHeight(25);
            tblCliente.updateUI();
    }
    
    
    
    public void atualizaTabelaFuncionario(){
        funcionario = new Funcionario();
        try {
        listaFuncionario = funcionariodao.listaTodos();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }      
        String dados[][] = new String[listaFuncionario.size()][6];
            int i = 0;
            for (Funcionario funcionario : listaFuncionario) {
                dados[i][0] = String.valueOf(funcionario.getId_funcionario());
                dados[i][1] = funcionario.getNome();
                dados[i][2] = funcionario.getCpf();
                dados[i][3] = funcionario.getRg();
                dados[i][4] = funcionario.getFuncao();
                dados[i][5] = funcionario.getLogin();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Cpf","Rg", "Função", "Login"};
            DefaultTableModel tabelafuncionario = new DefaultTableModel();
            tabelafuncionario.setDataVector(dados, tituloColuna);
            tblFuncionario.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblFuncionario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblFuncionario.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblFuncionario.setRowHeight(25);
            tblFuncionario.updateUI();
    }
    
    //Update Table Funcionario from Search By Name
    public void atualizaTabelaFuncionarioBusca(){
        funcionario = new Funcionario();

                
        String dados[][] = new String[listaFuncionario.size()][6];
            int i = 0;
            for (Funcionario funcionario : listaFuncionario) {
                dados[i][0] = String.valueOf(funcionario.getId_funcionario());
                dados[i][1] = funcionario.getNome();
                dados[i][2] = funcionario.getCpf();
                dados[i][3] = funcionario.getRg();
                dados[i][4] = funcionario.getFuncao();
                dados[i][5] = funcionario.getLogin();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Cpf","Rg", "Função", "Login"};
            DefaultTableModel tabelafuncionario = new DefaultTableModel();
            tabelafuncionario.setDataVector(dados, tituloColuna);
            tblFuncionario.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblFuncionario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblFuncionario.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblFuncionario.setRowHeight(25);
            tblFuncionario.updateUI();
    }
    
    public void atualizaTabelaProduto(){
        produto = new Produto();
        try {
        listaProduto = produtodao.listaTodos();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }       
        String dados[][] = new String[listaProduto.size()][6];
            int i = 0;
            for (Produto produto : listaProduto) {
                dados[i][0] = String.valueOf(produto.getId_produto());
                dados[i][1] = produto.getNome();
                dados[i][2] = produto.getMarca();
                dados[i][3] = produto.getGrupo();
                dados[i][4] = String.valueOf(produto.getUnidade());
                dados[i][5] = String.valueOf(produto.getKilo());
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Marca","Grupo", "Unidade", "Kilo"};
            DefaultTableModel tabelaProduto = new DefaultTableModel();
            tabelaProduto.setDataVector(dados, tituloColuna);
            tblProduto.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblProduto.setRowHeight(25);
            tblProduto.updateUI();
    }
    
    // Atualiza Tabela Busca Methods
    public void atualizaTabelaProdutoBusca(){
        produto = new Produto();
         
        String dados[][] = new String[listaFuncionario.size()][6];
            int i = 0;
            for (Produto produto : listaProduto) {
                dados[i][0] = String.valueOf(produto.getId_produto());
                dados[i][1] = produto.getNome();
                dados[i][2] = produto.getMarca();
                dados[i][3] = produto.getGrupo();
                dados[i][4] = String.valueOf(produto.getUnidade());
                dados[i][5] = String.valueOf(produto.getKilo());
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Marca","Grupo", "Unidade", "Kilo"};
            DefaultTableModel tabelaProduto = new DefaultTableModel();
            tabelaProduto.setDataVector(dados, tituloColuna);
            tblProduto.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblProduto.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblProduto.setRowHeight(25);
            tblProduto.updateUI();
    }
    
    /*
    *
    *               COMEÇO ATUALIZA TABELA PARA RELATORIO
    *
    */
    
    public void atualizaTabelaClienteRelatorio(){
        listaCliente = null;
        cliente = new Cliente();
        try {
        listaCliente = clientedao.listaTodos();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }        
        String dados[][] = new String[listaCliente.size()][6];
            int i = 0;
            for (Cliente cliente : listaCliente) {
                dados[i][0] = String.valueOf(cliente.getId_cliente());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getTel();
                dados[i][3] = cliente.getRua();
                dados[i][4] = cliente.getBairro();
                dados[i][5] = cliente.getCidade();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Telefone","Rua", "Bairro", "Cidade"};
            DefaultTableModel tabelacliente = new DefaultTableModel();
            tabelacliente.setDataVector(dados, tituloColuna);
            tblRelatorioCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRelatorioCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRelatorioCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRelatorioCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRelatorioCliente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRelatorioCliente.setRowHeight(25);
            tblRelatorioCliente.updateUI();
    }
    
    // Update Table Cliente from Search By name
    // Created By : "G"
    public void atualizaTabelaClienteBuscaRelatorio(){
        cliente = new Cliente();

       
        String dados[][] = new String[listaCliente.size()][6];
            int i = 0;
            for (Cliente cliente : listaCliente) {
                dados[i][0] = String.valueOf(cliente.getId_cliente());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getTel();
                dados[i][3] = cliente.getRua();
                dados[i][4] = cliente.getBairro();
                dados[i][5] = cliente.getCidade();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Telefone","Rua", "Bairro", "Cidade"};
            DefaultTableModel tabelacliente = new DefaultTableModel();
            tabelacliente.setDataVector(dados, tituloColuna);
            tblRelatorioCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRelatorioCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRelatorioCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRelatorioCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRelatorioCliente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRelatorioCliente.setRowHeight(25);
            tblRelatorioCliente.updateUI();
    }
    
    
    
    public void atualizaTabelaFuncionarioRelatorio(){
        funcionario = new Funcionario();
        try {
        listaFuncionario = funcionariodao.listaTodos();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }      
        String dados[][] = new String[listaFuncionario.size()][6];
            int i = 0;
            for (Funcionario funcionario : listaFuncionario) {
                dados[i][0] = String.valueOf(funcionario.getId_funcionario());
                dados[i][1] = funcionario.getNome();
                dados[i][2] = funcionario.getCpf();
                dados[i][3] = funcionario.getRg();
                dados[i][4] = funcionario.getFuncao();
                dados[i][5] = funcionario.getLogin();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Cpf","Rg", "Função", "Login"};
            DefaultTableModel tabelafuncionario = new DefaultTableModel();
            tabelafuncionario.setDataVector(dados, tituloColuna);
            tblRelatorioFuncionario.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRelatorioFuncionario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRelatorioFuncionario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRelatorioFuncionario.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRelatorioFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRelatorioFuncionario.setRowHeight(25);
            tblRelatorioFuncionario.updateUI();
    }
    
    //Update Table Funcionario from Search By Name
    
    public void atualizaTabelaFuncionarioBuscaRelatorio(){
        funcionario = new Funcionario();

                
        String dados[][] = new String[listaFuncionario.size()][6];
            int i = 0;
            for (Funcionario funcionario : listaFuncionario) {
                dados[i][0] = String.valueOf(funcionario.getId_funcionario());
                dados[i][1] = funcionario.getNome();
                dados[i][2] = funcionario.getCpf();
                dados[i][3] = funcionario.getRg();
                dados[i][4] = funcionario.getFuncao();
                dados[i][5] = funcionario.getLogin();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Cpf","Rg", "Função", "Login"};
            DefaultTableModel tabelafuncionario = new DefaultTableModel();
            tabelafuncionario.setDataVector(dados, tituloColuna);
            tblRelatorioFuncionario.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRelatorioFuncionario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRelatorioFuncionario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRelatorioFuncionario.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRelatorioFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRelatorioFuncionario.setRowHeight(25);
            tblRelatorioFuncionario.updateUI();
    }
    
    public void atualizaTabelaProdutoRelatorio(){
        produto = new Produto();
        try {
        listaProduto = produtodao.listaTodos();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }       
        String dados[][] = new String[listaProduto.size()][6];
            int i = 0;
            for (Produto produto : listaProduto) {
                dados[i][0] = String.valueOf(produto.getId_produto());
                dados[i][1] = produto.getNome();
                dados[i][2] = produto.getMarca();
                dados[i][3] = produto.getGrupo();
                dados[i][4] = String.valueOf(produto.getUnidade());
                dados[i][5] = String.valueOf(produto.getKilo());
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Marca","Grupo", "Unidade", "Kilo"};
            DefaultTableModel tabelaProduto = new DefaultTableModel();
            tabelaProduto.setDataVector(dados, tituloColuna);
            tblRelatorioProduto.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRelatorioProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRelatorioProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRelatorioProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRelatorioProduto.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRelatorioProduto.setRowHeight(25);
            tblRelatorioProduto.updateUI();
            
    }
    
    // Atualiza Tabela Busca Methods
    public void atualizaTabelaProdutoBuscaRelatorio(){
        produto = new Produto();
         
        String dados[][] = new String[listaFuncionario.size()][6];
            int i = 0;
            for (Produto produto : listaProduto) {
                dados[i][0] = String.valueOf(produto.getId_produto());
                dados[i][1] = produto.getNome();
                dados[i][2] = produto.getMarca();
                dados[i][3] = produto.getGrupo();
                dados[i][4] = String.valueOf(produto.getUnidade());
                dados[i][5] = String.valueOf(produto.getKilo());
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Marca","Grupo", "Unidade", "Kilo"};
            DefaultTableModel tabelaProduto = new DefaultTableModel();
            tabelaProduto.setDataVector(dados, tituloColuna);
            tblRelatorioProduto.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRelatorioProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblRelatorioProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRelatorioProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRelatorioProduto.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRelatorioProduto.setRowHeight(25);
            tblRelatorioProduto.updateUI();
    }
    
    
    
    
    //                  BOTÕES SAIR
    
    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        lblSair.setForeground(new Color(192,52,52));
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        lblSair.setForeground(new Color(185,33,33));
    }//GEN-LAST:event_lblSairMouseExited

    private void lblSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMousePressed
        lblSair.setForeground(new Color(156, 36,36));
    }//GEN-LAST:event_lblSairMousePressed

    private void lblSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseReleased
        lblSair.setForeground(new Color(185,33,33));
    }//GEN-LAST:event_lblSairMouseReleased
    
    //              BOTÃO CLIENTES
    
    private void lblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseClicked
        // CHAMA FORM CLIENTES
        
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblClienteMouseClicked

    private void lblClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseEntered
        lblCliente.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblClienteMouseEntered

    private void lblClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseExited
        lblCliente.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblClienteMouseExited

    private void lblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMousePressed
        lblCliente.setForeground(new Color(170,170,170));
    }//GEN-LAST:event_lblClienteMousePressed

    private void lblClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseReleased
        lblCliente.setForeground(new Color(228, 228,228));
    }//GEN-LAST:event_lblClienteMouseReleased

    private void lblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMouseClicked
        produtos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdutoMouseClicked
    
    //                  BOTÃO PRODUTOS
    
    private void lblProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMouseEntered
        lblProduto.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblProdutoMouseEntered

    private void lblProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMouseExited
        lblProduto.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblProdutoMouseExited

    private void lblProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMousePressed
        lblProduto.setForeground(new Color(170,170,170));
    }//GEN-LAST:event_lblProdutoMousePressed

    private void lblProdutoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMouseReleased
        lblProduto.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblProdutoMouseReleased
    
    //                  BOTÃO FUNCIONÁRIOS
    
    private void lblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseClicked
        funcionarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFuncionarioMouseClicked

    private void lblFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseEntered
        lblFuncionario.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblFuncionarioMouseEntered

    private void lblFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseExited
        lblFuncionario.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblFuncionarioMouseExited

    private void lblFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMousePressed
        lblFuncionario.setForeground(new Color(170,170,170));
    }//GEN-LAST:event_lblFuncionarioMousePressed

    private void lblFuncionarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseReleased
        lblFuncionario.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblFuncionarioMouseReleased

    
    //                         JANELA CLIENTE
    
    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        clientes.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void lblVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar1MouseClicked
        funcionarios.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_lblVoltar1MouseClicked

    private void lblVoltar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar1MouseEntered
        lblVoltar1.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblVoltar1MouseEntered

    private void lblVoltar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar1MouseExited
        lblVoltar1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblVoltar1MouseExited

    private void lblVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseEntered
        lblVoltar.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblVoltarMouseEntered

    private void lblVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseExited
        lblVoltar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblVoltarMouseExited

    private void lblVoltar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar2MouseClicked
        produtos.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_lblVoltar2MouseClicked

    private void lblVoltar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar2MouseEntered
        lblVoltar2.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblVoltar2MouseEntered

    private void lblVoltar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar2MouseExited
        lblVoltar2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblVoltar2MouseExited

    private void txtKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKiloActionPerformed

    private void sldQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldQuantidadeStateChanged
        lblQuantidade.setText(Integer.toString(sldQuantidade.getValue()));
    }//GEN-LAST:event_sldQuantidadeStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        cliente = new Cliente();
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos os campos", "Erro", JOptionPane.WARNING_MESSAGE);
        }else if(txtIDCliente.getText().isEmpty()){
            
            cliente.setNome(txtNome.getText());
            cliente.setCpf(txtCPF.getText());
            cliente.setCnpj(txtCNPJ.getText());
            cliente.setRg(txtRG.getText());
            cliente.setRua(txtRua.getText());
            cliente.setCep(txtCep.getText());
            cliente.setCidade(txtCidade.getText());
            cliente.setTel(txtTel.getText());
            cliente.setTelCom(txtTelCom.getText());
            cliente.setCel(txtCel.getText());
            cliente.setEstado(txtEstado.getText());
            cliente.setPais(txtPais.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setComplemento(txtComplemento.getText());
            cliente.setNumero(txtNumero.getText());
            cliente.setNasc(txtNasc.getText());
            cliente.setLimite(Double.parseDouble(txtLimite.getText()));
            
            try {
                clientedao.salvar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente Salvo!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
            atualizaTabelaCliente();
            PreparaSalvareCancelarCliente();
            DesativaCamposCliente();
            LimparCamposCliente();
        }else{
            cliente.setId_cliente(Integer.parseInt(txtIDCliente.getText()));
            cliente.setNome(txtNome.getText());
            cliente.setCpf(txtCPF.getText());
            cliente.setCnpj(txtCNPJ.getText());
            cliente.setRg(txtRG.getText());
            cliente.setRua(txtRua.getText());
            cliente.setCep(txtCep.getText());
            cliente.setCidade(txtCidade.getText());
            cliente.setTel(txtTel.getText());
            cliente.setTelCom(txtTelCom.getText());
            cliente.setCel(txtCel.getText());
            cliente.setEstado(txtEstado.getText());
            cliente.setPais(txtPais.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setComplemento(txtComplemento.getText());
            cliente.setNumero(txtNumero.getText());
            cliente.setNasc(txtNasc.getText());
            cliente.setLimite(Double.parseDouble(txtLimite.getText()));
            
            try {
                clientedao.alterar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente Alterado!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        atualizaTabelaCliente();
        PreparaSalvareCancelarCliente();
        DesativaCamposCliente();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        LimparCamposCliente();
        PreparaNovoCliente();
        AtivaCamposCliente();
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNome.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    LimparCamposCliente();
    PreparaSalvareCancelarCliente();
    DesativaCamposCliente();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    PreparaAlterarCliente();
    AtivaCamposCliente();
    txtNome.requestFocusInWindow();
    TablePaneCliente.setSelectedIndex(1);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtIDCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Cliente", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            cliente.setId_cliente(Integer.parseInt(txtIDCliente.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ txtNome.getText(),"", JOptionPane.QUESTION_MESSAGE);
            if(confirma ==0){
                try{
                    clientedao.excluir(cliente);
                    LimparCamposCliente();
                    txtNome.requestFocusInWindow();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }
                //atualizaTabelaFuncionario();
                PreparaExcluirCliente();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        funcionario = new Funcionario();
        if(txtNome1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos os campos", "Erro", JOptionPane.WARNING_MESSAGE);
        }else if(txtIDFuncionario.getText().isEmpty()){
            
            funcionario.setNome(txtNome1.getText());
            funcionario.setCpf(txtCPF1.getText());
            funcionario.setRg(txtRG1.getText());
            funcionario.setNasc(txtNasc1.getText());
            funcionario.setTelefone(txtTel1.getText());
            funcionario.setLogin(txtUsu.getText());
            funcionario.setSenha(txtSenha.getText());
            funcionario.setFuncao(txtFuncao.getText());
            
            try {
                funcionariodao.salvar(funcionario);
                JOptionPane.showMessageDialog(null, "Funcionario Salvo!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            funcionario.setId_funcionario(Integer.parseInt(txtIDFuncionario.getText()));
            funcionario.setNome(txtNome1.getText());
            funcionario.setCpf(txtCPF1.getText());
            funcionario.setRg(txtRG1.getText());
            funcionario.setNasc(txtNasc1.getText());
            funcionario.setTelefone(txtTel1.getText());
            funcionario.setLogin(txtUsu.getText());
            funcionario.setSenha(txtSenha.getText());
            funcionario.setFuncao(txtFuncao.getText());
            
            try {
                funcionariodao.alterar(funcionario);// MUDAR PARA ALTERAR DEPOIS DE CRIADO NO DAO    
                JOptionPane.showMessageDialog(null, "Funcionario Alterado!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        atualizaTabelaFuncionario();
        LimparCamposFuncionario();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        LimparCamposFuncionario();
        PreparaNovoFuncionario();
        AtivaCamposFuncionario();
        btnAlterar1.setEnabled(false);
        btnExcluir1.setEnabled(false);
        txtNome1.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
    LimparCamposFuncionario();
    PreparaSalvareCancelarFuncionario();
    DesativaCamposFuncionario();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
    PreparaAlterarFuncionario();
    AtivaCamposFuncionario();
    txtNome1.requestFocusInWindow(); 
    TablePaneFuncionario.setSelectedIndex(1);
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        if(txtIDFuncionario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Funcionario", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            funcionario.setId_funcionario(Integer.parseInt(txtIDFuncionario.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ txtNome1.getText(),"",JOptionPane.QUESTION_MESSAGE);
            if(confirma ==0){
                try{
                    funcionariodao.excluir(funcionario);
                    LimparCamposFuncionario();
                    txtNome1.requestFocusInWindow();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }
                //atualizaTabelaFuncionario();
                PreparaExcluirFuncionario();
            }
        }
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        produto = new Produto();
        if(txtNome2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos os campos", "Erro", JOptionPane.WARNING_MESSAGE);
        }else if(txtIDProduto.getText().isEmpty()){
            
            produto.setNome(txtNome2.getText());
            produto.setMarca(txtMarca.getText());
            produto.setGrupo(txtGrupo.getText());
            produto.setUnidade(Integer.parseInt(txtUnidade.getText()));
            produto.setKilo(Double.parseDouble(txtKilo.getText()));

            try {
                produtodao.salvar(produto);
                JOptionPane.showMessageDialog(null, "Produto Salvo!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
            atualizaTabelaProduto();
            PreparaSalvareCancelarProduto();
            DesativaCamposProduto();
            LimparCamposProduto();
        }else{
            produto.setId_produto(Integer.parseInt(txtIDProduto.getText()));
            produto.setNome(txtNome2.getText());
            produto.setMarca(txtMarca.getText());
            produto.setGrupo(txtGrupo.getText());
            produto.setUnidade(Integer.parseInt(txtUnidade.getText()));
            produto.setKilo(Double.parseDouble(txtKilo.getText()));
            
            try {
                produtodao.alterar(produto);// MUDAR PARA ALTERAR DEPOIS DE CRIADO NO DAO
                JOptionPane.showMessageDialog(null, "Produto Alterado!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        atualizaTabelaProduto();
        PreparaSalvareCancelarProduto();
        DesativaCamposProduto();
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo2ActionPerformed
        LimparCamposProduto();
        PreparaNovoProduto();
        AtivaCamposProduto();
        btnAlterar2.setEnabled(false);
        btnExcluir2.setEnabled(false);
        txtNome2.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovo2ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
    LimparCamposProduto();
    PreparaSalvareCancelarProduto();
    DesativaCamposProduto();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnAlterar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar2ActionPerformed
    PreparaAlterarProduto();
    AtivaCamposProduto();
    txtNome2.requestFocusInWindow();
    TablePaneProduto.setSelectedIndex(1);
    }//GEN-LAST:event_btnAlterar2ActionPerformed

    private void btnExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir2ActionPerformed
        if(txtIDProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Produto", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            produto.setId_produto(Integer.parseInt(txtIDProduto.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ txtNome2.getText(),"",JOptionPane.QUESTION_MESSAGE);
            if(confirma ==0){
                try{
                    produtodao.excluir(produto);
                    LimparCamposProduto();
                    txtNome2.requestFocusInWindow();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }
                //atualizaTabelaFuncionario();
                PreparaExcluirProduto();
            }
        }
    }//GEN-LAST:event_btnExcluir2ActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        if (txtBuscaProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite uma chave para a busca!","", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaProduto();
        }else{
            
            try {
                listaProduto = produtodao.buscaNomeLista(txtBuscaProduto.getText());
             
            if(listaProduto == null){
                
                JOptionPane.showMessageDialog(null, "Nenhum Produto encontrado!","", JOptionPane.WARNING_MESSAGE);
                atualizaTabelaProduto();
            }else{
                atualizaTabelaProdutoBusca();
            }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }       
            
        }
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        cliente = new Cliente();

        try{
            cliente = clientedao.busca(Integer.parseInt(tblCliente.getValueAt(tblCliente.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(),"",JOptionPane.WARNING_MESSAGE);
        }
        tblCliente.getTableHeader().setReorderingAllowed(false);

        txtIDCliente.setText(Integer.toString(cliente.getId_cliente()));
        txtNome.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf());
        txtCNPJ.setText(cliente.getCnpj());
        txtRG.setText(cliente.getRg());
        txtRua.setText(cliente.getRua());
        txtCep.setText(cliente.getCep());
        txtCidade.setText(cliente.getCidade());
        txtTel.setText(cliente.getTel());
        txtTelCom.setText(cliente.getTelCom());
        txtCel.setText(cliente.getCel());
        txtEstado.setText(cliente.getEstado());
        txtPais.setText(cliente.getPais());
        txtBairro.setText(cliente.getBairro());
        txtComplemento.setText(cliente.getComplemento());
        txtNumero.setText(cliente.getNumero());
        txtNasc.setText(cliente.getNasc());
        txtLimite.setText(String.valueOf(cliente.getLimite()));
        PreparaSelecaoTabelaCliente();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionarioActionPerformed
        listaFuncionario = null;
        if(txtBuscaFuncionario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite uma chave para a busca!","", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaFuncionario();
        }else
        {
            try{

                listaFuncionario = funcionariodao.buscaNomeLista(txtBuscaFuncionario.getText());
                if(listaFuncionario == null){

                    JOptionPane.showMessageDialog(null, "Nenhum Funcionario encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaFuncionario();

                }else{
                    atualizaTabelaFuncionarioBusca();

                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnBuscarFuncionarioActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        listaCliente = null;
        if(txtBuscaCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um nome na busca!","", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaCliente();
        }else{
                    
            try {
                listaCliente = clientedao.buscaNomeLista(txtBuscaCliente.getText());

                if(listaCliente == null){
                    JOptionPane.showMessageDialog(null, "Nenhum Cliente encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaCliente();
                }else{
                    atualizaTabelaClienteBusca();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
        funcionario = new Funcionario();

        try{
            funcionario = funcionariodao.busca(Integer.parseInt(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        tblFuncionario.getTableHeader().setReorderingAllowed(false);

        txtIDFuncionario.setText(Integer.toString(funcionario.getId_funcionario()));
        txtNome1.setText(funcionario.getNome());
        txtCPF1.setText(funcionario.getCpf());
        txtRG1.setText(funcionario.getRg());
        txtNasc1.setText(funcionario.getNasc());
        txtTel1.setText(funcionario.getTelefone());
        txtUsu.setText(funcionario.getLogin());
        txtSenha.setText(funcionario.getSenha());
        txtFuncao.setText(funcionario.getFuncao());
        
        PreparaSelecaoTabelaFuncionario();
    }//GEN-LAST:event_tblFuncionarioMouseClicked

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        produto = new Produto();

        try{
            produto = produtodao.busca(Integer.parseInt(tblProduto.getValueAt(tblProduto.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(),"",JOptionPane.WARNING_MESSAGE);
        }
        tblProduto.getTableHeader().setReorderingAllowed(false);

        txtIDProduto.setText(Integer.toString(funcionario.getId_funcionario()));
        txtNome2.setText(produto.getNome());
        txtMarca.setText(produto.getMarca());
        txtGrupo.setText(produto.getGrupo());
        txtUnidade.setText(String.valueOf(produto.getUnidade()));
        txtKilo.setText(String.valueOf(produto.getKilo()));
        lblQuantidade.setText(String.valueOf(produto.getQuantidade()));
        
        PreparaSelecaoTabelaProduto();
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void lblRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseClicked
        relatorios.setVisible(true);
        atualizaTabelaClienteRelatorio();
        atualizaTabelaFuncionarioRelatorio();
        atualizaTabelaProdutoRelatorio();
        this.dispose();
    }//GEN-LAST:event_lblRelatoriosMouseClicked

    private void lblRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseEntered
        lblRelatorios.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblRelatoriosMouseEntered

    private void lblRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseExited
        lblRelatorios.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblRelatoriosMouseExited

    private void lblRelatoriosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMousePressed
        lblRelatorios.setForeground(new Color(170,170,170));
    }//GEN-LAST:event_lblRelatoriosMousePressed

    private void lblRelatoriosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseReleased
        lblRelatorios.setForeground(new Color(228,228,228));
    }//GEN-LAST:event_lblRelatoriosMouseReleased

    private void lblVoltar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar3MouseClicked
        relatorios.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_lblVoltar3MouseClicked

    private void lblVoltar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar3MouseEntered
         lblVoltar3.setForeground(new Color(255, 255,255));
    }//GEN-LAST:event_lblVoltar3MouseEntered

    private void lblVoltar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltar3MouseExited
        lblVoltar3.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblVoltar3MouseExited

    private void btnRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioClienteActionPerformed
        listaCliente = null;
        if(txtRelatorioCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um nome na busca!","", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaClienteRelatorio();
        }else{
                    
            try {
                listaCliente = clientedao.buscaNomeLista(txtRelatorioCliente.getText());

                if(listaCliente == null){
                    JOptionPane.showMessageDialog(null, "Nenhum Cliente encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaClienteRelatorio();
                }else{
                    atualizaTabelaClienteBuscaRelatorio();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRelatorioClienteActionPerformed

    private void tblRelatorioClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRelatorioClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRelatorioClienteMouseClicked

    private void btnGerarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarClienteActionPerformed
        String nomediretorio = null;
        String nomepasta = "RelatoriosToContigo"; // Informe o nome da pasta que armazenará o relatório
        String separador = java.io.File.separator;
            try {
                nomediretorio = "C:" + separador + nomepasta;
                if (!new File(nomediretorio).exists()) {
                    (new File(nomediretorio)).mkdir();
                }
               gerarDocumentoCliente();
            } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_btnGerarClienteActionPerformed

    private void btnRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioProdutoActionPerformed
        if (txtRelatorioProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite uma chave para a busca!","", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaProdutoRelatorio();
        }else{
            
            try {
                listaProduto = produtodao.buscaNomeLista(txtRelatorioProduto.getText());
             
            if(listaProduto == null){
                
                JOptionPane.showMessageDialog(null, "Nenhum Produto encontrado!","", JOptionPane.WARNING_MESSAGE);
                atualizaTabelaProdutoRelatorio();
            }else{
                atualizaTabelaProdutoBuscaRelatorio();
            }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }       
            
        }
    }//GEN-LAST:event_btnRelatorioProdutoActionPerformed

    private void btnGerarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarProdutoActionPerformed
        String nomediretorio = null;
        String nomepasta = "RelatoriosToContigo"; // Informe o nome da pasta que armazenará o relatório
        String separador = java.io.File.separator;
            try {
                nomediretorio = "C:" + separador + nomepasta;
                if (!new File(nomediretorio).exists()) {
                    (new File(nomediretorio)).mkdir();
                }
               gerarDocumentoProduto();
            } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_btnGerarProdutoActionPerformed

    private void btnRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioFuncionarioActionPerformed
        listaFuncionario = null;
        if(txtRelatorioFuncionario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite uma chave para a busca!","", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaFuncionarioRelatorio();
        }else
        {
            try{

                listaFuncionario = funcionariodao.buscaNomeLista(txtRelatorioFuncionario.getText());
                if(listaFuncionario == null){

                    JOptionPane.showMessageDialog(null, "Nenhum Funcionario encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaFuncionarioRelatorio();

                }else{
                    atualizaTabelaFuncionarioBuscaRelatorio();

                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnRelatorioFuncionarioActionPerformed

    private void tblRelatorioFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRelatorioFuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRelatorioFuncionarioMouseClicked

    private void btnGerarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarFuncionarioActionPerformed
        String nomediretorio = null;
        String nomepasta = "RelatoriosToContigo"; // Informe o nome da pasta que armazenará o relatório
        String separador = java.io.File.separator;
            try {
                nomediretorio = "C:" + separador + nomepasta;
                if (!new File(nomediretorio).exists()) {
                    (new File(nomediretorio)).mkdir();
                }
               gerarDocumentoFuncionario();
            } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_btnGerarFuncionarioActionPerformed

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked
        atualizaTabelaClienteRelatorio();
        atualizaTabelaProdutoRelatorio();
        atualizaTabelaFuncionarioRelatorio();
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void TablePaneFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePaneFuncionarioMouseClicked
        atualizaTabelaFuncionario();
    }//GEN-LAST:event_TablePaneFuncionarioMouseClicked

    private void TablePaneClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePaneClienteMouseClicked
        atualizaTabelaCliente();
    }//GEN-LAST:event_TablePaneClienteMouseClicked

    private void TablePaneProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePaneProdutoMouseClicked
        atualizaTabelaProduto();
    }//GEN-LAST:event_TablePaneProdutoMouseClicked

    private void RadioCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCpfActionPerformed
        txtRG.setVisible(false);
        txtCPF.setVisible(true);
    }//GEN-LAST:event_RadioCpfActionPerformed

    private void RadioRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioRgActionPerformed
        txtCPF.setVisible(false);
        txtRG.setVisible(true);
    }//GEN-LAST:event_RadioRgActionPerformed

    private void RadioCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioCpfMouseClicked
        txtRG.setVisible(false);
        txtCPF.setVisible(true);
    }//GEN-LAST:event_RadioCpfMouseClicked

    private void RadioRgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioRgMouseClicked
        txtCPF.setVisible(false);
        txtRG.setVisible(true);
    }//GEN-LAST:event_RadioRgMouseClicked

    private void tblRelatorioProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRelatorioProdutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRelatorioProdutoMouseClicked
    
    public void gerarDocumentoCliente() throws IOException, DocumentException{
        Font f10 = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font f12 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font f15 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
        Font fnormal = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        
            //INICIO RELATORIO DE CLIENTE.
            doc = new Document(PageSize.A4);
            
            String caminho = "C:/RelatoriosToContigo/RelatorioCliente.pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(caminho));
            doc.open();
            
            Paragraph nomeUniversidade = new Paragraph("ToContigo",f15);
            nomeUniversidade.setAlignment(Element.ALIGN_CENTER);
            nomeUniversidade.setSpacingAfter(10);
            
            Paragraph nomeRelatorio = new Paragraph("Relatório de Clientes" ,f12);
            nomeRelatorio.setAlignment(Element.ALIGN_CENTER);
            nomeRelatorio.setSpacingAfter(10);
            
            doc.add(nomeUniversidade);
            doc.add(nomeRelatorio);
            
            PdfPTable tabela = new PdfPTable(5);
            tabela.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.setWidthPercentage(100f);

            PdfPCell cabecalhoNome = new PdfPCell(new Paragraph("Nome", f10));
            cabecalhoNome.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoNome);

            PdfPCell cabecalhoCpfCnpj = new PdfPCell(new Paragraph("Cpf/Cnpj",f10));
            cabecalhoCpfCnpj.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoCpfCnpj);
            
            PdfPCell cabecalhoTelefone = new PdfPCell(new Paragraph("Telefone",f10));
            cabecalhoTelefone.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoTelefone);
            
            PdfPCell cabecalhoCelular = new PdfPCell(new Paragraph("Celular",f10));
            cabecalhoCelular.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoCelular);
            
            PdfPCell cabecalhoLimite = new PdfPCell(new Paragraph("Limite",f10));
            cabecalhoLimite.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoLimite);
            
            
            tabela.setHeaderRows(1); // linha que sera repetida em todas as paginas.
            
            for (Cliente client : listaCliente){
                Paragraph pNome = new Paragraph(client.getNome(), fnormal);
                pNome.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colNome = new PdfPCell(pNome);
                
                Paragraph pCpf = new Paragraph(client.getCpf()+"\n"+client.getCnpj(), fnormal);
                pCpf.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colCpf = new PdfPCell(pCpf);
                
                Paragraph pTel = new Paragraph(client.getTel(), fnormal);
                pTel.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colTel = new PdfPCell(pTel);
                
                Paragraph pCel = new Paragraph(client.getCel(), fnormal);
                pCel.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colCel = new PdfPCell(pCel);
                
                Paragraph pLim = new Paragraph(String.valueOf(client.getLimite()), fnormal);
                pLim.setAlignment(Element.ALIGN_CENTER);
                PdfPCell colLim = new PdfPCell(pLim);
                colLim.setHorizontalAlignment(Element.ALIGN_CENTER);
                
                tabela.addCell(colNome);
                tabela.addCell(colCpf);
                tabela.addCell(colTel);
                tabela.addCell(colCel);
                tabela.addCell(colLim);
            }
        doc.add(tabela);    
        JOptionPane.showMessageDialog(null, "Relatório de Clientes salvo com sucesso em C:/RelatoriosToContigo/");
        Desktop.getDesktop().open(new File(caminho));
        doc.close();
    }
    
    public void gerarDocumentoFuncionario() throws IOException, DocumentException{
        Font f10 = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font f12 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font f15 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
        Font fnormal = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        
            //INICIO RELATORIO DE Funcionario.
            doc = new Document(PageSize.A4);
            
            String caminho = "C:/RelatoriosToContigo/RelatorioFuncionario.pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(caminho));
            doc.open();
            
            Paragraph nomeUniversidade = new Paragraph("ToContigo",f15);
            nomeUniversidade.setAlignment(Element.ALIGN_CENTER);
            nomeUniversidade.setSpacingAfter(10);
            
            Paragraph nomeRelatorio = new Paragraph("Relatório de Funcionarios" ,f12);
            nomeRelatorio.setAlignment(Element.ALIGN_CENTER);
            nomeRelatorio.setSpacingAfter(10);
            
            doc.add(nomeUniversidade);
            doc.add(nomeRelatorio);
            
            PdfPTable tabela = new PdfPTable(5);
            tabela.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.setWidthPercentage(100f);

            PdfPCell cabecalhoNome = new PdfPCell(new Paragraph("Nome", f10));
            cabecalhoNome.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoNome);

            PdfPCell cabecalhoCpfCnpj = new PdfPCell(new Paragraph("Cpf",f10));
            cabecalhoCpfCnpj.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoCpfCnpj);
            
            PdfPCell cabecalhoTelefone = new PdfPCell(new Paragraph("Telefone",f10));
            cabecalhoTelefone.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoTelefone);
            
            PdfPCell cabecalhoCelular = new PdfPCell(new Paragraph("Nascimento",f10));
            cabecalhoCelular.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoCelular);
            
            PdfPCell cabecalhoLimite = new PdfPCell(new Paragraph("Função",f10));
            cabecalhoLimite.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoLimite);
            
            
            tabela.setHeaderRows(1); // linha que sera repetida em todas as paginas.
            
            for (Funcionario func : listaFuncionario){
                Paragraph pNome = new Paragraph(func.getNome(), fnormal);
                pNome.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colNome = new PdfPCell(pNome);
                
                Paragraph pCpf = new Paragraph(func.getCpf(), fnormal);
                pCpf.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colCpf = new PdfPCell(pCpf);
                
                Paragraph pTel = new Paragraph(func.getTelefone(), fnormal);
                pTel.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colTel = new PdfPCell(pTel);
                
                Paragraph pNas = new Paragraph(func.getNasc(), fnormal);
                pNas.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colNas = new PdfPCell(pNas);
                
                Paragraph pfun = new Paragraph(func.getFuncao(), fnormal);
                pfun.setAlignment(Element.ALIGN_CENTER);
                PdfPCell colFun = new PdfPCell(pfun);
                colFun.setHorizontalAlignment(Element.ALIGN_CENTER);
                
                tabela.addCell(colNome);
                tabela.addCell(colCpf);
                tabela.addCell(colTel);
                tabela.addCell(colNas);
                tabela.addCell(colFun);
            }
        doc.add(tabela);    
        JOptionPane.showMessageDialog(null, "Relatório de Clientes salvo com sucesso em C:/RelatoriosToContigo/");
        Desktop.getDesktop().open(new File(caminho));
        doc.close();
    }
    
    public void gerarDocumentoProduto() throws IOException, DocumentException{
        Font f10 = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font f12 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font f15 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
        Font fnormal = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        
            //INICIO RELATORIO DE Produto.
            doc = new Document(PageSize.A4);
            
            String caminho = "C:/RelatoriosToContigo/RelatorioProduto.pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(caminho));
            doc.open();
            
            Paragraph nomeUniversidade = new Paragraph("ToContigo",f15);
            nomeUniversidade.setAlignment(Element.ALIGN_CENTER);
            nomeUniversidade.setSpacingAfter(10);
            
            Paragraph nomeRelatorio = new Paragraph("Relatório de Produtos" ,f12);
            nomeRelatorio.setAlignment(Element.ALIGN_CENTER);
            nomeRelatorio.setSpacingAfter(10);
            
            doc.add(nomeUniversidade);
            doc.add(nomeRelatorio);
            
            PdfPTable tabela = new PdfPTable(5);
            tabela.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.setWidthPercentage(100f);

            PdfPCell cabecalhoNome = new PdfPCell(new Paragraph("Nome", f10));
            cabecalhoNome.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoNome);

            PdfPCell cabecalhoMarca = new PdfPCell(new Paragraph("Marca",f10));
            cabecalhoMarca.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoMarca);
            
            PdfPCell cabecalhoQuantidade = new PdfPCell(new Paragraph("Quantidade",f10));
            cabecalhoQuantidade.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoQuantidade);
            
            PdfPCell cabecalhoUnidade = new PdfPCell(new Paragraph("Valor Unidade",f10));
            cabecalhoUnidade.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoUnidade);
            
            PdfPCell cabecalhoKilo = new PdfPCell(new Paragraph("Valor Kilo",f10));
            cabecalhoKilo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(cabecalhoKilo);
            
            
            tabela.setHeaderRows(1); // linha que sera repetida em todas as paginas.
            
            for (Produto prod : listaProduto){
                Paragraph pNome = new Paragraph(prod.getNome(), fnormal);
                pNome.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colNome = new PdfPCell(pNome);
                
                Paragraph pMarca = new Paragraph(prod.getMarca(), fnormal);
                pMarca.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colMarca = new PdfPCell(pMarca);
                
                Paragraph pQuant = new Paragraph(String.valueOf(prod.getQuantidade()), fnormal);
                pQuant.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colQuant = new PdfPCell(pQuant);
                
                Paragraph pUnid = new Paragraph(String.valueOf(prod.getUnidade()), fnormal);
                pUnid.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colUnid = new PdfPCell(pUnid);
                
                Paragraph pKilo = new Paragraph(String.valueOf(prod.getKilo()), fnormal);
                pKilo.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colKilo = new PdfPCell(pKilo);
                
                tabela.addCell(colNome);
                tabela.addCell(colMarca);
                tabela.addCell(colQuant);
                tabela.addCell(colUnid);
                tabela.addCell(colKilo);
            }
        doc.add(tabela);    
        JOptionPane.showMessageDialog(null, "Relatório de Clientes salvo com sucesso em C:/RelatoriosToContigo/");
        Desktop.getDesktop().open(new File(caminho));
        doc.close();
    }
    
    
    
    /*
    *                           *
    *   METODOS CLIENTE         *
    *                           *
    */
    public void LimparCamposCliente(){
        txtIDCliente.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        txtCNPJ.setText("");
        txtNasc.setText("");
        txtNumero.setText("");
        txtCep.setText("");
        txtTel.setText("");
        txtTelCom.setText("");
        txtCel.setText("");
        txtRua.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtPais.setText("");
        txtLimite.setText("");
    }
    
    public void AtivaCamposCliente(){
        txtNome.setEnabled(true);
        txtCPF.setEnabled(true);
        txtRG.setEnabled(true);
        txtCNPJ.setEnabled(true);
        txtNasc.setEnabled(true);
        txtTel.setEnabled(true);
        txtTelCom.setEnabled(true);
        txtCel.setEnabled(true);
        txtRua.setEnabled(true);
        txtBairro.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtCidade.setEnabled(true);
        txtEstado.setEnabled(true);
        txtPais.setEnabled(true);
        txtLimite.setEnabled(true);
        txtNumero.setEnabled(true);
        txtCep.setEnabled(true);
    }
        
    public void DesativaCamposCliente(){
        txtNome.setEnabled(false);
        txtCPF.setEnabled(false);
        txtRG.setEnabled(false);
        txtCNPJ.setEnabled(false);
        txtNasc.setEnabled(false);
        txtTel.setEnabled(false);
        txtTelCom.setEnabled(false);
        txtCel.setEnabled(false);
        txtRua.setEnabled(false);
        txtBairro.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtCidade.setEnabled(false);
        txtEstado.setEnabled(false);
        txtPais.setEnabled(false);
        txtLimite.setEnabled(false);
        txtNumero.setEnabled(false);
        txtCep.setEnabled(false);
    }
    
    public void PreparaNovoCliente(){
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tblCliente.setEnabled(false);
        tblCliente.clearSelection();
    }
    
    public void PreparaSalvareCancelarCliente(){
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tblCliente.setEnabled(true);
    }
    
    public void PreparaSelecaoTabelaCliente(){
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnAlterar.setEnabled(true);
    }
    
    public void PreparaAlterarCliente(){
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tblCliente.setEnabled(false);
        tblCliente.clearSelection();
    }
    
    public void PreparaExcluirCliente(){
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }
    
    /*
    *                           *
    *   METODOS FUNCIONARIO     *
    *                           *
    */
    public void LimparCamposFuncionario(){
        txtIDFuncionario.setText("");
        txtNome1.setText("");
        txtCPF1.setText("");
        txtRG1.setText("");
        txtNasc1.setText("");
        txtTel1.setText("");
        txtUsu.setText("");
        txtSenha.setText("");
        txtFuncao.setText("");
    }
    
    public void AtivaCamposFuncionario(){
        txtNome1.setEnabled(true);
        txtCPF1.setEnabled(true);
        txtRG1.setEnabled(true);
        txtNasc1.setEnabled(true);
        txtTel1.setEnabled(true);
        txtUsu.setEnabled(true);
        txtSenha.setEnabled(true);
        txtFuncao.setEnabled(true);
    }
    
    public void DesativaCamposFuncionario(){
        txtNome1.setEnabled(false);
        txtCPF1.setEnabled(false);
        txtRG1.setEnabled(false);
        txtNasc1.setEnabled(false);
        txtTel1.setEnabled(false);
        txtUsu.setEnabled(false);
        txtSenha.setEnabled(false);
        txtFuncao.setEnabled(false);
    }
    
    public void PreparaNovoFuncionario(){
        btnNovo1.setEnabled(false);
        btnSalvar1.setEnabled(true);
        btnCancelar1.setEnabled(true);
        tblFuncionario.setEnabled(false);
        tblFuncionario.clearSelection();
    }
    
    public void PreparaSalvareCancelarFuncionario(){
        btnNovo1.setEnabled(true);
        btnSalvar1.setEnabled(false);
        btnCancelar1.setEnabled(false);
        tblFuncionario.setEnabled(true);
    }
    
    public void PreparaSelecaoTabelaFuncionario(){
        btnNovo1.setEnabled(true);
        btnExcluir1.setEnabled(true);
        btnAlterar1.setEnabled(true);
    }
    
    public void PreparaAlterarFuncionario(){
        btnNovo1.setEnabled(false);
        btnExcluir1.setEnabled(false);
        btnAlterar1.setEnabled(false);
        btnSalvar1.setEnabled(true);
        btnCancelar1.setEnabled(true);
        tblFuncionario.setEnabled(false);
        tblFuncionario.clearSelection();
    }
    
    public void PreparaExcluirFuncionario(){
        btnExcluir1.setEnabled(false);
        btnAlterar1.setEnabled(false);
    }
    
    /*                          
    *                           *
    *   METODOS PRODUTO         *
    *                           *
    */
    public void LimparCamposProduto(){
        txtIDProduto.setText("");
        txtNome2.setText("");
        txtMarca.setText("");
        txtGrupo.setText("");
        txtUnidade.setText("");
        txtKilo.setText("");
    }
    
    public void AtivaCamposProduto(){
        txtNome2.setEnabled(true);
        txtMarca.setEnabled(true);
        txtGrupo.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtKilo.setEnabled(true);
    }
    
    public void DesativaCamposProduto(){
        txtNome2.setEnabled(false);
        txtMarca.setEnabled(false);
        txtGrupo.setEnabled(false);
        txtUnidade.setEnabled(false);
        txtKilo.setEnabled(false);
    }
    public void PreparaNovoProduto(){
        btnNovo2.setEnabled(false);
        btnSalvar2.setEnabled(true);
        btnCancelar2.setEnabled(true);
        tblProduto.setEnabled(false);
        tblProduto.clearSelection();
    }
    
    public void PreparaSalvareCancelarProduto(){
        btnNovo2.setEnabled(true);
        btnSalvar2.setEnabled(false);
        btnCancelar2.setEnabled(false);
        tblProduto.setEnabled(true);
    }
    
    public void PreparaSelecaoTabelaProduto(){
        btnNovo2.setEnabled(true);
        btnExcluir2.setEnabled(true);
        btnAlterar2.setEnabled(true);
    }
    
    public void PreparaAlterarProduto(){
        btnNovo2.setEnabled(false);
        btnExcluir2.setEnabled(false);
        btnAlterar2.setEnabled(false);
        btnSalvar2.setEnabled(true);
        btnCancelar2.setEnabled(true);
        tblProduto.setEnabled(false);
        tblProduto.clearSelection();
    }
    
    public void PreparaExcluirProduto(){
        btnExcluir2.setEnabled(false);
        btnAlterar2.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioCpf;
    private javax.swing.JRadioButton RadioRg;
    private javax.swing.JTabbedPane TablePaneCliente;
    private javax.swing.JTabbedPane TablePaneFuncionario;
    private javax.swing.JTabbedPane TablePaneProduto;
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnAlterar1;
    private javax.swing.JToggleButton btnAlterar2;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnCancelar1;
    private javax.swing.JToggleButton btnCancelar2;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnExcluir1;
    private javax.swing.JToggleButton btnExcluir2;
    private javax.swing.JToggleButton btnGerarCliente;
    private javax.swing.JToggleButton btnGerarFuncionario;
    private javax.swing.JToggleButton btnGerarProduto;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JToggleButton btnNovo1;
    private javax.swing.JToggleButton btnNovo2;
    private javax.swing.JButton btnRelatorioCliente;
    private javax.swing.JButton btnRelatorioFuncionario;
    private javax.swing.JButton btnRelatorioProduto;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JToggleButton btnSalvar1;
    private javax.swing.JToggleButton btnSalvar2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame clientes;
    private javax.swing.JFrame funcionarios;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JLabel lblVoltar1;
    private javax.swing.JLabel lblVoltar2;
    private javax.swing.JLabel lblVoltar3;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlCliente1;
    private javax.swing.JPanel pnlCliente2;
    private javax.swing.JPanel pnlCliente3;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JFrame produtos;
    private javax.swing.JFrame relatorios;
    private javax.swing.JSlider sldQuantidade;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTable tblRelatorioCliente;
    private javax.swing.JTable tblRelatorioFuncionario;
    private javax.swing.JTable tblRelatorioProduto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBuscaCliente;
    private javax.swing.JTextField txtBuscaFuncionario;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPF1;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtEstado;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDFuncionario;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtKilo;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JFormattedTextField txtNasc1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtRG1;
    private javax.swing.JTextField txtRelatorioCliente;
    private javax.swing.JTextField txtRelatorioFuncionario;
    private javax.swing.JTextField txtRelatorioProduto;
    private javax.swing.JTextField txtRua;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTelCom;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
