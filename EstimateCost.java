
public class EstimatingCost {
	
public double findcost(int matType,double area,boolean isAutomated)
{
	int cost=0;
	if(matType==0)
		cost=1200;
	else if(matType==1)
	cost=1500;
	else if(matType==2 && isAutomated)
		cost=2500;
	else
		cost=1000;
	return area*cost;

	
}
}
