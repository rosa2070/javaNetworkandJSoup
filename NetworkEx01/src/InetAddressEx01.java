import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress inetAddress1 = InetAddress.getByName("www.daum.net");
			System.out.println(inetAddress1.getHostName());
			System.out.println(inetAddress1.getHostAddress());
			
			InetAddress[] inetAddresses1 = InetAddress.getAllByName("www.naver.com");
			for (InetAddress inetAddress : inetAddresses1) {
				System.out.println(inetAddress.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


// C:\WINDOWS\System32>nslookup

