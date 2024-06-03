import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			URLConnection conn = new URL("https://m.daum.net").openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			while( (line = br.readLine() ) != null) {
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
			if (br != null) try { br.close(); } catch(IOException e) {}
		}

	}

}
