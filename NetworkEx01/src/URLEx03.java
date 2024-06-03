import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;

		try {
			URL url = new URL("https://m.daum.net");
			is = url.openStream();
			
			int data = 0;
			while((data = is.read())!= -1) {
				System.out.print((char)data);
			}
			
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if (is != null) try {is.close();} catch (IOException e) {}
		}

	}

}
