public class BlindFoldRun extends MiniGioco
{
	String nomeGioco = "BlindFoldRun";
	public BlindFoldRun(String difficolta, int punteggio, int numeroPartecipanti)
	{
		this.difficolta = difficolta;
		this.punteggio = punteggio;
	}
	@Override
	void assegnaPunteggio()
	{
		int elenco[] = listaPartecipanti.getTuttiNomiPartecipanti();
		for(int i=0; i<listaPartecipanti.getDimensioneSquadra(); i++)
		{
			this.listaPartecipanti.getPartecipante(elenco[i]).aggiungiPunteggio(punteggio);
		}
	}
	@Override
	void consumaEnergia()
	{
		int elenco[] = listaPartecipanti.getTuttiNomiPartecipanti();
		for(int i=0; i<listaPartecipanti.getDimensioneSquadra(); i++)
		{
			this.listaPartecipanti.getPartecipante(elenco[i]).sottraiEnergia();
		}
	}

}

