import org.joda.time.LocalTime;
import org.joda.time.DateTime;
public class HelloWorld{
	public static void main(String[] args){
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: "+currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		Bissexto bissexto = new Bissexto();
        DiasDepois dias = new DiasDepois();
        dias.trintaDiasDepois(new DateTime());
		bissexto.anoBissexto(2020);
	}
}

