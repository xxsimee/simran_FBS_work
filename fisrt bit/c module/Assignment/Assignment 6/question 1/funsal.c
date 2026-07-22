int sal();
void main()
{
	//printf("%d",sal());
	int x;
	x=sal();
	printf("%d",x);
}
int sal()
{
	int basic=5000;
	int salary=5000;
    double  da, ta, hra , tsal;
    if (basic<=5000)
    {
    	da= basic*0.1;
    	ta=basic*0.20;
    	hra= basic *0.25;
    	tsal = basic+da+ta+hra;
    	printf("total sal is %lf",tsal);
    	return 1;
	}
	else
	{
		da= basic*0.15;
    	ta=basic*0.25;
    	hra= basic *0.30;
    	tsal = basic+da+ta+hra;
    	printf("total sal is %lf",tsal);
	   return 0;
	}
    	
}