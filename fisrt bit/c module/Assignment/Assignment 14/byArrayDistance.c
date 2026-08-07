typedef struct Distance {
	int feet;
	double inch;
} Distance;

void storeDistance(Distance* dis,int size) 
{
	for(int i=0;i<size;i++)
	{
	scanf("%d",&dis[i].feet);
	scanf("%lf",&dis[i].inch);
	}
}

void displayDistance(Distance* dis,int size) 
{
	for(int i=0;i<size;i++)
	{
		printf("\n%d  %.2lf\n",dis[i].feet,dis[i].inch);
	}
}
void main() {
	Distance dis[3];

	printf("Enter distance details: feet, inch:\n ");
	storeDistance(dis,3);

	printf("\n distance details are :");
	displayDistance(dis,3);
}
