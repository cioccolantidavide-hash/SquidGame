public class Partecipante
{
	private int nome;
	private  int  energia;
	private int punteggioIniziale;

	/*public Partecipante(int nome, int energia, int punteggioIniziale)
	{
		this.nome = nome;
		this.energia = energia;
		this.punteggioIniziale = punteggioIniziale;
	}*/
	public void aggiungiPunteggio(int punteggioGuadagnato)
	{
		this.punteggioIniziale = this.punteggioIniziale + punteggioGuadagnato;
	}
	public void sottraiEnergia()
	{
		this.energia= this.energia - 10;
	}
	public void setNome(int nome)
	{
		this.nome = nome;		
	}
	public int getNome()
	{
		return this.nome;
	}
	public void setEnergia(int energia)
	{
		this.energia = energia;		
	}
	public double getEnergia()
	{
		return this.energia;
	}
	public void setPunteggioIniziale(int punteggioIniziale)
	{
		this.punteggioIniziale = punteggioIniziale;		
	}
	public int getPunteggioIniziale()
	{
		return this.punteggioIniziale;
	}
	
}
