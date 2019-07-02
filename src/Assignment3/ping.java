package Assignment3;
import java.net.InetAddress;
import java.util.*;
public class ping {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner((System.in));
        String ipAddress=sc.next();
        InetAddress inetAddress=InetAddress.getByName(ipAddress);
        long finish=0;
        long start=new GregorianCalendar().getTimeInMillis();
        if(inetAddress.isReachable(5000)){
            finish=new GregorianCalendar().getTimeInMillis();
            System.out.println("Host is Reachable");
            System.out.println("time taken  "+(finish-start)+" ms");
        }
        else
            System.out.println("host not reachable");

    }
}
