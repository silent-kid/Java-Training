package IoOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import javax.sound.sampled.spi.AudioFileWriter;

public class Writing 
{
	static String s="hii my name is sharuk";
	
	public static void main(String []a) throws IOException 
	{
		FileWriter fw= new FileWriter("newtxt.txt");
		for(int i=0;i<s.length();i++)
		{
			fw.write(s.charAt(i));
		}
		System.out.println("complted");
		
		fw.close();
		FileReader fr=new FileReader("newtxt.txt");
		 int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
			
		}
		fr.close();
	}
	
}
