package callbacks;

	public class OfficeBoy {

		public void doGovtWork(MobilePhone mobilePhone) {
			System.out.println("going to do some paper work");
			try {
				Thread.sleep(7000);
				System.out.println("i am done with the job");
				mobilePhone.successGreenButton();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

