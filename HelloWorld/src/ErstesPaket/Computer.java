package ErstesPaket;

public class Computer {
	String typ;
	String prozessor;
	String grafikkarte;
	int arbeitsspeicher;
	float preis;
	
	Computer(String derTyp, String derProzessor, String dieGrafikkarte, int derArbeitsspeicher, float derPreis) {
		typ = derTyp;
		prozessor = derProzessor;
		grafikkarte = dieGrafikkarte;
		arbeitsspeicher = derArbeitsspeicher;
		preis = derPreis;
	}
	
	void datenblatt() {
		System.out.println("Typ: " + typ);
		System.out.println("Prozessor: " + prozessor);
		System.out.println("Grafikkarte: " + grafikkarte);
		System.out.println("RAM: " + arbeitsspeicher +"GB DDR4-RAM");
		System.out.println("Preis: " + preis +" EUR");
	}
}
