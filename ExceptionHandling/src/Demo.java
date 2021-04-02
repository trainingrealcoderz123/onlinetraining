//User Defined Exception
class BalanceCheck
{
	private double balance;
	private int id;
	public BalanceCheck(int id) {
		this.id = id;
	}
	public void deposite(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount) throws LowBalanceException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}else
		{
			double requirement=amount-balance;
			throw new LowBalanceException(requirement);
		}
	}
	public double getBalance() {
		return balance;
	}
	public int getId() {
		return id;
	}

}
class TestMain
{
	public static void main(String[] args) {
		BalanceCheck bc=new BalanceCheck(121);
		System.out.println("Deposite 10000");
		bc.deposite(10000.00);
		System.out.println("Withdraw 5000");
		try
		{
		bc.withdraw(5000.00);
		System.out.println("Withdraw 6000");
		bc.withdraw(6000.00);
		}catch(LowBalanceException e)
		{
         System.out.println("Sorry!! Insufficient Balance.You are short by Rs"+e.getAmount());			
		}
	}
}
class LowBalanceException extends Exception
{
	double amount;
	public LowBalanceException(double amount) {
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}

}