package ErstesPaket;

public class Bestellung {
	public static void main(String[] args) {
		Computer gamingPC = new Computer("Gaming Hot", "4GHz", "Radeon 9800", 16, 400);
		Computer Notebook = new Computer("Mobile Best", "2GHz", "Geforce M", 8, 1299);
		Computer OfficePC = new Computer("Office PC", "1.8 GhZ", "Intel 550", 4, 449);
		
		// gamingPC.datenblatt();
		// Notebook.datenblatt();
		// OfficePC.datenblatt();
		if (gamingPC.preis > 1000) {
			gamingPC.datenblatt(); 
			} else System.out.println("Kein Gaming PC über 1000 EUR vorhanden!");
		Liste anzeigen = new Liste();
		anzeigen.liste();
		
	}
}
