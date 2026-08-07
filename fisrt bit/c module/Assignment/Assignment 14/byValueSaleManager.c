typedef struct SaleManager {
	int id;
	char name[20];
	double salary;
	double incentive;
	double target;
} SaleManager;

SaleManager storeSale(SaleManager sale) {
	scanf("%d",&sale.id);
	scanf("%s",sale.name);
	scanf("%lf",&sale.salary);
	scanf("%lf",&sale.incentive);
	scanf("%lf",&sale.target);
	return sale;
}

void displaySale(SaleManager sale) {
	{
		printf("\n%d  %s  %.2lf %lf\n",sale.id,sale.name,sale.salary,sale.incentive,sale.target);
	}
}
void main() {
	SaleManager sale1, sale2, sale3;

	printf("Enter HR details1: id, Name, salary,incentive,target\n ");
	sale1=storeSale(sale1);
	printf("Enter HR details2: id, Name, salary, incentive, target\n ");
	sale2=storeSale(sale2);
	printf("Enter HR details2: id, Name, salary, incentive, target\n ");
	sale3=storeSale(sale3);

	printf("\n saleManager details are :");
	displaySale(sale1);
	displaySale(sale2);
	displaySale(sale3);

}