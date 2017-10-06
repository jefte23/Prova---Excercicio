import java.util.ArrayList;

//  Prova 1 LTP

// Aluno: Jeft� Alves Lira de araujo
// RA: 21750454

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();

		// Quest�o 2a :
		System.out.println("---------------- Quest�o 2a ----------------");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));

		// Quest�o 2b :
		System.out.println("\n---------------- Quest�o 2b ----------------");
		ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Evandro da Silva");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}

		// Quest�o 2c :
		System.out.println("\n---------------- Quest�o 2c ----------------");
		System.out.println("liga��es por UF: " + bds.ligacoesPorUF("DF"));

		// Quest�o 2d :
		System.out.println("\n---------------- Quest�o 2d ----------------");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		// -----------------------------Quest�es 3-----------------------------

		System.out.println("-----------------------------Quest�es 3-----------------------------");
		System.out.println(bds.MontaConta("Regina Maria"));
		System.out.println(bds.MontaConta("Jos� das Couves"));
		System.out.println(bds.MontaConta("Maria do Socorro"));

	}
}
