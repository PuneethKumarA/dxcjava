package dependency.injection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrameWorkFactory {
	
	
	public static void main(String[] args) throws IOException {
		ServiceFactory serviceFactory = new ServiceFactory();
		System.out.print("Enter the name of plan for which the bill will be generated: ");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		String serviceName = br.readLine();  

		Service service  = serviceFactory.getService(serviceName);  


		Service serviceb = service;
				//AirtelService();
				//ServiceB();
		Client client = new ClientA(serviceb); //constructor injection
		client.doSomething();
	}
		}

	


