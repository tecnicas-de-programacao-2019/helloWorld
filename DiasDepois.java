import org.joda.time.LocalTime;
import org.joda.time.DateTime;
import org.joda.time.Period; 

class DiasDepois { 
    public static void trintaDiasDepois(DateTime time) { 
        DateTime dt = new DateTime(time);
        DateTime plusPeriod = dt.plus(Period.days(30));
        System.out.println("30 dias depois: "+plusPeriod); 
    } 
} 