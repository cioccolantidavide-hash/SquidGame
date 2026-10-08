public class Marbles extends MiniGioco
{
	String nomeGioco = "Marbles";

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

