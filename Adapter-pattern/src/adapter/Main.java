package adapter;

import adapter.CommandLine.Option;
import adapter.CommandLine.Command;

@Command(name = "Language Adapter", description = "practicing app :)")

public class Main {
	
	@Option(names = "-Language", description = "select your language (English | Tamil)")
	private static String lang;
	
	public static void main(String[] args) {
		
		if(lang.equals("English")) {
			English e = new English();  //in our case, existing lucene app
			e.sayHi();  //in our case this's the method for indexing, searching, etc... in lucene app. we will handle these steps in the corresponding classes in our case
			e.sayHello(); // "  "  "
		}
		
		if(lang.equals("Tamil")) {
			Tamil t = new Tamil();  //Elastic search app 
			LanguageAdapter lA = new LanguageAdapter(t);
			lA.sayHi(); //in our case this's the method for indexing, searching, etc... in ES app. we will handle these steps in the corresponding classes in our case
			lA.sayHello();// "  "  "
		}
	}
}
