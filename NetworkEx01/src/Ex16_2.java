import java.net.URL;

public class Ex16_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://www.codechobo.com:80/sample/"
		+ "hello.html?referer=codechobo#index1");
		
		System.out.println(url.getAuthority());
		System.out.println(url.getContent());
		System.out.println(url.getDefaultPort());
		System.out.println(url.getDefaultPort());
		System.out.println(url.getPort());
		System.out.println(url.getFile());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		
		

	}

}
