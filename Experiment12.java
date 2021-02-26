package p;
import converter.*;

public class Experiment12
{
	public static void main(String args[])
	{
		TimeConverter obj = new TimeConverter();
		obj.timeCon();
		
		CurrencyConverter obj2 = new CurrencyConverter();
		obj2.currencyCon();
		
		DistanceConverter ob = new DistanceConverter();
		ob.disConverter();
	}
}