import java.net.MalformedURLException;
import java.net.URL;

public class URLEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strUrl = "http://www.codechobo.com:80/sample/hello.html?referer=codechobo#index1";
		
		try {
			URL url = new URL(strUrl);
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
