import java.io.File;
interface GestoreGiochi
{

	void caricaGiochi(File file);
	void registraPartecipanti(File file);
	int[] ottieniRisultati();
}
