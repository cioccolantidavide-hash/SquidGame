import java.util.ArrayList;
abstract class MiniGioco
{
	String nomeGioco;
	String difficolta;
	int punteggio;
	ArrayList<Partecipante> listaPartecipanti = new ArrayList<>();
	abstract void consumaEnergia();
	abstract void assegnaPunteggio();
	String getNomeGioco()
	{
		return this.nomeGioco;
	}
	int getPunteggio()
	{
		return punteggio;
	}
	Partecipante getPartecipante(String nome)
	{
		Partecipante temp;
		for(int i=0; i<this.listaPartecipanti.size(); i++)
		{
			temp = this.listaPartecipanti.get(i);
			if(temp.equals(nome)) return listaPartecipanti.get(i);
		}
		return null;
	}
	void setNomeGioco(String nomeGioco)
	{
		this.nomeGioco = nomeGioco;
	}
	void setPunteggio(int punteggio)
	{
		this.punteggio = punteggio;
	}
	void aggiungiPartecipante(Partecipante partecipante)
	{
		this.listaPartecipanti.add(partecipante);
	}


}


