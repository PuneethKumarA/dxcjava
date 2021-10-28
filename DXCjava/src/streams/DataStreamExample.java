package streams;

import java.io.FileInputStream;

public class DataStreamExample {  
	public static void main(String args[]){    
		try{    
			FileInputStream fin=new FileInputStream("C:\\Users\\pkumara5\\OneDrive - DXC Production\\Desktop\\datatest.txt");    
			int i=fin.read();  
			System.out.print((char)i);    

			fin.close();    
		} catch(Exception e){
			System.out.println(e);
		}    
	}    
}  

