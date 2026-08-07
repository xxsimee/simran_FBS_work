typedef struct Calender {
	int date;
	char month[20];
    int year;
} Calender;

void storeDate(Calender* day,int size)
{	for(int i=0;i<size;i++)
	{
 	scanf("%d",&day[i].date);
	scanf("%s",day[i].month);
	scanf("%d",&day[i].year);
	}
}

void displayDate(Calender* day,int size) 
{ 	 
 	for(int i=0;i<size;i++)
	{
		printf("\n%d  %s  %d\n",day[i].date,day[i].month,day[i].year);
	}
}
void main() 
{
	Calender day[3];

	printf("Enter Calender details2: date, Month, year:\n ");
	storeDate(day,3);

	printf("\nCalender details are :");
	displayDate(day,3);

}