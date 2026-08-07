typedef struct Time {
	int hour,min,sec;
} Time;

Time storeTime(Time t) {
	scanf("%d",&t.hour);
	scanf("%d",&t.min);
	scanf("%d",&t.sec);
	return t;
}

void displayTime(Time t) {
	{
		printf("\n%d  %d  %d\n",t.hour,t.min,t.sec);
	}
}
void main() {
	Time t1, t2, t3;

	printf("Enter Time details1: hour, min, sec:\n ");
	t1=storeTime(t1);
	printf("Enter Time details1: hour, min, sec:\n ");
	t2=storeTime(t2);
	printf("Enter Time details1: hour, min, sec:\n ");
  	t3=storeTime(t3);

	printf("\nTime details are :");
	displayTime(t1);
	displayTime(t2);
	displayTime(t3);

}