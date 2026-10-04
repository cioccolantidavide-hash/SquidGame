
abstract class MiniGioco
{
	String nomeGioco;
	String difficolta;
	int punteggio;
	Squadra listaPartecipanti = new Squadra();
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
	Partecipante getPartecipante(int nome)
	{
		return this.listaPartecipanti.getPartecipante(nome);
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
		this.listaPartecipanti.aggiungiPartecipante(partecipante);
	}


}


