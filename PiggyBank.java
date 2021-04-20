	




	public class PiggyBank
	{
	// instance variables go here
		private int quarters;
		private int dimes;
		private int nickels;
		private int pennies;
		
		
	
	
	// Constructor
		public PiggyBank(int pennies, int nickels, int dimes, int quarters){
			this.quarters = quarters;
			this.dimes = dimes;
			this.nickels = nickels;
			this.pennies = pennies;
	
	}
		
	// methods go here
		public double getPennies() {
			return this.pennies;
		}
		
		public double getNickels() {
			return this.nickels;
		}
		
		public double getDimes() {
			return this.dimes;
		}
		
		public double getQuarters() {
			return this.quarters;
		}
		
		public String getTotal() {
			double sum=(pennies*.01)+(nickels*.05)+(dimes*.10)+(quarters*.25);	
			return "$"+String.format("%.2f",sum);
		}
		
		
		public void combinePiggy(PiggyBank a) {
			this.pennies += a.getPennies();
			this.nickels += a.getNickels();
			this.dimes += a.getDimes();
			this.quarters += a.getQuarters();
			
			
		
		}
		
		@Override
		public String toString() {
			
			return "Pennies: " + this.getPennies() + " Nickels: " + this.getNickels() + " Dimes: " + this.getDimes() + " Quarters: " +  this.getQuarters() + " Total amount is: ";
		}
	
	
	
	}