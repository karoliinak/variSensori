package variSensori;
import lejos.nxt.*;

public class variSensori {
	
	public static void main(String[] args) {
		int mustaVari;
		int valkoinenVari;
		int viivaVari;
		
		
		ColorSensor sensori = new ColorSensor(SensorPort.S4);
		sensori.setFloodlight(true);
		
		// Tallennetaan mustan arvo muuttujaan
		System.out.println("Lue musta");
		Button.waitForAnyPress();
		mustaVari = sensori.getLightValue();
		Button.waitForAnyPress();
		
		// Tallennetaan valkoisen arvo muuttujaan
		System.out.println("Lue valkoinen");
		Button.waitForAnyPress();
		valkoinenVari = sensori.getLightValue();
		Button.waitForAnyPress(); 
		
		// Tallennetaan viivan arvo muuttujaan 
		System.out.println("Lue viiva");
		Button.waitForAnyPress();
		viivaVari = sensori.getLightValue();
		Button.waitForAnyPress();
		
		
		//Tulostetaan n�yt�lle arvot
		System.out.println("Musta on " + mustaVari + ", valkoinen on " + valkoinenVari + " ja viiva on " + viivaVari);
		Button.waitForAnyPress();
		
		while(!Button.ESCAPE.isDown()){
			
			System.out.println(sensori.getLightValue());
			
			/*
			 * 
			 * 
			if (sensori.getLightValue() < mustaVari){
				// K��nny oikealle			
			} else if (sensori.getLightValue() > valkoinenVari){
				// K��nny vasemmalle
			}else {
				// Mene suoraan t�ysi� jihuu
			}
			*/
			
		}
	}
}
