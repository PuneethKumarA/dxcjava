package streams;

	import java.io.*;  
	public class InputStreamExample { 
		
	  public static void main(String args[])throws Exception{  
		  
	   FileInputStream input1=new FileInputStream("C:\\Users\\pkumara5\\OneDrive - DXC Production\\Desktop\\testout.txt");    
	   FileInputStream input2=new FileInputStream("C:\\Users\\pkumara5\\OneDrive - DXC Production\\Desktop\\testin.txt");    
	   SequenceInputStream inst=new SequenceInputStream(input1, input2);   
	   
	   int j;    
	   while((j=inst.read())!=-1){    
	    System.out.print((char)j);    
	   }    
	   inst.close();    
	   input1.close();    
	   input2.close();    
	  }    
	}    

