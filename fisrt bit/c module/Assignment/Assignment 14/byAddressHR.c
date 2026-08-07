typedef struct HRcom {
	int id;
	char name[20];
	double salary;
	double commission;
} HRcom;

void storeHR(HRcom* hr) {
	scanf("%d",&hr->id);
	scanf("%s",hr->name);
	scanf("%lf",&hr->salary);
	scanf("%lf",&hr->commission);
}

void displayHR(HRcom* hr) {
	{
		printf("\n%d  %s  %.2lf %lf\n",hr->id,hr->name,hr->salary,hr->commission);
	}
}
void main() {
	HRcom hr1, hr2, hr3;

	printf("Enter HR details1: id, Name, salary,commission\n ");
	storeHR(&hr1);
	printf("Enter HR details2: id, Name, salary, commission\n ");
	storeHR(&hr2);
	printf("Enter HR details3: id, Name, salary, commission\n ");
	storeHR(&hr3);

	printf("\n Hr details are :");
	displayHR(&hr1);
	displayHR(&hr2);
	displayHR(&hr3);

}