public class BlindFoldRun extends MiniGioco
{
	String nomeGioco = "BlindFoldRun";

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

