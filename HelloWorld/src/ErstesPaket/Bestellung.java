package ErstesPaket;

public class Bestellung {
	public static void main(String[] args) {
		Computer gamingPC = new Computer("Gaming Hot", "4GHz", "Radeon 9800", 16, 1400);
		Computer Notebook = new Computer("Mobile Best", "2GHz", "Geforce M", 8, 1299);
		Computer OfficePC = new Computer("Office PC", "1.8 GhZ", "Intel 550", 4, 449);
		
		gamingPC.datenblatt();
		Notebook.datenblatt();
		OfficePC.datenblatt();
		
		gamingPC.prozessor = "8GHz";
		gamingPC.datenblatt();
		
	}
}
