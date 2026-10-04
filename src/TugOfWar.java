public class TugOfWar extends MiniGioco
{
	String nomeGioco = "TugOfWar";
	public TugOfWar(String difficolta, int punteggio, int numeroPartecipanti)
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
