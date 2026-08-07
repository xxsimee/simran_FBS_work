typedef struct Employee
{
	int id;
	char name[20];
	double salary;
}Employee;

void main()
{
	Employee emparr[3];
	
	printf("Enter details of employees :");
	storeEmployees(emparr,3);
	
	printf("\nEmployees are:\n");
	displayEmployees(emparr,3);
}//main ends here


void displayEmployees(Employee* emparr,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("%d  %s  %lf\n",emparr[i].id,emparr[i].name,emparr[i].salary);
	}
}

void storeEmployees(  Employee*  emparr   ,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&emparr[i].id);
		scanf("%s",emparr[i].name);
		scanf("%lf",&emparr[i].salary);
	}
	
}//store employee ends here