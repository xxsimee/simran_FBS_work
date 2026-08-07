typedef struct Employee
{
	int id;
	char name[20];
	int salary;
}Employee;

Employee storeEmployee(Employee e)
{
		scanf("%d",&e.id);
		scanf("%s",e.name);
		scanf("%d",&e.salary);
	return e;	
}

void displayEmployee(Employee e)
{
	{
		printf("\n%d  %s  %d\n",e.id,e.name,e.salary);
	}
}
void main()
{
	Employee emp1, emp2, emp3;
	
	printf("Enter Employee details1: id, Name, salary\n ");
	 emp1=storeEmployee(emp1);
	printf("Enter Employee details2: id, Name, salary\n ");
	 emp2=storeEmployee(emp2);
	printf("Enter Employee details3: id, Name, salary\n ");
	 emp3=storeEmployee(emp3);
	
	printf("\nEmployee details are :");
	displayEmployee(emp1);
	displayEmployee(emp2);
	displayEmployee(emp3);
	
}