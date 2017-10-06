import java.util.ArrayList;

//  Prova 1 LTP

// Aluno: Jefté Alves Lira de araujo
// RA: 21750454

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();

		// Questão 2a :
		System.out.println("---------------- Questão 2a ----------------");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));

		// Questão 2b :
		System.out.println("\n---------------- Questão 2b ----------------");
		ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Evandro da Silva");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}

		// Questão 2c :
		System.out.println("\n---------------- Questão 2c ----------------");
		System.out.println("ligações por UF: " + bds.ligacoesPorUF("DF"));

		// Questão 2d :
		System.out.println("\n---------------- Questão 2d ----------------");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		// -----------------------------Questões 3-----------------------------

		System.out.println("-----------------------------Questões 3-----------------------------");
		System.out.println(bds.MontaConta("Regina Maria"));
		System.out.println(bds.MontaConta("José das Couves"));
		System.out.println(bds.MontaConta("Maria do Socorro"));

	}
}
