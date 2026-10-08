import java.util.ArrayList;
public class Dalgona extends MiniGioco
{
	String nomeGioco = "Dalgona";
/*	public Dalgona(String difficolta, int punteggio, ArrayList<Partecipante> listaPartecipanti)
	{
		this.difficolta = difficolta;
		this.punteggio = punteggio;
		this.listaPartecipanti = listaPartecipanti;
	}
*/	
	public Dalgona()
	{
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


