import java.io.*;
import java.util.*;
class GestionaleGiochi implements GestoreGiochi
{
	File file = new File("input.txt");
	ArrayList<Squadra> squadre = new ArrayList<Squadra>();
	ArrayList<MiniGioco> miniGiochi = new ArrayList<>();
	ArrayList<Partecipante> listaPartecipanti = new ArrayList<>();
	public void caricaGiochi()
	{	
		String riga;
		String rigaDivisaNomi,rigaDivisaDati;
		String[] listaNomi, listaDati;
		try(Scanner scanner = new Scanner(this.file))
		{
			riga = scanner.nextLine();
			while(riga.contains("###") == false)
			{
				riga = scanner.nextLine();
			}
			while(scanner.hasNextLine())
			{
				riga = scanner.nextLine();
				if(riga.contains("#")) return;
				rigaDivisaDati = riga.substring(0,riga.indexOf("["));
				rigaDivisaNomi = riga.substring(riga.indexOf("[")+1, riga.indexOf("]"));
				listaDati = rigaDivisaDati.split(",");
				listaNomi = rigaDivisaNomi.split(",");
				switch(listaDati[0])
				{
					case"Dalgona":
						Dalgona dalgona = new Dalgona();
						miniGiochi.add(dalgona);
						break;
					case"BlindFoldRun":
						BlindFoldRun blindFoldRun = new BlindFoldRun();
						miniGiochi.add(blindFoldRun);
						break;
					case"GlassBridge":
						GlassBridge glassBridge = new GlassBridge();
						miniGiochi.add(glassBridge);
						break;
					case"Marbles":
						Marbles marbles = new Marbles();
						miniGiochi.add(marbles);
						break;
					case"TugOfWar":
						TugOfWar tugOfWar = new TugOfWar();
						miniGiochi.add(tugOfWar);
						break;
					default:
						System.out.println("errore minigioco non esistente!");
				}
				miniGiochi.get(miniGiochi.size()-1).setDifficolta(listaDati[1]);
				miniGiochi.get(miniGiochi.size()-1).setPunteggio(Integer.parseInt(listaDati[2]));
				for(int i=0;i<listaNomi.length; i++)
				{
					for(int j=0; j<listaPartecipanti.size(); j++)
					{
						if(listaPartecipanti.get(j).getNome().equals(listaNomi[i]))
							miniGiochi.get(miniGiochi.size()-1).aggiungiPartecipante(listaPartecipanti.get(j));
					}
				}
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file non trovato");
		}
	}
	public void registraSquadre()
	{
		String riga;
		String rigaDivisaPartecipanti;
		String nome;
		try(Scanner scanner = new Scanner(this.file))
		{
			riga = scanner.nextLine();
			while(riga.contains("###") == false)
			{
				riga = scanner.nextLine();
			}
			riga = scanner.nextLine();
			while(riga.contains("###") == false)
			{
				riga = scanner.nextLine();
			}
			while(scanner.hasNextLine())
			{
				riga = scanner.nextLine();
				if(riga.contains("#")) return; 
				nome = riga.substring(0,riga.indexOf(",")).trim();
				rigaDivisaPartecipanti = riga.substring(riga.indexOf("[")+1, riga.indexOf("]"));
				
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("errore lettura file");
		}
	}

	public void registraPartecipanti()
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
				if(riga.contains("#")) return; 
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
	public void  ottieniRisultati()
	{
		//task1
		for(int i=0; i<listaPartecipanti.size(); i++)
		{
			listaPartecipanti.get(i).aggiungiEnergia(50);
		}
		for(int i=0; i<miniGiochi.size(); i++)
		{
			miniGiochi.get(i).assegnaPunteggio();
			miniGiochi.get(i).consumaEnergia();
		}
		for(int i=0; i<listaPartecipanti.size(); i++)
		{
			System.out.println(listaPartecipanti.get(i).getNome() + "," + listaPartecipanti.get(i).getEnergia() +","+ listaPartecipanti.get(i).getPunteggioIniziale());
		}
		System.out.println("###");
		//task2
		for(int i=0; i<miniGiochi.size(); i++)
		{
			System.out.print(miniGiochi.get(i).getNomeGioco());
			miniGiochi.get(i).getStatistichePartecipanti();
			System.out.println("");
		}
		//task3
		for(int i=0; i<squadre.size(); i++)
		{
			System.out.print(squadre.get(i).getNome() +":");
			System.out.print(squadre.get(i).totalePunteggio() +",");
			System.out.print("Partecipanti:[");
			squadre.get(i).getTuttiNomiPartecipan();
			System.out.print("]");

		}
	}
}
