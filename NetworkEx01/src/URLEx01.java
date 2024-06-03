import java.util.StringTokenizer;

public class URLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://www.codechobo.com:80/sample/hello.html?referer=codechobo#index1";
		
		// 프로토콜  : http
		// 호스트명  : www.codechobo.com
		// 포트명    : 80
		
		// String 클래스를 이용해서 분리
	    StringTokenizer st = new StringTokenizer(url, ":/");
	    while(st.hasMoreTokens()) {
	    	System.out.println(st.nextToken());
	    }	
	}

}
