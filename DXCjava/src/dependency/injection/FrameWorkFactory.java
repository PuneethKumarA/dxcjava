package dependency.injection;

public class FrameWorkFactory {
	
	
		public static void main(String[] args) {
			Service serviceb = new
					AirtelService();
					//ServiceB();
			Client client = new ClientA(serviceb); //constructor injection
			client.doSomething();
		}

	}


