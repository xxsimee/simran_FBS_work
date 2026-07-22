double sal(int);
void main()
{
	int basic=5000;
    double res =sal(basic);
    printf(" total salary is %.2lf", res);
}
double sal(int basic)
{
	double salary, da,ta, hra,tsal;
    if (basic<=5000)
    {
    	da= basic*0.1;
    	ta=basic*0.20;
    	hra= basic *0.25;
    	tsal = basic+da+ta+hra;
    	//printf("total sal is %lf",tsal);
	}
	else
	{
		da= basic*0.15;
    	ta=basic*0.25;
    	hra= basic *0.30;
    	tsal = basic+da+ta+hra;
    	//printf("total sal is %lf",tsal);
    }
    return tsal;
}