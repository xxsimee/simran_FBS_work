typedef struct SaleManager {
	int id;
	char name[20];
	double salary;
	double incentive;
	double target;
} SaleManager;

void storeSale(SaleManager* sale,int size) 
{
	for(int i=0;i<size;i++)
	{
	scanf("%d",&sale[i].id);
	scanf("%s",sale[i].name);
	scanf("%lf",&sale[i].salary);
	scanf("%lf",&sale[i].incentive);
	scanf("%lf",&sale[i].target);
	}
}

void displaySale(SaleManager* sale,int size) 
{
	for(int i=0;i<size;i++)
	{
		printf("\n%d  %s  %.2lf %lf\n",sale[i].id,sale[i].name,sale[i].salary,sale[i].incentive,sale[i].target);
	}
}
void main() {
	SaleManager sale[3];

	printf("Enter HR details1: id, Name, salary,incentive,target\n ");
	storeSale(sale,3);

	printf("\n saleManager details are :");
	displaySale(sale,3);

}