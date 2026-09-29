public class Marbles extends MiniGioco
{
	String nomeGioco = "Marbles";
	public Marbles(String difficolta, int punteggio, int numeroPartecipanti)
	{
		this.difficolta = difficolta;
		this.punteggio = punteggio;
		this.numeroPartecipanti = numeroPartecipanti;
	}
	@Override
	void assegnaPunteggio()
	{
		for(int i=0; i<numeroPartecipanti; i++)
		{
			listaPartecipanti[i].aggiungiPunteggio(punteggio);
		}
	}
	@Override
	void consumaEnergia()
	{
		for(int i=0; i<numeroPartecipanti; i++)
		{
			listaPartecipanti[i].sottraiEnergia();
		}
	}

}

