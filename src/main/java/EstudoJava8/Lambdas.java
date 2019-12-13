package EstudoJava8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class Lambdas {
	public static void main(String[] args) {
		
		// As interfaces funcionais são aquelas com somente um método, sempre um método
				// abstrato, quando se chama um lambda para
				// essas interfaces funcionais sabe-se que o que está sendo invocado é esse
				// método, afinal existem somente 1;

				JButton jButton = new JButton();
				jButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Olá Mundo!");
					}

				});

				// Como seria com lambda
				JButton jButton2 = new JButton();
				jButton2.addActionListener(e -> System.out.println("Olá Mundo!"));
				
				
				//API DE STREAM
				
				//Stream - Fluxo de dados
				List<Integer> lista = Arrays.asList(1, 2, 3, 4);
				
				System.out.println("--------------------------------------------------------");
				lista.stream()
					.filter(e -> e % 2 == 0) // Resto da divisão igual a 0 numero modulo 2
					.forEach(e -> System.out.println(e));
				
	}
}
