typedef struct Admin {
	int id;
	char name[20];
	double salary;
	double allowance;
} Admin;

Admin storeAdmin(Admin ad) {
	scanf("%d",&ad.id);
	scanf("%s",ad.name);
	scanf("%lf",&ad.salary);
	scanf("%lf",&ad.allowance);
	return ad;
}

void displayAdmin(Admin ad) {
	{
		printf("\n%d  %s  %.2lf %lf\n",ad.id,ad.name,ad.salary,ad.allowance);
	}
}
void main() {
	Admin adm1, adm2, adm3;

	printf("Enter Admin details1: id, Name, salary, allowance\n ");
	adm1=storeAdmin(adm1);
	printf("Enter Admin details2: id, Name, salary, allownace\n ");
	adm2=storeAdmin(adm2);
	printf("Enter Admin details3: id, Name, salary, allownace\n ");
	adm3=storeAdmin(adm3);

	printf("\n Admin details are :");
	displayAdmin(adm1);
	displayAdmin(adm2);
	displayAdmin(adm3);

}