typedef struct Distance {
	int feet;
	double inch;
} Distance;

Distance storeDistance(Distance dis) {
	scanf("%d",&dis.feet);
	scanf("%lf",&dis.inch);
	return dis;
}

void displayDistance(Distance dis) {
	{
		printf("\n%lf  %d\n",dis.inch,dis.feet);
	}
}
void main() {
	Distance dis1,dis2,dis3;

	printf("Enter distance details1: inch, feet:\n ");
	dis1=storeDistance(dis1);
	printf("Enter distance details1: inch, feet:\n ");
	dis2=storeDistance(dis2);
	printf("Enter distance details1: inch, feet:\n ");
  	dis3=storeDistance(dis3);

	printf("\n distance details are :");
	displayDistance(dis1);
	displayDistance(dis2);
	displayDistance(dis3);

}