package Audio_break;

import java.io.*;

public class Mp3_Break {
	public static void main(String args[])throws IOException{
		File f = new File("F:\\parent.mp3");
		File f1 = new File("F:\\son1.mp3");
		File f2 = new File("F:\\son2.mp3");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos1 = new FileOutputStream(f1);
		FileOutputStream fos2 = new FileOutputStream(f2);
		System.out.println(f.length());
		int p1,k,i=0;
		p1=(int)f.length();
		while((k=fis.read())!=-1) {
			if(i<p1/2) {
				fos1.write(k);
				i++;
			}else if(i>=p1/2) {
				fos2.write(k);
				i++;
			}
			
			
		}
		System.out.println(f1.length());
		System.out.println(f2.length());
	}
}
