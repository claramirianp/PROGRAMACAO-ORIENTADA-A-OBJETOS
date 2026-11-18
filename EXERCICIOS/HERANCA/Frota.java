import java.util.Scanner;

public class Frota {

	private static Carro[] carros = new Carro[10];
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		do {
			System.out.println("\n===== FROTA =====");
			System.out.println("1 - Incluir carro");
			System.out.println("2 - Excluir carro");
			System.out.println("3 - Alterar carro");
			System.out.println("4 - Mostrar autonomia dos carros");
			System.out.println("5 - Mostrar volume do bagageiro (hatchs)");
			System.out.println("6 - Listar carros");
			System.out.println("0 - Sair");
			opcao = lerInt("Opção: ");

			switch (opcao) {
				case 1: incluir(); break;
				case 2: excluir(); break;
				case 3: alterar(); break;
				case 4: mostrarAutonomias(); break;
				case 5: mostrarVolumes(); break;
				case 6: listar(); break;
				case 0: System.out.println("Encerrando..."); break;
				default: System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
	}

	// ---------- Operações do menu ----------

	private static void incluir() {
		int pos = -1;
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] == null) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			System.out.println("Frota cheia (10 carros).");
			return;
		}

		System.out.println("Tipo: 1 - Carro | 2 - Hatch | 3 - Pickup");
		int tipo = lerInt("Tipo: ");
		if (tipo < 1 || tipo > 3) {
			System.out.println("Tipo inválido.");
			return;
		}

		int passageiros = lerInt("Passageiros: ");
		int combustivel = lerInt("Combustível (litros): ");
		float rendimento = lerFloat("Rendimento (km/l): ");
		boolean automatico = lerSimNao("Câmbio automático?");

		if (tipo == 1) {
			carros[pos] = new Carro(passageiros, combustivel, rendimento, automatico);
		} else if (tipo == 2) {
			int bagageiro = lerInt("Volume do bagageiro (litros): ");
			carros[pos] = new Hatch(passageiros, combustivel, rendimento, automatico, bagageiro);
		} else {
			int capacidade = lerInt("Capacidade de carga (kg): ");
			int peso = lerInt("Peso da carga atual (kg): ");
			Pickup p = new Pickup(passageiros, combustivel, rendimento, automatico, capacidade, 0);
			if (!p.setPesoCarga(peso)) {
				System.out.println("Carga inválida (maior que a capacidade). Carga definida como 0.");
			}
			carros[pos] = p;
		}
		System.out.println("Carro incluído na posição " + (pos + 1) + ".");
	}

	private static void excluir() {
		int idx = lerPosicao();
		if (idx == -1) {
			return;
		}
		carros[idx] = null;
		System.out.println("Carro da posição " + (idx + 1) + " excluído.");
	}

	private static void alterar() {
		int idx = lerPosicao();
		if (idx == -1) {
			return;
		}
		Carro c = carros[idx];

		c.setPassageiros(lerInt("Passageiros: "));
		c.setCombustivel(lerInt("Combustível (litros): "));
		c.setRendimento(lerFloat("Rendimento (km/l): "));
		c.setCambioAutomatico(lerSimNao("Câmbio automático?"));

		// Casting para alterar os dados específicos de cada subclasse
		if (c instanceof Hatch) {
			Hatch h = (Hatch) c;
			h.setBagageiro(lerInt("Volume do bagageiro (litros): "));
		} else if (c instanceof Pickup) {
			Pickup p = (Pickup) c;
			p.setPesoCarga(0); // zera a carga para poder redefinir a capacidade
			p.setCapacidadeCarga(lerInt("Capacidade de carga (kg): "));
			int peso = lerInt("Peso da carga atual (kg): ");
			if (!p.setPesoCarga(peso)) {
				System.out.println("Carga inválida (maior que a capacidade). Carga definida como 0.");
			}
		}
		System.out.println("Carro alterado.");
	}

	private static void mostrarAutonomias() {
		boolean achou = false;
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] != null) {
				System.out.printf("%d - %s: autonomia = %.2f km%n",
						i + 1, tipoDoCarro(carros[i]), carros[i].autonomia());
				achou = true;
			}
		}
		if (!achou) {
			System.out.println("Nenhum carro cadastrado.");
		}
	}

	private static void mostrarVolumes() {
		boolean achou = false;
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] instanceof Hatch) {
				Hatch h = (Hatch) carros[i]; // casting
				System.out.printf("%d - Hatch: volume do bagageiro = %.2f litros%n",
						i + 1, h.calculaVolume());
				achou = true;
			}
		}
		if (!achou) {
			System.out.println("Nenhum hatch cadastrado.");
		}
	}

	private static void listar() {
		boolean achou = false;
		for (int i = 0; i < carros.length; i++) {
			Carro c = carros[i];
			if (c == null) {
				continue;
			}
			achou = true;
			System.out.printf("%d - [%s] passageiros: %d | combustível: %d L | rendimento: %.2f km/l | automático: %s",
					i + 1, tipoDoCarro(c), c.getPassageiros(), c.getCombustivel(),
					c.getRendimento(), c.isCambioAutomatico() ? "sim" : "não");
			if (c instanceof Hatch) {
				System.out.printf(" | bagageiro: %d L", ((Hatch) c).getBagageiro());
			} else if (c instanceof Pickup) {
				Pickup p = (Pickup) c;
				System.out.printf(" | capacidade: %d kg | carga: %d kg",
						p.getCapacidadeCarga(), p.getPesoCarga());
			}
			System.out.println();
		}
		if (!achou) {
			System.out.println("Nenhum carro cadastrado.");
		}
	}

	// ---------- Auxiliares ----------

	// Subclasses são testadas antes de Carro
	private static String tipoDoCarro(Carro c) {
		if (c instanceof Hatch) return "Hatch";
		if (c instanceof Pickup) return "Pickup";
		return "Carro";
	}

	// Retorna o índice do vetor (0 a 9) ou -1 se a posição for inválida/vazia
	private static int lerPosicao() {
		int pos = lerInt("Posição (1 a 10): ");
		int idx = pos - 1;
		if (idx < 0 || idx >= carros.length || carros[idx] == null) {
			System.out.println("Posição inválida ou vazia.");
			return -1;
		}
		return idx;
	}

	private static String lerTexto(String mensagem) {
		System.out.print(mensagem);
		return teclado.nextLine();
	}

	private static int lerInt(String mensagem) {
		while (true) {
			try {
				return Integer.parseInt(lerTexto(mensagem).trim());
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido, digite um número inteiro.");
			}
		}
	}

	private static float lerFloat(String mensagem) {
		while (true) {
			try {
				return Float.parseFloat(lerTexto(mensagem).trim().replace(',', '.'));
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido, digite um número.");
			}
		}
	}

	private static boolean lerSimNao(String mensagem) {
		String resposta = lerTexto(mensagem + " (s/n): ").trim().toLowerCase();
		return resposta.startsWith("s");
	}
}
