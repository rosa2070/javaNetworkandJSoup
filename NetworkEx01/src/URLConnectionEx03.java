import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://img2.daumcdn.net/thumb/R658x0.q70/?fname=https://t1.daumcdn.net/news/202406/03/segye/20240603143142520himg.jpg
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			URLConnection conn = new URL("https://img2.daumcdn.net/thumb/R658x0.q70/?fname=https://t1.daumcdn.net/news/202406/03/segye/20240603143142520himg.jpg").openConnection();
			
			bis = new BufferedInputStream(conn.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream("./image.jpg"));
			
			int data = 0;
			while( (data = bis.read() ) != -1) {
				bos.write(data);
			}
			System.out.println("이미지 전송 완료");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if (bos != null) try { bos.close(); } catch(IOException e) {}
			if (bis != null) try { bis.close(); } catch(IOException e) {}
		}

	}

}
