import java.io.*;
import java.util.*;
class GestionaleGiochi implements GestoreGiochi
{
	File file = new File("input.txt");
	ArrayList<Squadra> squadre = new ArrayList<Squadra>();
	ArrayList<MiniGioco> miniGiochi = new ArrayList<>();
	public void caricaGiochi(File file)
	{	
		String riga;
		try(Scanner scanner = new Scanner(this.file))
		{
			riga = scanner.nextLine();
			while(riga.contains("###") == false)
			{
				riga = scanner.nextLine();
			}
			while(riga.contains("###") == false)
			{
				int cursoreSinistra,cursoreDestra;
				riga = scanner.nextLine();
				cursoreDestra = riga.indexOf(',');
				String nome = riga.substring(0,cursoreDestra);
				cursoreSinistra = cursoreDestra;
				cursoreDestra = riga.indexOf(',', cursoreSinistra+1);
				String difficolta = riga.substring(cursoreSinistra, cursoreDestra);
				cursoreSinistra = cursoreDestra;
				cursoreDestra = riga.indexOf(',', cursoreSinistra+1);
				String puntggioMax = riga.substring(cursoreSinistra, cursoreDestra);
				cursoreSinistra = riga.indexOf('[');
				cursoreDestra = riga.indexOf(',', cursoreSinistra);
				Squadra partecipantiSquadra = new Squadra();
				Partecipante partecipante = new Partecipante();
				while(riga.indexOf(',', cursoreSinistra) != -1)
				{
					
				}
				switch(nome)
				{
					case ("Daltona"):
						Dalgona dalgona = new Dalgona();
				}
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
		String nome;
		String energia;
		String punteggio;
		int cursoreSinistra;
		int cursoreDestra;
		try(Scanner scanner = new Scanner(this.file))
		{
			while(scanner.hasNextLine())
			{
				riga = scanner.nextLine();
				if(riga.contains("###")) break;
				cursoreDestra =  riga.indexOf(',');
				nome = riga.substring(0, cursoreDestra);
				cursoreSinistra = cursoreDestra;
				cursoreDestra = riga.indexOf(',',cursoreSinistra+1);
				energia = riga.substring(cursoreSinistra, cursoreDestra );
				cursoreSinistra = cursoreDestra;
				punteggio = riga.substring(cursoreSinistra);
				Partecipante partecipante = new Partecipante();
				partecipante.setNome(Integer.parseInt(nome));
				partecipante.setEnergia(Integer.parseInt(energia));
				partecipante.setPunteggioIniziale(Integer.parseInt(punteggio));
				this.partecipanti.aggiungiPartecipante(partecipante);
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
