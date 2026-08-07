typedef struct Calender {
	int date;
	char month[20];
    int year;
} Calender;

void storeDate(Calender* day) {
	scanf("%d",&day->date);
	scanf("%s",day->month);
	scanf("%d",&day->year);
}

void displayDate(Calender* day) {
	{
		printf("\n%d  %s  %d\n",day->date,day->month,day->year);
	}
}
void main() {
	Calender day1, day2, day3;

	printf("Enter Calender details1: date, Month, year:\n ");
	storeDate(&day1);
	printf("Enter Calender details2: date, Month, year:\n ");
	storeDate(&day2);
	printf("Enter Calender details2: date, Month, year:\n ");
	storeDate(&day3);

	printf("\nCalender details are :");
	displayDate(&day1);
	displayDate(&day2);
	displayDate(&day3);

}