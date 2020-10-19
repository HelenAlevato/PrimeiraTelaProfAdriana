import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;

public class TelaPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtSexo;
	private JTextField txtAltura;
	private JTextField txtPesoAtual;
	private JTextField txtPesoAnterior;
	private Pessoa pessoa = new Pessoa();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPessoa frame = new TelaPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPessoa() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(123, 57, 188, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(204, 204, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(39, 59, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Caracter\u00EDsticas Pessoais");
		lblNewLabel_1.setForeground(new Color(204, 204, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 374, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMensagem = new JLabel("");
		lblMensagem.setForeground(new Color(204, 255, 255));
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setBounds(0, 272, 159, 109);
		contentPane.add(lblMensagem);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setForeground(new Color(204, 204, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(39, 84, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Altura:");
		lblNewLabel_3.setForeground(new Color(204, 204, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(39, 109, 83, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setForeground(new Color(204, 204, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(39, 134, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso Atual:");
		lblNewLabel_5.setForeground(new Color(204, 204, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(39, 159, 83, 14);
		contentPane.add(lblNewLabel_5);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(123, 82, 188, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(123, 132, 188, 20);
		contentPane.add(txtSexo);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(123, 107, 188, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Peso Anterior:");
		lblNewLabel_6.setForeground(new Color(204, 204, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setBounds(39, 189, 83, 14);
		contentPane.add(lblNewLabel_6);
		
		txtPesoAtual = new JTextField();
		txtPesoAtual.setBounds(123, 157, 188, 20);
		contentPane.add(txtPesoAtual);
		txtPesoAtual.setColumns(10);
		
		txtPesoAnterior = new JTextField();
		txtPesoAnterior.setBounds(123, 187, 188, 20);
		contentPane.add(txtPesoAnterior);
		txtPesoAnterior.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pessoa.setNome(txtNome.getText());
				pessoa.setIdade(Float.parseFloat(txtIdade.getText()));
				pessoa.setSexo(txtSexo.getText());
				pessoa.setAltura(Float.parseFloat(txtAltura.getText()));
				pessoa.setPesoAtual(Float.parseFloat(txtPesoAtual.getText()));
				pessoa.setPesoAnterior(Float.parseFloat(txtPesoAnterior.getText()));
				
				String mensagem = "<html>Nome: " + pessoa.getNome() + "<br> Idade: " + pessoa.getIdade() + "<br> Altura: " + pessoa.getAltura() + "<br> Sexo: " + pessoa.getSexo() + "<br> Peso Atual: " + pessoa.getPesoAtual() + "<br> Peso Anterior: " + pessoa.getPesoAnterior() + "</html>";
				lblMensagem.setText(mensagem);
				
				
			}
		});
		btnCadastrar.setBounds(38, 228, 110, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnNewButton = new JButton("CALCULAR M\u00C9DIA DE PESO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMensagem.setText("A média é: " + pessoa.getMedia());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(161, 228, 188, 23);
		contentPane.add(btnNewButton);
		
		Icon imagemFundo = new ImageIcon("recursos/planeta1.jpg");
		
		JLabel lblImagemFundo = new JLabel("");
		lblImagemFundo.setBounds(0, 0, 402, 392);
		lblImagemFundo.setIcon(imagemFundo);
		contentPane.add(lblImagemFundo);
		
		
		
	}
}
