import java.util.ArrayList;
public class Squadra
{
	private String nome;
	private ArrayList<Partecipante> listaPartecipanti = new ArrayList<Partecipante>();
/*	public Squadra(String nome, int dimensioneSquadra)
	{
		this.nome = nome;
		this.dimensioneSquadra = dimensioneSquadra;
	}
*/	public int totalePunteggio()
	{
		int totale = 0;
		for(int i=0; i<listaPartecipanti.size(); i++)
		{
			totale = totale + listaPartecipanti.get(i).getPunteggioIniziale();
		}
		return totale;
	}
	public void aggiungiPartecipante(Partecipante partecipante)
	{
		this.listaPartecipanti.add(partecipante);
	}
	public Partecipante getPartecipante(int nome)
	{
		for(int i=0; i<listaPartecipanti.size();i++)
		{
			if(listaPartecipanti.get(i).getNome() == nome) return listaPartecipanti.get(i);
		}
		return null;
	}
	public int[] getTuttiNomiPartecipanti()
	{
		int dimensione = listaPartecipanti.size();
		int[] elenco = new int[dimensione];
		for(int i=0; i<dimensione; i++)
		{
			elenco[i] = listaPartecipanti.get(i).getNome();
		}
		return elenco;
	}
	public String getNome()
	{
		return this.nome;
	}
	public int getDimensioneSquadra()
	{
		return this.listaPartecipanti.size();
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
 