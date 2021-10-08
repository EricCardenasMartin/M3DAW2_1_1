// package Compte;
public class Banc {
	Compte paco1;

	public Banc(){
		paco1 = new Compte("Paco1","Cuenta de Paco1", 300.50);

		System.out.println("Nom client: " + paco1.GetNomClient());
		System.out.println("Nom compte: " + paco1.GetNomCompte());
		System.out.println("Saldo: " + paco1.GetSaldo());

		paco1.Ingressar(400);
		System.out.println("Saldo + Ingreso: " + paco1.GetSaldo());

		paco1.Treure(200);
		System.out.println("Saldo - Quitado: " + paco1.GetSaldo());

		paco1.Invertir(paco1.GetSaldo()/2);
		System.out.println("Saldo + Invertido: " + paco1.GetSaldo());
	}
}