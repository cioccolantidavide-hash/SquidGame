public class Main
{
	public static void main(String[] arg)
	{
		GestionaleGiochi gestionealeGiochi = new GestionaleGiochi();
		gestionealeGiochi.registraPartecipanti();
		gestionealeGiochi.caricaGiochi();
		gestionealeGiochi.ottieniRisultati();
	}
}
