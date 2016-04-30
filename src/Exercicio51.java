import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio51 {

	static Scanner teclado = new Scanner(System.in);
	static JFrame telaMenu = new JFrame();
	static JLabel titulo = new JLabel("Menu");
	static JButton cadastrar = new JButton("1) Cadastrar");
	static JButton atualizar = new JButton("2) Atualizar");
	static JButton excluir = new JButton("3) Excluir");
	static JButton consultar = new JButton("4) Consultar");
	static JLabel joao = new JLabel("João Paulo Nunes Marques");

	static JFrame telaCadastro = new JFrame();
	static JLabel opcao1 = new JLabel("Cadastro");
	static JLabel cod = new JLabel("Código: ");
	static JLabel nome = new JLabel("Nome: ");
	static JLabel endereco = new JLabel("Endereço: ");
	static JLabel telefone = new JLabel("Telefone: ");
	static JTextField campo1 = new JTextField();
	static JTextField campo2 = new JTextField();
	static JTextField campo3 = new JTextField();
	static JTextField campo4 = new JTextField();
	static JButton cadastre = new JButton("Cadastrar");
	static int qntcliente = 100;
	static int informacao = 3;
	static String [][] posicao = new String[100][3];

	static JFrame telaAtualizar = new JFrame();
	static JLabel opcao2 = new JLabel("Atualizar");

	static JFrame telaExcluir = new JFrame();
	static JLabel opcao3 = new JLabel("Excluir");

	static JFrame telaConsultar = new JFrame();
	static JLabel opcao4 = new JLabel("Consultar");
	static JTextArea consulta = new JTextArea("Clientes");

	static JButton voltarMenu = new JButton("Voltar ao Menu");

	public static void main(String[] args) {

		JanelaMenu();
		JanelaCadastro();
		JanelaAtualizar();
		JanelaExcluir();
		JanelaConsultar();

	}

	static void JanelaMenu() {

		Menu();

		telaMenu.setTitle("Exercicio 51");
		telaMenu.setLayout(null);
		telaMenu.setSize(900, 700);
		telaMenu.getContentPane().setBackground(Color.WHITE);
		telaMenu.setResizable(false);
		telaMenu.setLocationRelativeTo(null);
		telaMenu.setVisible(true);
		telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	static void Menu() {

		telaMenu.add(titulo);
		titulo.setBounds(420, -250, 600, 600);
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setVisible(true);

		telaMenu.add(cadastrar);
		cadastrar.setFont(new Font("Arial", Font.PLAIN, 15));
		cadastrar.setBounds(360, 140, 200, 50);
		cadastrar.setVisible(true);

		telaMenu.add(atualizar);
		atualizar.setFont(new Font("Arial", Font.PLAIN, 15));
		atualizar.setBounds(360, 240, 200, 50);
		atualizar.setVisible(true);

		telaMenu.add(excluir);
		excluir.setFont(new Font("Arial", Font.PLAIN, 15));
		excluir.setBounds(360, 340, 200, 50);
		excluir.setVisible(true);

		telaMenu.add(consultar);
		consultar.setFont(new Font("Arial", Font.PLAIN, 15));
		consultar.setBounds(360, 440, 200, 50);
		consultar.setVisible(true);

		telaMenu.add(joao);
		joao.setFont(new Font("Arial", Font.PLAIN, 15));
		joao.setBounds(400, 300, 600, 600);
		joao.setFont(new Font("Arial", Font.BOLD, 10));
		joao.setVisible(true);

	}

	static void JanelaCadastro() {

		cadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Cadastro();

				telaCadastro.add(voltarMenu);
				VoltarMenu();

				telaCadastro.setTitle("Cadastro");
				telaCadastro.setLayout(null);
				telaCadastro.setSize(900, 700);
				telaCadastro.getContentPane().setBackground(Color.WHITE);
				telaCadastro.setResizable(false);
				telaCadastro.setLocationRelativeTo(null);
				telaCadastro.setVisible(true);

				telaCadastro.add(opcao1);
				opcao1.setBounds(410, -250, 600, 600);
				opcao1.setFont(new Font("Arial", Font.BOLD, 30));
				opcao1.setVisible(true);

			}
		});

	}

	static void Cadastro() {

		BotaoCadastrar();

		telaCadastro.add(cod);
		cod.setVisible(true);
		cod.setBounds(100, 150, 200, 50);
		cod.setFont(new Font("Arial", Font.PLAIN, 15));

		telaCadastro.add(campo1);
		campo1.setVisible(true);
		campo1.setBounds(155, 160, 50, 30);

		telaCadastro.add(nome);
		nome.setVisible(true);
		nome.setBounds(215, 150, 200, 50);
		nome.setFont(new Font("Arial", Font.PLAIN, 15));

		telaCadastro.add(campo2);
		campo2.setVisible(true);
		campo2.setBounds(260, 160, 510, 30);

		telaCadastro.add(endereco);
		endereco.setVisible(true);
		endereco.setBounds(100, 250, 200, 50);
		endereco.setFont(new Font("Arial", Font.PLAIN, 15));

		telaCadastro.add(campo3);
		campo3.setVisible(true);
		campo3.setBounds(170, 260, 600, 30);

		telaCadastro.add(telefone);
		telefone.setVisible(true);
		telefone.setBounds(100, 350, 200, 50);
		telefone.setFont(new Font("Arial", Font.PLAIN, 15));

		telaCadastro.add(campo4);
		campo4.setVisible(true);
		campo4.setBounds(165, 360, 605, 30);

		telaCadastro.add(cadastre);
		cadastre.setVisible(true);
		cadastre.setBounds(380, 450, 200, 50);

	}

	static void BotaoCadastrar() {

		cadastre.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int cod = campo1.getHeight();

				posicao[cod][0] = campo1.getText();
				posicao[cod][1] = campo2.getText();
				posicao[cod][2] = campo3.getText();

			}

		});

	}

	static void JanelaAtualizar() {

		atualizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Atualizar();

				telaAtualizar.add(voltarMenu);
				VoltarMenu();

				telaAtualizar.setTitle("Atualizar");
				telaAtualizar.setLayout(null);
				telaAtualizar.setSize(900, 700);
				telaAtualizar.getContentPane().setBackground(Color.WHITE);
				telaAtualizar.setResizable(false);
				telaAtualizar.setLocationRelativeTo(null);
				telaAtualizar.setVisible(true);

				telaAtualizar.add(opcao2);
				opcao2.setBounds(410, -250, 600, 600);
				opcao2.setFont(new Font("Arial", Font.BOLD, 30));
				opcao2.setVisible(true);

			}
		});

	}

	static void Atualizar() {

	}

	static void JanelaExcluir() {

		excluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Excluir();

				telaExcluir.add(voltarMenu);
				VoltarMenu();

				telaExcluir.setTitle("Excluir");
				telaExcluir.setLayout(null);
				telaExcluir.setSize(900, 700);
				telaExcluir.getContentPane().setBackground(Color.WHITE);
				telaExcluir.setResizable(false);
				telaExcluir.setLocationRelativeTo(null);
				telaExcluir.setVisible(true);

				telaExcluir.add(opcao3);
				opcao3.setBounds(410, -250, 600, 600);
				opcao3.setFont(new Font("Arial", Font.BOLD, 30));
				opcao3.setVisible(true);

			}
		});

	}

	static void Excluir() {

	}

	static void JanelaConsultar() {

		consultar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Consultar();

				telaConsultar.add(voltarMenu);
				VoltarMenu();

				telaConsultar.setTitle("Consultar");
				telaConsultar.setLayout(null);
				telaConsultar.setSize(900, 700);
				telaConsultar.getContentPane().setBackground(Color.WHITE);
				telaConsultar.setResizable(false);
				telaConsultar.setLocationRelativeTo(null);
				telaConsultar.setVisible(true);

				telaConsultar.add(opcao4);
				opcao4.setBounds(410, -250, 600, 600);
				opcao4.setFont(new Font("Arial", Font.BOLD, 30));
				opcao4.setVisible(true);

			}
		});

	}

	static void Consultar() {

	}

	static void VoltarMenu() {

		voltarMenu.setVisible(true);
		voltarMenu.setBounds(650, 590, 200, 50);

		voltarMenu.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telaCadastro.dispose();
				telaAtualizar.dispose();
				telaExcluir.dispose();
				telaConsultar.dispose();
				JanelaMenu();

			}
		});

	}

}
