package Assignments.Assignment14.Q5;

public class TV {
	
	int channel=1;
	int volumeLevel=1;
	boolean on = false;
	String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	
	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if(on && channel<130) {
			channel++;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		
	}
	
	public void channelDown() {
		if(on && channel>0) {
			channel--;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		
	}
	
	public void volumeUp() {
		if(on && volumeLevel<8) {
			volumeLevel++;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		
	}
	
	public void volumeDown() {
		if(on && volumeLevel>0) {
			volumeLevel--;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	
	public void isOn() {
		if(on) {
			System.out.println("TV is already ON");
		}else {
			System.out.println("TV is already OFF");
		}
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
}
