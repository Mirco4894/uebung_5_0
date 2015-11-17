
public class Uebung_5 {

	public static void main(String[] args) {

		int w;
		int zaehler[]=new int [6];

		//zufällige Zahl zuweisen und den dazugehörigen Zähler um einen erhöhen
		for (int i = 0; i <50; i++) {
			w = Zufall.getZufallInt(0, zaehler.length-1);
			zaehler[w]++;
		}
		
		//Ausgabe der gezählten Werte pro Zahl
		for (int i = 0; i < zaehler.length; i++) {
			System.out.println("Anzahl "+(i+1)+ ": " + zaehler[i]);
		}
		
	}

}
