typedef struct Distance {
	int feet;
	double inch;
} Distance;

void storeDistance(Distance* dis) {
	scanf("%d",&dis->feet);
	scanf("%lf",&dis->inch);
}

void displayDistance(Distance* dis) {
	{
		printf("\n%d  %.2lf\n",dis->feet,dis->inch);
	}
}
void main() {
	Distance dis1,dis2,dis3;

	printf("Enter distance details1: feet, inch:\n ");
	storeDistance(&dis1);
	printf("Enter distance details2: feet, inch:\n ");
	storeDistance(&dis2);
	printf("Enter distance details3: feet, inch:\n ");
  	storeDistance(&dis3);

	printf("\n distance details are :");
	displayDistance(&dis1);
	displayDistance(&dis2);
	displayDistance(&dis3);

}