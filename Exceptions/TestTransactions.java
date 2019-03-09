package Exceptions;

public class TestTransactions {



		public static void main(String[] args)  {
			
			Transaction t = new Transaction();
			t.setBalance(10000.45f);
		
				try {
					t.deposit(-41000);
				} catch (NegativeAmountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}