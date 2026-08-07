typedef struct HRcom {
	int id;
	char name[20];
	double salary;
	double commission;
} HRcom;

void storeHR(HRcom* hr,int size) 
{
	for(int i=0;i<size;i++)
	{
	scanf("%d",&hr[i].id);
	scanf("%s",hr[i].name);
	scanf("%lf",&hr[i].salary);
	scanf("%lf",&hr[i].commission);
   }
}

void displayHR(HRcom* hr,int size) {
	for(int i=0;i<size;i++)
	{
		printf("\n%d  %s  %.2lf %lf\n",hr[i].id,hr[i].name,hr[i].salary,hr[i].commission);
	}
}
void main() {
	HRcom hr[3];

	printf("Enter HR details1: id, Name, salary,commission\n ");
	storeHR(hr,3);

	printf("\n Hr details are :");
	displayHR(hr,3);

}