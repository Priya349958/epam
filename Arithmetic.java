
public class Arithmetic {

	public double Add(double num1,double num2)
	{
	return num1+num2;
	}
	public double Mul(double num1,double num2)
	{
	return num1*num2;
	}
	public double Div(double num1,double num2)
	{
		try
		{
			return (num1/num2);
		}
		catch(Exception e)
		{
			return Integer.parseInt(e.getMessage());
		}
	}
}
