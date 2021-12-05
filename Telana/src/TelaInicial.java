import javax.swing.JFrame;

public class TelaInicial extends JFrame {

	public TelaInicial() {

		setTitle("Titulo da Janela");
		setSize(500, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {

		new TelaInicial();

	}

}
