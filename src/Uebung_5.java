
public class Uebung_5 {

	public static void main(String[] args) {

		int w;
		int zaehler[]=new int [6];

		//zuf�llige Zahl zuweisen und den dazugeh�rigen Z�hler um einen erh�hen
		for (int i = 0; i <50; i++) {
			w = Zufall.getZufallInt(0, zaehler.length-1);
			zaehler[w]++;
		}
		
		//Ausgabe der gez�hlten Werte pro Zahl
		for (int i = 0; i < zaehler.length; i++) {
			System.out.println("Anzahl "+(i+1)+ ": " + zaehler[i]);
		}
		
	}

}
