package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {
	

	private JFrame frmCalculadora;
	private JTextField txtgjgField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(255, 128, 192));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 370, 522);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtgjgField = new JTextField();
		txtgjgField.setBackground(new Color(255, 236, 245));
		txtgjgField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtgjgField.setFont(new Font("Arial", Font.BOLD, 20));
		txtgjgField.setBounds(0, 11, 354, 58);
		frmCalculadora.getContentPane().add(txtgjgField);
		txtgjgField.setColumns(10);
		
		JButton btnigual = new JButton("=");
		btnigual.setForeground(new Color(255, 0, 0));
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(txtgjgField.getText());
				if (operacao.equals("+")) {
					resultado = numero1+numero2;
					txtgjgField.setText(String.valueOf(resultado));
				}else if (operacao.equals("-")) {
					resultado = numero1-numero2;
					txtgjgField.setText(String.valueOf(resultado));
				}else if (operacao.equals("*")) {
					resultado = numero1*numero2;
					txtgjgField.setText(String.valueOf(resultado));
				}else if (operacao.equals("/")) {
					resultado = numero1/numero2;
					txtgjgField.setText(String.valueOf(resultado));
				}else if (operacao.equals("%")) {
					resultado = numero1+(numero1*(numero2*0.1));
					txtgjgField.setText(String.valueOf(resultado));
				
				}
			}
		});
		btnigual.setFont(new Font("Arial", Font.BOLD, 20));
		btnigual.setBounds(272, 405, 60, 58);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btndivisao = new JButton("÷");
		btndivisao.setForeground(new Color(255, 0, 0));
		btndivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtgjgField.getText());
				txtgjgField.setText ("");
				operacao = "/";
			}
		});
		btndivisao.setFont(new Font("Arial", Font.BOLD, 20));
		btndivisao.setBounds(272, 129, 60, 58);
		frmCalculadora.getContentPane().add(btndivisao);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtgjgField.getText());
				txtgjgField.setText ("");
				operacao = "*";
			}
		});
		btnmult.setForeground(new Color(255, 0, 0));
		btnmult.setFont(new Font("Arial", Font.BOLD, 20));
		btnmult.setBounds(272, 198, 60, 58);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtgjgField.getText());
				txtgjgField.setText ("");
				operacao = "-";
			}
		});
		btnsub.setForeground(new Color(255, 0, 0));
		btnsub.setFont(new Font("Arial", Font.BOLD, 20));
		btnsub.setBounds(272, 267, 60, 58);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtgjgField.getText());
				txtgjgField.setText ("");
				operacao = "+";
				
			}
		});
		btnsoma.setForeground(new Color(255, 0, 0));
		btnsoma.setFont(new Font("Arial", Font.BOLD, 20));
		btnsoma.setBounds(272, 336, 60, 58);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn3.getText());
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		btn3.setBounds(191, 336, 71, 58);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn6.getText());
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		btn6.setBounds(191, 267, 71, 58);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn9.getText());
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		btn9.setBounds(191, 198, 71, 58);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btnraiz = new JButton("2√x");
		btnraiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtgjgField.getText());
				txtgjgField.setText ("");
				operacao = "2√x";
			}
		});
		btnraiz.setForeground(new Color(128, 128, 128));
		btnraiz.setFont(new Font("Arial", Font.BOLD, 20));
		btnraiz.setBounds(191, 129, 71, 58);
		frmCalculadora.getContentPane().add(btnraiz);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setBounds(110, 336, 71, 58);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn5.getText());
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		btn5.setBounds(110, 267, 71, 58);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		btn8.setBounds(110, 198, 71, 58);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btnaoquadrado = new JButton("x²");
		btnaoquadrado.setForeground(new Color(128, 128, 128));
		btnaoquadrado.setFont(new Font("Arial", Font.BOLD, 20));
		btnaoquadrado.setBounds(110, 131, 71, 58);
		frmCalculadora.getContentPane().add(btnaoquadrado);
		
		JButton btnelevado = new JButton("1/x");
		btnelevado.setForeground(new Color(128, 128, 128));
		btnelevado.setFont(new Font("Arial", Font.BOLD, 20));
		btnelevado.setBounds(29, 131, 71, 58);
		frmCalculadora.getContentPane().add(btnelevado);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn7.getText());
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		btn7.setBounds(29, 198, 71, 58);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn4.getText());
			}
			
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		btn4.setBounds(29, 267, 71, 58);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setBounds(29, 336, 71, 58);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnmaisoumenos = new JButton("+/-");
		btnmaisoumenos.setForeground(new Color(255, 0, 0));
		btnmaisoumenos.setFont(new Font("Arial", Font.BOLD, 20));
		btnmaisoumenos.setBounds(29, 405, 71, 58);
		frmCalculadora.getContentPane().add(btnmaisoumenos);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btn0.getText());
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		btn0.setBounds(110, 405, 71, 58);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnvirgula = new JButton(",");
		btnvirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(txtgjgField.getText() + btnvirgula.getText());
			}
		});
		btnvirgula.setForeground(new Color(255, 0, 0));
		btnvirgula.setFont(new Font("Arial", Font.BOLD, 20));
		btnvirgula.setBounds(191, 405, 71, 58);
		frmCalculadora.getContentPane().add(btnvirgula);
		
		JButton btnporcentagem = new JButton("%");
		btnporcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtgjgField.getText());
				txtgjgField.setText ("");
				operacao = "%";
			}
		});
		btnporcentagem.setForeground(new Color(128, 128, 128));
		btnporcentagem.setFont(new Font("Arial", Font.BOLD, 20));
		btnporcentagem.setBounds(29, 72, 71, 58);
		frmCalculadora.getContentPane().add(btnporcentagem);
		
		JButton btncancelar = new JButton("CE");
		btncancelar.setForeground(new Color(128, 128, 128));
		btncancelar.setFont(new Font("Arial", Font.BOLD, 20));
		btncancelar.setBounds(110, 72, 71, 58);
		frmCalculadora.getContentPane().add(btncancelar);
		
		JButton btnlimpar = new JButton("C");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtgjgField.setText(" ");
			}
		});
		btnlimpar.setForeground(new Color(128, 128, 128));
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 20));
		btnlimpar.setBounds(191, 72, 71, 58);
		frmCalculadora.getContentPane().add(btnlimpar);
		
		
		JButton btnDel = new JButton("DEL");
		btnDel.setForeground(Color.RED);
		btnDel.setFont(new Font("Arial", Font.BOLD, 14));
		btnDel.setBounds(272, 72, 60, 58);
		frmCalculadora.getContentPane().add(btnDel);
	}
}
