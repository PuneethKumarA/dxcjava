package dependency.injection;

public class ClientA implements Client{

	Service service;       //clientA is dependent on an object of ServiceB [dependency]
	//service = new ServiceB()  im not going to create this object

	public ClientA(Service serv) {
		service = serv;
	}


	@Override
	public void doSomething() {    
		String info = service.getInfo();
		System.out.println(info);
	}
} 


