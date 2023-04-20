package bichinhovirtual;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		BichinhoVirtual bob = new BichinhoVirtual("Bob");

		if (bob.isVivo()) {

			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"Menu:\n" + " 1 - Comer\n" + " 2 - Correr\n" + " 3 - Dormir\n" + " 4 - Sair do programa\n");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				bob.comer();
				break;
			case 2:
				bob.correr();
				break;
			case 3:
				bob.dormir();
				break;
			case 4:
				bob.morrer();
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
			}
			scanner.close();

		} else {
		       System.out.println("\nO programa foi encerrado.");
		}

	}
}
