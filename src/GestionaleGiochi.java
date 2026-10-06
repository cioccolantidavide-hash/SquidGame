import java.io.*;
import java.util.*;
class GestionaleGiochi implements GestoreGiochi
{
	File file = new File("input.txt");
	ArrayList<Squadra> squadre = new ArrayList<Squadra>();
	ArrayList<MiniGioco> miniGiochi = new ArrayList<>();
	ArrayList<Partecipante> listaPartecipanti = new ArrayList<>();
	public void caricaGiochi(File file)
	{	
		String riga;
		String[] riganNomi, rigaDati;
		try(Scanner scanner = new Scanner(this.file))
		{
			riga = scanner.nextLine();
			while(riga.contains("###") == false)
			{
				riga = scanner.nextLine();
			}
			riga = scanner.nextLine();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file non trovato");
		}
	}
	public void registraPartecipanti(File file)
	{
		String riga;
		String[] rigaDivisa;
		String nome;
		String energia;
		String punteggio;
		try(Scanner scanner = new Scanner(this.file))
		{
			while(scanner.hasNextLine())
			{
				riga = scanner.nextLine();
				rigaDivisa = riga.split(",");
				nome = rigaDivisa[0];
				energia = rigaDivisa[1];
				punteggio = rigaDivisa[2];
				Partecipante partecipante = new Partecipante(nome,Integer.parseInt(energia),Integer.parseInt(punteggio));
				this.listaPartecipanti.add(partecipante);
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("errore lettura file");
		}
	}
	public int[] ottieniRisultati()
	{
	}
}
