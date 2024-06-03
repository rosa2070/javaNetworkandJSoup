import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class NewsReaderUI02 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;
	private JTextField tf04;
	private JTextField tf05;
	private JTextField tf06;
	private JTextField tf07;
	private JTextField tf08;
	private JTextField tf09;
	private JTextField tf10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsReaderUI02 frame = new NewsReaderUI02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewsReaderUI02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn00 = new JButton("실시간 뉴스보기");
		btn00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewsReaderUI02 ui = new NewsReaderUI02();
				ArrayList<String> datas = ui.readNews();
				
				for( String data : datas ) {
					String[] parts = data.split(":", 3);
					String url = parts[0] + ":" + parts[1];
					String content = parts[2];
//					System.out.println(url);
//					System.out.println(content);
					if(tf01.getText().equals("뉴스내용")) {
						tf01.setText(content);
					} else if (tf02.getText().equals("뉴스내용")) {
						tf02.setText(content);
					} else if (tf03.getText().equals("뉴스내용")) {
						tf03.setText(content);
					} else if (tf04.getText().equals("뉴스내용")) {
						tf04.setText(content);
					} else if (tf05.getText().equals("뉴스내용")) {
						tf05.setText(content);
					} else if (tf06.getText().equals("뉴스내용")) {
						tf06.setText(content);
					} else if (tf07.getText().equals("뉴스내용")) {
						tf07.setText(content);
					} else if (tf08.getText().equals("뉴스내용")) {
						tf08.setText(content);
					} else if (tf09.getText().equals("뉴스내용")) {
						tf09.setText(content);
					} else if (tf10.getText().equals("뉴스내용")) {
						tf10.setText(content);
					}
						
				}
				
//				String data = datas.get(0);
//				data.split()
//				System.out.println(data);
				
				
			}
		});
		btn00.setBounds(12, 10, 560, 23);
		contentPane.add(btn00);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uB274\uC2A4 \uBCF4\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 45, 566, 358);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tf01 = new JTextField();
		tf01.setEditable(false);
		tf01.setBounds(12, 25, 404, 21);
		panel.add(tf01);
		tf01.setText("뉴스내용");
		tf01.setColumns(10);
		
		JButton btn01 = new JButton("바로가기");
		btn01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(0);		
			}
		});
		btn01.setBounds(428, 24, 126, 23);
		panel.add(btn01);
		
		tf02 = new JTextField();
		tf02.setText("뉴스내용");
		tf02.setEditable(false);
		tf02.setColumns(10);
		tf02.setBounds(12, 57, 404, 21);
		panel.add(tf02);
		
		JButton btn02 = new JButton("바로가기");
		btn02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(1);
			}
		});
		btn02.setBounds(428, 56, 126, 23);
		panel.add(btn02);
		
		tf03 = new JTextField();
		tf03.setText("뉴스내용");
		tf03.setEditable(false);
		tf03.setColumns(10);
		tf03.setBounds(12, 89, 404, 21);
		panel.add(tf03);
		
		JButton btn03 = new JButton("바로가기");
		btn03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(2);
			}
		});
		btn03.setBounds(428, 88, 126, 23);
		panel.add(btn03);
		
		tf04 = new JTextField();
		tf04.setText("뉴스내용");
		tf04.setEditable(false);
		tf04.setColumns(10);
		tf04.setBounds(12, 120, 404, 21);
		panel.add(tf04);
		
		JButton btn04 = new JButton("바로가기");
		btn04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(3);

			}
		});
		btn04.setBounds(428, 119, 126, 23);
		panel.add(btn04);
		
		tf05 = new JTextField();
		tf05.setText("뉴스내용");
		tf05.setEditable(false);
		tf05.setColumns(10);
		tf05.setBounds(12, 152, 404, 21);
		panel.add(tf05);
		
		JButton btn05 = new JButton("바로가기");
		btn05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(4);

			}
		});
		btn05.setBounds(428, 151, 126, 23);
		panel.add(btn05);
		
		tf06 = new JTextField();
		tf06.setText("뉴스내용");
		tf06.setEditable(false);
		tf06.setColumns(10);
		tf06.setBounds(12, 187, 404, 21);
		panel.add(tf06);
		
		JButton btn06 = new JButton("바로가기");
		btn06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(5);

			}
		});
		btn06.setBounds(428, 186, 126, 23);
		panel.add(btn06);
		
		tf07 = new JTextField();
		tf07.setText("뉴스내용");
		tf07.setEditable(false);
		tf07.setColumns(10);
		tf07.setBounds(12, 219, 404, 21);
		panel.add(tf07);
		
		JButton btn07 = new JButton("바로가기");
		btn07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(6);

			}
		});
		btn07.setBounds(428, 218, 126, 23);
		panel.add(btn07);
		
		tf08 = new JTextField();
		tf08.setText("뉴스내용");
		tf08.setEditable(false);
		tf08.setColumns(10);
		tf08.setBounds(12, 250, 404, 21);
		panel.add(tf08);
		
		JButton btn08 = new JButton("바로가기");
		btn08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(7);

			}
		});
		btn08.setBounds(428, 249, 126, 23);
		panel.add(btn08);
		
		tf09 = new JTextField();
		tf09.setText("뉴스내용");
		tf09.setEditable(false);
		tf09.setColumns(10);
		tf09.setBounds(12, 282, 404, 21);
		panel.add(tf09);
		
		JButton btn09 = new JButton("바로가기");
		btn09.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(8);

			}
		});
		btn09.setBounds(428, 281, 126, 23);
		panel.add(btn09);
		
		tf10 = new JTextField();
		tf10.setText("뉴스내용");
		tf10.setEditable(false);
		tf10.setColumns(10);
		tf10.setBounds(12, 317, 404, 21);
		panel.add(tf10);
		
		JButton btn10 = new JButton("바로가기");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWebPage(9);

			}
		});
		btn10.setBounds(428, 316, 126, 23);
		panel.add(btn10);
	}
	
	public ArrayList<String> readNews() {
		BufferedReader br = null;
		
		ArrayList<String> datas = new ArrayList<String>();
		
		try {
			URL url = new URL( "https://news.daum.net/" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );
					
			String line = null;
			
			boolean flag = false;
			while( ( line = br.readLine() ) != null ) {
				
				if( line.contains( "class=\"link_txt\" data-tiara-layer=\"article_main\"" ) ) {
					flag = true;
				}
				
				if( line.contains( "</a>" ) ) {
					flag = false;
				}
				
				if( flag ) {
					String strUrl = line.substring( line.indexOf( "href" ) + 6, line.indexOf( "class" ) - 2 );
					String strData = br.readLine().trim();
					
					String data = strUrl + ":" + strData;
					datas.add( data );
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch( IOException e ) {} 
		}
		
		return datas;
	}
	
	/*
	public void openWebPage(String urlString) {
		try {
			URI uri = new URI(urlString);
			Desktop.getDesktop().browse(uri);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	public void openWebPage(int i) {
		NewsReaderUI02 ui = new NewsReaderUI02();
		ArrayList<String> datas = ui.readNews();
		String data = datas.get(i);
		String[] parse = data.split(":");
		String url = parse[0] + ":" + parse[1];
		try {
			URI uri = new URI(url);
			Desktop.getDesktop().browse(uri);
//			System.out.println(datas.get(0));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
