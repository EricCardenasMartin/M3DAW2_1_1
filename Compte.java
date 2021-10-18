public class Compte {
	String nomClient, nomCompte;
	double saldo;

	public Compte(String tempNomClient,String tempNomCompte, double tempSaldo){
		nomClient = tempNomClient;
		nomCompte = tempNomCompte;
		saldo = tempSaldo;
	}

	public void Ingressar (double quantitat){
		saldo += quantitat;
	}

	public void Treure (double quantitat){
		saldo -= quantitat;
	}

	public void Invertir(double quantitat){
		saldo += quantitat * 0.1;
	}

	public String GetNomClient(){
		return nomClient;
	}

	public String GetNomCompte(){
		return nomCompte;
	}

	public double GetSaldo(){
		return saldo;
	}
}