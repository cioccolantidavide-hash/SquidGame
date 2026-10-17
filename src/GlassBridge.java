public class GlassBridge extends MiniGioco
{
	public GlassBridge()
	{
		this.nomeGioco = "GlassBridge";
	}
	@Override
	void assegnaPunteggio()
	{
		for(int i=0; i<this.listaPartecipanti.size(); i++)
		{
			this.listaPartecipanti.get(i).aggiungiPunteggio(this.punteggio);
		}
	}
	@Override
	void consumaEnergia()
	{
		for(int i=0; i<this.listaPartecipanti.size(); i++)
		{
			this.listaPartecipanti.get(i).sottraiEnergia();
		}

	}


}
