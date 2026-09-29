public class Squadra
{
	private String nome;
	private int dimensioneSquadra;
	private Partecipante[] listaPartecipanti = new Partecipante[dimensioneSquadra];
	private int indiceLista = 0;
	public Squadra(String nome, int dimensioneSquadra)
	{
		this.nome = nome;
		this.dimensioneSquadra = dimensioneSquadra;
	}
	public int totalePunteggio()
	{
		int totale = 0;
		for(int i=0; i<dimensioneSquadra; i++)
		{
			totale = totale + listaPartecipanti[i].getPunteggioIniziale();
		}
		return totale;
	}
	public void aggiungiPartecipante(Partecipante partecipante)
	{
		if(indiceLista < dimensioneSquadra)
		{
			System.out.println("ERRORE squadra piena");
			return;
		}
		this.listaPartecipanti[indiceLista] = partecipante;
		this.indiceLista++;
	}
	public Partecipante getPartecipante(int indicePartecipante)
	{
		if(indicePartecipante < dimensioneSquadra)
		return this.listaPartecipanti[indicePartecipante]; 
		else System.out.println("errore indice maggiore di dimensione squadra");
	}
	public String getNome()
	{
		return this.nome;
	}
	public int getDimensioneSquadra()
	{
		return this.dimensioneSquadra;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setDimensioneSquadra(int dimensioneSquadra)
	{
		this.dimensioneSquadra = dimensioneSquadra;
	}
}
