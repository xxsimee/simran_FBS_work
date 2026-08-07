typedef struct Time {
	int hour,min,sec;
} Time;

void storeTime(Time* t,int size) 
{
	for(int i=0;i<size;i++)
	{
	scanf("%d",&t[i].hour);
	scanf("%d",&t[i].min);
	scanf("%d",&t[i].sec);
	}
}

void displayTime(Time* t,int size) 
{
	for(int i=0;i<size;i++)
	{
		printf("\n%d  %d  %d\n",t[i].hour,t[i].min,t[i].sec);
	}
}
void main() {
	Time t[3];

	printf("Enter Time details1: hour, min, sec:\n ");
	storeTime(t,3);

	printf("\nTime details are :");
	displayTime(t,3);

}