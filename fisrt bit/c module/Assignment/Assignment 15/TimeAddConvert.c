typedef struct Time
{
	int hr;
	int min;
	int sec;
}Time;

void storeTime(Time* tarr,int ci)
{
	for(int i=0;i<ci;i++)
	{
		scanf("%d",&tarr[i].hr);
		scanf("%d",&tarr[i].min);
		scanf("%d",&tarr[i].sec);
	}
}

void displayTime(Time* tarr,int ci)
{
	for(int i=0;i<ci;i++)
	{
		printf("hr:  %d\n",tarr[i].hr);
		printf("min: %d\n",tarr[i].min);
		printf("sec: %d\n",tarr[i].sec);
		printf("\n");
	}
}

Time addTime(Time t1, Time t2)
{
	Time result;
	
	result.hr=t1.hr+t2.hr;
	result.min=t1.min+t2.min;
	result.sec= t1.sec+t2.sec;
	
	if(result.sec>=60)
	{
		result.sec=result.sec-60;
		result.min++;
	}
	
	if(result.min>=60)
	{
		result.min=result.min-60;
		result.hr++;	
	}
	return result;
}

int convertTime(Time total)
{
	int totalsec;
	totalsec= total.hr*3600+ total.min*60+total.sec;
	return totalsec;
}
void main()
{
	Time tarr[2];
	
	printf("Enter t1 and t2:\n");
	storeTime(tarr,2);
	
	printf("Display Time:\n");
	displayTime(tarr,2);
	
	Time result= addTime(tarr[0], tarr[1]);

    printf("\nAddition Result:\n");
    displayTime(&result, 1);
    
    printf("time 1 convert: %d\n",convertTime(tarr[0]));
    printf("time 2: %d\n",convertTime(tarr[1]));
    printf("time result : %d\n",convertTime(result));
		return 0;
}