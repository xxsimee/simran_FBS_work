typedef struct Student
{
	int rollNo;
	char name[20];
	int marks;
}Student;

void storeStudent(Student* std, int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&std[i].rollNo);
		scanf("%s",std[i].name);
		scanf("%d",&std[i].marks);
	}
}

void displayStudent(Student* std, int size)
{
	for(int i=0;i<size;i++)
	{
		printf("%d  %s  %d\n",std[i].rollNo,std[i].name,std[i].marks);
	}
}
void main()
{
	Student std[5];
	
	printf("Enter student details: rollNo, Name, Marks\n ");
	storeStudent(std,5);
	
	printf("\nStudent details are :");
	displayStudent(std,5);
	
}