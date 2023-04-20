package bichinhovirtual;

public class BichinhoVirtual {
	private String nome;
	private int idade;
	private int fome;
	private int energia;
	private boolean vivo;

	public BichinhoVirtual(String nome) {
		this.nome = nome;
		this.idade = 0;
		this.fome = 0;
		this.energia = 100;
		this.setVivo(true);
		System.out.println("Um novo bichinho virtual nasceu! Seu nome é " + this.nome + ".");
		System.out.println("Use as opções abaixo para cuidar dele:");
	}
	
	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public void imprimirEstado() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Idade: " + this.idade + " dias");
		System.out.println("Fome: " + this.fome + " pontos");
		System.out.println("Energia: " + this.energia + " pontos");
	}

	public void comer() {
		if (this.isVivo()) {
			if (this.fome > 0) {
				this.fome = this.fome - 10;
				if (this.fome < 0) {
					this.fome = 0;
				}
				this.energia = this.energia + 10;
				if (this.energia > 100) {
					this.energia = 100;
				}
				System.out.println(this.nome + " comeu e recuperou energia.");
				imprimirEstado();
			} else {
				System.out.println(this.nome + " não está com fome.");
			}
		} else {
			System.out.println(this.nome + " não pode comer porque já morreu.");
		}
	}

	public void correr() {
		if (this.isVivo()) {
			if (this.energia >= 30) {
				this.energia = this.energia - 30;
				this.fome = this.fome + 20;
				if (this.fome > 100) {
					this.fome = 100;
				}
				this.idade++;
				System.out.println(this.nome + " correu e gastou energia.");
				imprimirEstado();
			} else {
				System.out.println(this.nome + " não tem energia suficiente para correr.");
			}
		} else {
			System.out.println(this.nome + " não pode correr porque já morreu.");
		}
	}

	public void dormir() {
		if (this.isVivo()) {
			this.energia = this.energia + 30;
			if (this.energia > 100) {
				this.energia = 100;
			}
			System.out.println(this.nome + " dormiu e recuperou energia.");
			imprimirEstado();
		} else {
			System.out.println(this.nome + " não pode dormir porque já morreu.");
		}
	}

	public void morrer() {
		System.out.println(this.nome + " morreu.");
		this.setVivo(false);
	}

}
