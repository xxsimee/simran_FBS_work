typedef struct Admin {
	int id;
	char name[20];
	double salary;
	double allowance;
} Admin;

void storeAdmin(Admin* ad, int size)
{
	for(int i=0;i<size;i++)
	{
	scanf("%d",&ad[i].id);
	scanf("%s",ad[i].name);
	scanf("%lf",&ad[i].salary);
	scanf("%lf",&ad[i].allowance);
     }
}

void displayAdmin(Admin* ad,int size) 
{
	for(int i=0;i<size;i++)
	{
		printf("\n%d  %s  %.2lf %lf\n",ad[i].id,ad[i].name,ad[i].salary,ad[i].allowance);
	}
}
void main() {
	Admin adm[3];

	printf("Enter Admin details: id, Name, salary, allowance\n ");
	storeAdmin(adm,3);

	printf("\n Admin details are :");
	displayAdmin(adm,3);

}