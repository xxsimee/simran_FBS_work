typedef struct HRcom {
	int id;
	char name[20];
	double salary;
	double commission;
} HRcom;

HRcom storeHR(HRcom hr) {
	scanf("%d",&hr.id);
	scanf("%s",hr.name);
	scanf("%lf",&hr.salary);
	scanf("%lf",&hr.commission);
	return hr;
}

void displayHR(HRcom hr) {
	{
		printf("\n%d  %s  %.2lf %lf\n",hr.id,hr.name,hr.salary,hr.commission);
	}
}
void main() {
	HRcom hr1, hr2, hr3;

	printf("Enter HR details1: id, Name, salary,commission\n ");
	hr1=storeHR(hr1);
	printf("Enter HR details2: id, Name, salary, commission\n ");
	hr2=storeHR(hr2);
	printf("Enter HR details3: id, Name, salary, commission\n ");
	hr3=storeHR(hr3);

	printf("\n Hr details are :");
	displayHR(hr1);
	displayHR(hr2);
	displayHR(hr3);

}