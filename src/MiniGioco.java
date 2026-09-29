abstract class MiniGioco
{
	String nomeGioco;
	String difficolta;
	int punteggio;
	int numeroPartecipanti;
	int indiceLista = 0;
	Partecipante[] listaPartecipanti = new Partecipante[numeroPartecipanti];
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
	int getNumeroPartecipanti()
	{
		return numeroPartecipanti;
	}
	Partecipante getPartecipante(int indice)
	{
		return listaPartecipanti[indice];
	}
	void setNomeGioco(String nomeGioco)
	{
		this.nomeGioco = nomeGioco;
	}
	void setPunteggio(int punteggio)
	{
		this.punteggio = punteggio;
	}
	void setNumeroPartecipanti()
	{
		this.numeroPartecipanti = numeroPartecipanti;
	}
	void aggiungiPartecipante(Partecipante partecipante)
	{
		this.listaPartecipanti[indiceLista] = partecipante;
	}


}


