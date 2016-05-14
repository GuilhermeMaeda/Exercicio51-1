package exercicio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Exercicio51 {

	static JFrame telaMenu = new JFrame();
	static JFrame telaCadastro = new JFrame();
	static JFrame telaEditar = new JFrame();

	static JButton botaoCadastrar = new JButton("Cadastrar Cliente");
	static JButton botaoSalvarCadastro = new JButton("Cadastrar");
	static JButton botaoEditar = new JButton("Editar");
	static JButton botaoSalvarEdicao = new JButton("Salvar");
	static JButton botaoCadastrarTel = new JButton("Cadastrar Telefone");
	static JButton botaoExcluir = new JButton("Excluir");
	static JButton botaoVoltarMenu = new JButton("Voltar ao Menu");
	static JButton botaoSair = new JButton("Sair");

	static JLabel lbCadastroMenu = new JLabel("Cadastro de Clientes");
	static JLabel lbCadastro = new JLabel("Cadastro");
	static JLabel lbCodigo = new JLabel("Código: ");
	static JLabel lbImprimirCodigo = new JLabel();
	static JLabel lbNome = new JLabel("Nome: ");
	static JLabel lbEndereco = new JLabel("Endereço: ");
	static JLabel lbCpf = new JLabel("CPF: ");
	static JLabel lbEditar = new JLabel("Editar");
	static JLabel lbJoao = new JLabel("João Paulo Nunes Marques");

	static JTextField textNome = new JTextField();
	static JTextField textEndereco = new JTextField();
	static JTextField textCpf = new JTextField();

	static JTable tableConsultas = new JTable();
	static JPanel panelConsulta = new JPanel();
	static JScrollPane scrollConsulta = new JScrollPane(tableConsultas);

	private static final String ARIAL = "Arial";
	private static final String INATIVO = "INATIVO";
	static int codigo = 0;
	static int qntcliente = 100;
	static int informacao = 3;
	static String[][] posicao = new String[qntcliente][informacao];

	public static void main(String[] args) {

		janelaMenu();
		janelaCadastrar();
		janelaEditar();
		janelaExcluir();
		acaoCadastrar();
		acaoEditar();
		acaoSair();

	}

	static void janelaMenu() {

		telaMenu.add(botaoSair);
		botaoSair.setBounds(650, 590, 200, 50);

		componentesMenu();

		telaMenu.setTitle("Cadastro de Clientes");
		telaMenu.setLayout(null);
		telaMenu.setSize(900, 700);
		telaMenu.getContentPane().setBackground(Color.WHITE);
		telaMenu.setResizable(false);
		telaMenu.setLocationRelativeTo(null);
		telaMenu.setVisible(true);
		telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telaMenu.add(lbCadastroMenu);
		lbCadastroMenu.setBounds(325, -255, 600, 600);
		lbCadastroMenu.setFont(new Font(ARIAL, Font.BOLD, 25));
		lbCadastroMenu.setVisible(true);

		telaMenu.add(lbJoao);
		lbJoao.setFont(new Font(ARIAL, Font.PLAIN, 15));
		lbJoao.setBounds(395, 360, 600, 600);
		lbJoao.setFont(new Font(ARIAL, Font.BOLD, 10));
		lbJoao.setVisible(true);

	}

	static void componentesMenu() {

		telaMenu.add(botaoCadastrar);
		botaoCadastrar.setToolTipText("Clique para cadastrar um cliente");
		botaoCadastrar.setBounds(150, 90, 200, 50);
		botaoCadastrar.setVisible(true);

		telaMenu.add(botaoCadastrarTel);
		botaoCadastrarTel.setToolTipText("Clique para cadastrar um telefone");
		botaoCadastrarTel.setBounds(550, 90, 200, 50);
		botaoCadastrarTel.setVisible(true);

		telaMenu.add(botaoEditar);
		botaoEditar.setFont(new Font(ARIAL, Font.PLAIN, 15));
		botaoEditar.setToolTipText("Clique para atualizar um cliente");
		botaoEditar.setBounds(280, 590, 200, 50);
		botaoEditar.setVisible(true);

		telaMenu.add(botaoExcluir);
		botaoExcluir.setFont(new Font(ARIAL, Font.PLAIN, 15));
		botaoExcluir.setToolTipText("Clique para excluir um cliente");
		botaoExcluir.setBounds(50, 590, 200, 50);
		botaoExcluir.setVisible(true);

		tableConsultas.setLayout(null);
		tableConsultas.setVisible(true);
		tableConsultas.setBounds(0, 0, 800, 500);
		tableConsultas.setModel(new DefaultTableModel(new Object[] { "Código", "Nome", "Endereço", "CPF" }, 0));

		scrollConsulta.add(tableConsultas);
		scrollConsulta.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollConsulta.setBounds(0, 0, 800, 415);
		scrollConsulta.setViewportView(tableConsultas);

		telaMenu.add(panelConsulta);
		panelConsulta.add(scrollConsulta);
		panelConsulta.setLayout(null);
		panelConsulta.setVisible(true);
		panelConsulta.setBounds(50, 160, 800, 415);

		for (int i = 0; i < codigo; i++) {
			DefaultTableModel valores = (DefaultTableModel) tableConsultas.getModel();
			valores.addRow(new Object[] { i + 1, posicao[i][0], posicao[i][1], posicao[i][2] });
		}

	}

	static void janelaCadastrar() {

		botaoCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				componentesCadastar();

				telaCadastro.add(botaoVoltarMenu);
				acaoVoltarMenu();
				botaoVoltarMenu.setBounds(550, 490, 200, 50);

				telaCadastro.setTitle("Cadastro");
				telaCadastro.setLayout(null);
				telaCadastro.setSize(800, 600);
				telaCadastro.getContentPane().setBackground(Color.WHITE);
				telaCadastro.setResizable(false);
				telaCadastro.setLocationRelativeTo(null);
				telaCadastro.setVisible(true);

				telaCadastro.add(lbCadastro);
				lbCadastro.setBounds(345, -220, 600, 600);
				lbCadastro.setFont(new Font(ARIAL, Font.BOLD, 30));
				lbCadastro.setVisible(true);

			}
		});

	}

	static void componentesCadastar() {

		telaCadastro.add(lbCodigo);
		lbCodigo.setVisible(true);
		lbCodigo.setBounds(50, 150, 200, 50);
		lbCodigo.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaCadastro.add(lbImprimirCodigo);
		lbImprimirCodigo.setVisible(true);
		lbImprimirCodigo.setBounds(110, 150, 200, 50);
		lbImprimirCodigo.setText(String.valueOf(codigo + 1));
		lbImprimirCodigo.setFont(new Font(ARIAL, Font.BOLD, 15));

		telaCadastro.add(lbNome);
		lbNome.setVisible(true);
		lbNome.setBounds(140, 150, 200, 50);
		lbNome.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaCadastro.add(textNome);
		textNome.setVisible(true);
		textNome.setBounds(190, 160, 555, 30);

		telaCadastro.add(lbEndereco);
		lbEndereco.setVisible(true);
		lbEndereco.setBounds(50, 250, 200, 50);
		lbEndereco.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaCadastro.add(textEndereco);
		textEndereco.setVisible(true);
		textEndereco.setBounds(125, 260, 620, 30);

		telaCadastro.add(lbCpf);
		lbCpf.setVisible(true);
		lbCpf.setBounds(50, 350, 200, 50);
		lbCpf.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaCadastro.add(textCpf);
		textCpf.setVisible(true);
		textCpf.setBounds(90, 360, 655, 30);

		telaCadastro.add(botaoSalvarCadastro);
		botaoSalvarCadastro.setVisible(true);
		botaoSalvarCadastro.setToolTipText("Clique para confirmar o cadastro");
		botaoSalvarCadastro.setBounds(300, 420, 200, 50);

	}

	static void acaoCadastrar() {

		botaoSalvarCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (textNome.getText().trim().isEmpty() || textEndereco.getText().trim().isEmpty()
						|| textCpf.getText().trim().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Preencha os campos!");
					componentesCadastar();

				} else {

					posicao[codigo][0] = textNome.getText();
					posicao[codigo][1] = textEndereco.getText();
					posicao[codigo][2] = textCpf.getText();

					codigo++;

					int desejo = JOptionPane.showConfirmDialog(null, "Deseja continuar cadastrando?");
					if (desejo == JOptionPane.YES_OPTION) {

						componentesCadastar();
						textNome.setText(null);
						textEndereco.setText(null);
						textCpf.setText(null);

					} else {

						textNome.setText(null);
						textEndereco.setText(null);
						textCpf.setText(null);
						telaCadastro.dispose();
						janelaMenu();

					}

				}

			}

		});

	}

	static void janelaEditar() {

		botaoEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (tableConsultas.getSelectedRow() != -1) {

					componentesEditar();

					telaEditar.add(botaoVoltarMenu);
					acaoVoltarMenu();

					telaEditar.setTitle("Editar Cliente");
					telaEditar.setLayout(null);
					telaEditar.setSize(800, 600);
					telaEditar.getContentPane().setBackground(Color.WHITE);
					telaEditar.setResizable(false);
					telaEditar.setLocationRelativeTo(null);
					telaEditar.setVisible(true);

					telaEditar.add(lbEditar);
					lbEditar.setBounds(380, -220, 600, 600);
					lbEditar.setFont(new Font(ARIAL, Font.BOLD, 30));
					lbEditar.setVisible(true);

				} else {

					JOptionPane.showMessageDialog(null, "Selecione a linha que deseja editar");

				}

			}
		});

	}

	static void componentesEditar() {

		telaEditar.add(lbCodigo);
		lbCodigo.setVisible(true);
		lbCodigo.setBounds(50, 150, 200, 50);
		lbCodigo.setFont(new Font(ARIAL, Font.PLAIN, 15));

		int selectLinha = tableConsultas.getSelectedRow();
		int posMatriz = (int) tableConsultas.getModel().getValueAt(selectLinha, 0);

		telaEditar.add(lbImprimirCodigo);
		lbImprimirCodigo.setVisible(true);
		lbImprimirCodigo.setBounds(110, 150, 200, 50);
		lbImprimirCodigo.setText(String.valueOf(posMatriz));
		lbImprimirCodigo.setFont(new Font(ARIAL, Font.BOLD, 15));

		telaEditar.add(lbNome);
		lbNome.setVisible(true);
		lbNome.setBounds(140, 150, 200, 50);
		lbNome.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaEditar.add(textNome);
		textNome.setVisible(true);
		textNome.setBounds(190, 160, 555, 30);

		telaEditar.add(lbEndereco);
		lbEndereco.setVisible(true);
		lbEndereco.setBounds(50, 250, 200, 50);
		lbEndereco.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaEditar.add(textEndereco);
		textEndereco.setVisible(true);
		textEndereco.setBounds(125, 260, 620, 30);

		telaEditar.add(lbCpf);
		lbCpf.setVisible(true);
		lbCpf.setBounds(50, 350, 200, 50);
		lbCpf.setFont(new Font(ARIAL, Font.PLAIN, 15));

		telaEditar.add(textCpf);
		textCpf.setVisible(true);
		textCpf.setBounds(90, 360, 655, 30);

		telaEditar.add(botaoSalvarEdicao);
		botaoSalvarEdicao.setVisible(true);
		botaoSalvarEdicao.setToolTipText("Clique para confirmar a edição");
		botaoSalvarEdicao.setBounds(300, 420, 200, 50);

	}

	static void acaoEditar() {

		botaoSalvarEdicao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (textNome.getText().trim().isEmpty() || textEndereco.getText().trim().isEmpty()
						|| textCpf.getText().trim().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Preencha os campos!");
					componentesEditar();

				} else {

					int deseja = JOptionPane.showConfirmDialog(null, "Deseja salvar a alteração?");
					if (deseja == JOptionPane.YES_OPTION) {

						int selectLinha = tableConsultas.getSelectedRow();
						int posMatriz = (int) tableConsultas.getModel().getValueAt(selectLinha, 0);

						((DefaultTableModel) tableConsultas.getModel()).setValueAt(textNome.getText(),
								tableConsultas.getSelectedRow(), 1);
						((DefaultTableModel) tableConsultas.getModel()).setValueAt(textEndereco.getText(),
								tableConsultas.getSelectedRow(), 2);
						((DefaultTableModel) tableConsultas.getModel()).setValueAt(textCpf.getText(),
								tableConsultas.getSelectedRow(), 3);

						posicao[posMatriz - 1][0] = textNome.getText();
						posicao[posMatriz - 1][1] = textEndereco.getText();
						posicao[posMatriz - 1][2] = textCpf.getText();

						telaEditar.dispose();

					} else if (deseja == JOptionPane.CANCEL_OPTION) {

						janelaEditar();

					} else {

						telaEditar.dispose();

					}

					textNome.setText(null);
					textEndereco.setText(null);
					textCpf.setText(null);
				}
			}
		});

	}

	static void janelaExcluir() {

		botaoExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (tableConsultas.getSelectedRow() != -1) {

					int deseja = JOptionPane.showConfirmDialog(null, "Deseja deixar o usuário inativo?");

					if (deseja == JOptionPane.YES_OPTION) {

						((DefaultTableModel) tableConsultas.getModel()).setValueAt(INATIVO,
								tableConsultas.getSelectedRow(), 1);
						((DefaultTableModel) tableConsultas.getModel()).setValueAt(INATIVO,
								tableConsultas.getSelectedRow(), 2);
						((DefaultTableModel) tableConsultas.getModel()).setValueAt(INATIVO,
								tableConsultas.getSelectedRow(), 3);

						componentesExcluir();

					}

				} else {

					JOptionPane.showMessageDialog(null, "Selecione a linha que deseja inativar");

				}

			}
		});

	}

	static void componentesExcluir() {

		int selectLinha = tableConsultas.getSelectedRow();
		int posMatriz = (int) tableConsultas.getModel().getValueAt(selectLinha, 0);

		String valorNome = (String) tableConsultas.getModel().getValueAt(selectLinha, 1);
		String valorEnd = (String) tableConsultas.getModel().getValueAt(selectLinha, 2);
		String valorCPF = (String) tableConsultas.getModel().getValueAt(selectLinha, 3);

		posicao[posMatriz - 1][0] = valorNome;
		posicao[posMatriz - 1][1] = valorEnd;
		posicao[posMatriz - 1][2] = valorCPF;

	}

	static void acaoSair() {

		botaoSair.setVisible(true);
		botaoSair.setToolTipText("Clique para fechar o programa");
		botaoSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int desejo = JOptionPane.showConfirmDialog(null,
						"Todos os registros serão perdidos, deseja fechar o programa?");
				if (desejo == JOptionPane.YES_OPTION) {
					telaMenu.dispose();
				}

			}
		});

	}

	static void acaoVoltarMenu() {

		botaoVoltarMenu.setVisible(true);
		botaoVoltarMenu.setToolTipText("Clique para voltar ao menu");

		botaoVoltarMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaEditar.dispose();
				telaCadastro.dispose();
				janelaMenu();

			}
		});

	}

}
