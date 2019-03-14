import org.joda.time.LocalTime; 
import org.joda.time.DateTime;

class HelloWorld { 
    public static void main(String[] args) { 
        LocalTime currentTime = new LocalTime(); 
        System.out.println("The current local time is: " + currentTime); 
        Greeter greeter = new Greeter(); 
        System.out.println(greeter.sayHello()); 
        DateTime dt = new DateTime();
        DiasDepois dias = new DiasDepois();
        dias.trintaDiasDepois(dt);
    } 
} 