import java.util.ArrayList;
public class Squadra
{
	private String nome;
	private ArrayList<Partecipante> listaPartecipanti = new ArrayList<Partecipante>();
	public int totalePunteggio()
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
	public Partecipante getPartecipante(String nome)
	{
		for(int i=0; i<listaPartecipanti.size();i++)
		{
			if(listaPartecipanti.get(i).getNome().equals(nome)) return listaPartecipanti.get(i);
		}
		return null;
	}
	public void getTuttiNomiPartecipan()
	{
		int dimensione = listaPartecipanti.size();
		for(int i=0; i<dimensione; i++)
		{
			System.out.print(listaPartecipanti.get(i).getNome());
			if(i<dimensione-1) System.out.print(",");
		}
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
 
