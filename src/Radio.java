
public class Radio {

	private boolean isOn;
	private int volume;
	private double frequency;
	private static double frequency_all;

	public boolean getIsOn() {
		return isOn;
	}
	
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume > 0 & volume < 100) {
			this.volume = volume;
		} else {
			System.out.println("Die Lautstärke darf außer 0-100 nicht sein.");
		}
	}
	
	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	public void volumeUp() {
		if (volume < 100) {
			volume++;
		}
	}
	
	public void volumeDown() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public void on() {
		this.isOn = true;
		System.out.println("Radio ist an.");
	}
	
	public void off() {
		this.isOn = false;
		System.out.println("Radio ist aus.");
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public String toString() {
		String state = "Radio[volume=" + this.volume + ", " + this.isOn + ", " + this.frequency + "]";
		return state; 
	}
	
	public static double stationNameToFrequency(String s) {
		try {
			switch(s) {
			case "Walking the Plank":
				frequency_all = 98.3;
				break;
			case "GrandmaRadio": 
				frequency_all = 95.6;;
				break;
			case "Student and World":
				frequency_all = 85.9;
				break;
			}
			
		} catch (NullPointerException e) {
			frequency_all = 0.0;
		}
		return frequency_all;
	}
	
}
