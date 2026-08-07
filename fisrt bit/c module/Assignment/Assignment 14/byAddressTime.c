typedef struct Time {
	int hour,min,sec;
} Time;

void storeTime(Time* t) {
	scanf("%d",&t->hour);
	scanf("%d",&t->min);
	scanf("%d",&t->sec);
}

void displayTime(Time* t) {
	{
		printf("\n%d  %d  %d\n",t->hour,t->min,t->sec);
	}
}
void main() {
	Time t1, t2, t3;

	printf("Enter Time details1: hour, min, sec:\n ");
	storeTime(&t1);
	printf("Enter Time details2: hour, min, sec:\n ");
	storeTime(&t2);
	printf("Enter Time details3: hour, min, sec:\n ");
  	storeTime(&t3);

	printf("\nTime details are :");
	displayTime(&t1);
	displayTime(&t2);
	displayTime(&t3);

}