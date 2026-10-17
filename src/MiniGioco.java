import java.util.ArrayList;
abstract class MiniGioco
{
	String nomeGioco;
	String difficolta;
	int punteggio;
	ArrayList<Partecipante> listaPartecipanti = new ArrayList<>();
	abstract void consumaEnergia();
	abstract void assegnaPunteggio();
	void getStatistichePartecipanti()
	{
		System.out.print("[");
		for(int i=0; i<listaPartecipanti.size(); i++)
		{
			System.out.print(listaPartecipanti.get(i).getNome() +":"+ this.punteggio);
			if(i<listaPartecipanti.size()-1) System.out.print(", ");
		}
		System.out.print("]");
	}
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
			if(temp.getNome().equals(nome)) return listaPartecipanti.get(i);
		}
		return null;
	}
	int getDimensioneListaPartecipanti()
	{
		return this.listaPartecipanti.size();
	}
	String getDifficolta()
	{
		return this.difficolta;
	}
	void setNomeGioco(String nomeGioco)
	{
		this.nomeGioco = nomeGioco;
	}
	void setPunteggio(int punteggio)
	{
		this.punteggio = punteggio;
	}
	void setDifficolta(String difficolta)
	{
		this.difficolta = difficolta;
	}
	void aggiungiPartecipante(Partecipante partecipante)
	{
		this.listaPartecipanti.add(partecipante);
	}
	

}


