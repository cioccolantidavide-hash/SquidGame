public class Squadra
{
	private String nome;
	private int dimensioneSquadra;
	private Partecipante[] listaPartecipanti = new Partecipante[dimensioneSquadra];
	private int contatorePartecipanti = 0;
	public Squadra(String nome, int dimensioneSquadra)
	{
		this.nome = nome;
		this.dimensioneSquadra = dimensioneSquadra;
	}
	public void aggiungiPartecipante(Partecipante partecipante)
	{
		if(contatorePartecipanti < dimensioneSquadra)
		{
			System.out.println("ERRORE squadra piena");
			return;
		}
		this.listaPartecipanti[contatorePartecipanti] = partecipante;
		this.contatorePartecipanti++;
	}
	public Partecipante getPartecipante(int indicePartecipante)
	{
		return this.listaPartecipanti[indicePartecipante]; 
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
