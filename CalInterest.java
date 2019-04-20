package callInterest;

public class CallInterest {

public double callSimpleInterest(float princi,float roi,float tp)
{
	return (princi*roi*tp)/100;
}

public double callCompoundInterest(float princi,float roi,float tp)
{
	return princi*(Math.pow((1+roi/100), tp));
}
}

