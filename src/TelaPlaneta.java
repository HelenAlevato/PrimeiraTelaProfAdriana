import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class TelaPlaneta extends JFrame {

	private JPanel contentPane;
	private Planeta planeta = new Planeta();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPlaneta frame = new TelaPlaneta();
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
	public TelaPlaneta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movimento de Rota\u00E7\u00E3o dos Planetas");
		lblNewLabel.setForeground(new Color(204, 204, 255));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 482, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblMensagem = new JLabel();
		lblMensagem.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblMensagem.setForeground(new Color(204, 204, 255));
		lblMensagem.setBounds(288, 172, 194, 187);
		contentPane.add(lblMensagem);
		
		JButton btnMercurio = new JButton("MERC\u00DARIO");
		btnMercurio.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnMercurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mensagem = "<html>O movimento de rotação do planeta é de 59 dias, enquanto o de translação é de 87 dias.</html>";
				lblMensagem.setText(mensagem);
				
			}
		});
		btnMercurio.setBounds(39, 61, 109, 23);
		contentPane.add(btnMercurio);
		
		JButton btnVenus = new JButton("V\u00CANUS");
		btnVenus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>Seu movimento de rotação é um dos mais lentos, com 243 dias para completar a volta em torno se si mesmo; e, o movimento de translação de 225 dias aproximadamente.</html>";
				lblMensagem.setText(mensagem);
				
			}
		});
		btnVenus.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnVenus.setBounds(39, 95, 109, 23);
		contentPane.add(btnVenus);
		
		JButton btnTerra = new JButton("TERRA");
		btnTerra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>O movimento de rotação terrestre dura aproximadamente 24 horas (tempo de 1 dia); enquanto o movimento de translação do planeta dura 365 dias (tempo de 1 ano), exceto nos anos bissextos, os quais apresentam 366 dias.</html>";
				lblMensagem.setText(mensagem);
			}
		});
		btnTerra.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnTerra.setBounds(39, 129, 109, 23);
		contentPane.add(btnTerra);
		
		JButton btnMarte = new JButton("MARTE");
		btnMarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>O movimento de rotação de Marte assemelha-se ao da Terra, com duração de 24 horas e 37 minutos, enquanto que o movimento de translação do planeta é de 687 dias.</html>";
				lblMensagem.setText(mensagem);
			}
		});
		btnMarte.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnMarte.setBounds(39, 163, 109, 23);
		contentPane.add(btnMarte);
		
		JButton btnJupiter = new JButton("J\u00DAPITER");
		btnJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>Seu movimento de rotação dura 9 horas e 55 minutos, considerado o movimento de rotação mais rápido de todos os planetas do sistema solar; enquanto o movimento de translação do planeta corresponde a cerca de 12 anos terrestres.</html>";
				lblMensagem.setText(mensagem);
			}
		});
		btnJupiter.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnJupiter.setBounds(39, 201, 109, 23);
		contentPane.add(btnJupiter);
		
		JButton btnSaturno = new JButton("SATURNO");
		btnSaturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>Seu movimento de rotação dura 10 horas e 14 minutos e o de translação cerca de 30 anos terrestres.</html>";
				lblMensagem.setText(mensagem);
			}
		});
		btnSaturno.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnSaturno.setBounds(39, 235, 109, 23);
		contentPane.add(btnSaturno);
		
		JButton btnUrano = new JButton("URANO");
		btnUrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>O movimento de rotação do planeta dura 17 horas aproximadamente, enquanto o movimento de translação dura cerca de 165 anos terrestres.</html>";
				lblMensagem.setText(mensagem);
			}
		});
		btnUrano.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnUrano.setBounds(39, 269, 109, 23);
		contentPane.add(btnUrano);
		
		JButton btnNetuno = new JButton("NETUNO");
		btnNetuno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "<html>O movimento de rotação do planeta dura cerca de 16 horas, enquanto sua translação equivale a 164 anos terrestres.</html>";
				lblMensagem.setText(mensagem);
			}
		});
		btnNetuno.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnNetuno.setBounds(39, 303, 109, 23);
		contentPane.add(btnNetuno);
		
		Icon imagemFundo = new ImageIcon("recursos/sistema_solar.jpg");
		
		
		JLabel lblimagemFundo = new JLabel("");
		lblimagemFundo.setBounds(0, 0, 482, 359);
		lblimagemFundo.setIcon(imagemFundo);
		contentPane.add(lblimagemFundo);
		
		
	}
}
