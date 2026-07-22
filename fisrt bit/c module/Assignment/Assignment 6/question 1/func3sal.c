void sal(int);
void main()
{
	int basic=5000;
    sal(basic);
}
void sal(int basic)
{
	double  da,ta,hra,tsal;
    if (basic<=5000)
    {
    	da= basic*0.1;
    	ta=basic*0.20;
    	hra= basic *0.25;
    	tsal = basic+da+ta+hra;
    	printf("total sal is %lf",tsal);
	}
	else
	{
		da= basic*0.15;
    	ta=basic*0.25;
    	hra= basic *0.30;
    	tsal = basic+da+ta+hra;
    	printf("total sal is %lf",tsal);
    }
}