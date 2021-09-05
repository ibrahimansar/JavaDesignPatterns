package adapter;

public class LanguageAdapter implements Adapter{
	Tamil tamil;
	public LanguageAdapter(Tamil tamil) {
		this.tamil = tamil;
	}
	
	public void sayHi() {
		tamil.sayVanakkam();
	}
	
	public void sayHello() {
		tamil.sayNamaskaram();
	}
}
