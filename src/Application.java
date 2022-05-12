
public class Application {

	public static void main(String[] args) {

		// 6.1.1
		System.out.println("Aufgabe 6.1.1");
		System.out.println();
		
		Radio radio_1 = new Radio();
		radio_1.setIsOn(true);
		radio_1.setVolume(10);
		
		System.out.println("Radio Status: " + radio_1.getIsOn());
		System.out.println("Radio Lautstärke: " + radio_1.getVolume());
		System.out.println();
		
		// 6.1.2
		System.out.println("Aufgabe 6.1.2");
		System.out.println();
		
		// Test volumeUp()
		radio_1.setVolume(95); 
		for (int i = 0; i <= 10; i++) {
			radio_1.volumeUp();
			System.out.println("Radio Lautstärke: " + radio_1.getVolume());
		}
		
		// Test volumeDown()
		radio_1.setVolume(5); 
		for (int i = 0; i <= 10; i++) {
			radio_1.volumeDown();
			System.out.println("Radio Lautstärke: " + radio_1.getVolume());
		}
		
		//Test on()
		radio_1.getIsOn(); 
		System.out.println("Radio Status: " + radio_1.getIsOn());
		radio_1.on();
		System.out.println("Radio Status: " + radio_1.getIsOn());
		
		//Test off()
		radio_1.off();
		System.out.println("Radio Status: " + radio_1.getIsOn());
		System.out.println("Radio Status: " + radio_1.isOn());
		
		//Test toString()
		System.out.println(radio_1.toString());
		System.out.println();
		
		// 6.1.3 with frequency
		System.out.println("Aufgabe 6.1.3");
		System.out.println();
		
		System.out.println(radio_1.toString());
		System.out.println();
		
		// 6.2.1
		System.out.println("Aufgabe 6.2.1");
		System.out.println();
		
		System.out.println(Radio.stationNameToFrequency("GrandmaRadio"));
		System.out.println(Radio.stationNameToFrequency(null));
		System.out.println(Radio.stationNameToFrequency("hdjshdjs"));
		
		// 6.4.1
		System.out.println("Aufgabe 6.4.1");
		System.out.println();
		
		Radio radio_2 = new Radio();
		Radio radio_3 = new Radio(102.0);
		Radio radio_4 = new Radio("Radio Sender");
		
		System.out.println(radio_2.toString());
		System.out.println(radio_3.toString());
		System.out.println(radio_4.toString());
	}

}
