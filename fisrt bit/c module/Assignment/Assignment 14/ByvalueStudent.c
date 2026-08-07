typedef struct Student
{
	int rollNo;
	char name[20];
	int marks;
}Student;

Student storeStudent(Student s)
{
		scanf("%d",&s.rollNo);
		scanf("%s",s.name);
		scanf("%d",&s.marks);
	return s;	
}

void displayStudent(Student s)
{
	{
		printf("\n%d  %s  %d\n",s.rollNo,s.name,s.marks);
	}
}
void main()
{
	Student std1, std2, std3;
	
	printf("Enter student details1: rollNo, Name, Marks\n ");
	 std1=storeStudent(std1);
	printf("Enter student details2: rollNo, Name, Marks\n ");
	 std2=storeStudent(std2);
	printf("Enter student details3: rollNo, Name, Marks\n ");
	 std3=storeStudent(std3);
	
	printf("\nStudent details are :");
	displayStudent(std1);
	displayStudent(std2);
	displayStudent(std3);
	
}