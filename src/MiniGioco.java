abstract class MiniGioco
{
	String nomeGioco;
	String difficolta;
	int punteggio;
	int numeroPartecipanti;
	Partecipante[] listaPartecipanti = new Partecipante[numeroPartecipanti];
	abstract void assegnaPunti();
	abstract void consumaEnergia();
}


