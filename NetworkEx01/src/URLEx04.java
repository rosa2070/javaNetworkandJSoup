import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
//		InputStreamReader isr = null;
//		InputStream is = null;

		try {
			URL url = new URL("https://m.daum.net");
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
//			int data = 0;
//			while((data = br.read())!= -1) {
//				System.out.print((char)data);
//			}
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if (br != null) try {br.close();} catch (IOException e) {}
		}

	}

}
