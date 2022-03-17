package chap08.book.exercise.p080303;

import chap08.book.exercise.p080201.RemoteControl;

public class SmartTelevision implements RemoteControl,Searchable{

	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
		
	}
	 
	 @Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
}
