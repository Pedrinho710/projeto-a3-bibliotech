import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telalogin extends JFrame {
    private JTextField textFieldEmail;
    private JPasswordField passwordFieldSenha;

    public Telalogin() {
        initComponents();
    }

    private void initComponents() {
        Font font = new Font("Arial", Font.ITALIC, 20);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380, 350);
        setResizable(true);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setBackground(new Color(250, 250, 250));
        painelPrincipal.setLayout(new BorderLayout());

        JLabel labelIconeLogin = new JLabel(new ImageIcon(getClass().getResource("/logo.png")));
        labelIconeLogin.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel painelFormulario = new JPanel();
        painelFormulario.setOpaque(false);
        painelFormulario.setLayout(new GridLayout(2, 1, 0, 10));

        JPanel painelCampoEmail = new JPanel();
        painelCampoEmail.setOpaque(false);
        painelCampoEmail.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        JLabel labelEmail = new JLabel("Email: ");
        textFieldEmail = new JTextField(20);
        labelEmail.setFont(font);

        painelCampoEmail.add(labelEmail);
        painelCampoEmail.add(textFieldEmail);
        painelCampoEmail.setFont(font);

        JPanel painelCampoSenha = new JPanel();
        painelCampoSenha.setOpaque(false);
        painelCampoSenha.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelCampoSenha.setFont(font);


        JLabel labelSenha = new JLabel("Senha: ");
        passwordFieldSenha = new JPasswordField(20);
        labelSenha.setFont(font);

        painelCampoSenha.add(labelSenha);
        painelCampoSenha.add(passwordFieldSenha);

        painelFormulario.add(painelCampoEmail);
        painelFormulario.add(painelCampoSenha);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setOpaque(false);
        painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
        
        JButton btnSair = new JButton("Sair");
        btnSair.setFont(font);
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setFont(font);

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        //btnEntrar.addActionListener(new ActionListener() {
            //public void actionPerformed(ActionEvent e) {
                //  
                //dispose();
                //TelaPrincipal principal = new TelaPrincipal();
                //principal.setVisible(true);
            //}
        //});

        painelBotoes.add(btnSair);
        painelBotoes.add(btnEntrar);

        painelPrincipal.add(labelIconeLogin, BorderLayout.NORTH);
        painelPrincipal.add(painelFormulario, BorderLayout.CENTER);
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        add(painelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Telalogin telaLogin = new Telalogin();
                telaLogin.setVisible(true);
            }
});
}
}