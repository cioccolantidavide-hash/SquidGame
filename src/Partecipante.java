public class Partecipante
{
	private String nome;
	private  double energia;
	private int punteggioIniziale;

	public Partecipante(String nome, double energia, int punteggioIniziale)
	{
		this.nome = nome;
		this.energia = energia;
		this.punteggioIniziale = punteggioIniziale;
	}
	public void setNome(String nome)
	{
		this.nome = nome;		
	}
	public String getNome()
	{
		return this.nome;
	}
	public void setEnergia(double energia)
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
