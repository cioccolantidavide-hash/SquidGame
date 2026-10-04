public class GlassBridge extends MiniGioco
{
	String nomeGioco = "GlassBridge";
	public GlassBridge(String difficolta, int punteggio, int numeroPartecipanti)
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
