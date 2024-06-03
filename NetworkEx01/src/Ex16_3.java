import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex16_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "http://www.codechobo.com/sample/hello.html";
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println(conn);
			System.out.println(conn.getAllowUserInteraction());
			System.out.println(conn.getConnectTimeout());
			System.out.println(conn.getContent());
			System.out.println(conn.getContentEncoding());
			System.out.println(conn.getContentLength());
			System.out.println(conn.getContentType());
			System.out.println(conn.getDate());
			System.out.println(conn.getDefaultAllowUserInteraction());
			System.out.println(conn.getDefaultUseCaches());
			System.out.println(conn.getDoInput());
			System.out.println(conn.getDoOutput());
			System.out.println(conn.getExpiration());
			System.out.println(conn.getHeaderFields());
			System.out.println(conn.getIfModifiedSince());
			System.out.println(conn.getLastModified());
			System.out.println(conn.getReadTimeout());
			System.out.println(conn.getURL());
			System.out.println(conn.getUseCaches());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
