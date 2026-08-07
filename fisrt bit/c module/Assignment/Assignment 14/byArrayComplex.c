typedef struct Complex {
	double real;
	double imagei;
} Complex;

void storeComplex(Complex* cmp, int size) 
{
	for(int i=0;i<size;i++)
	{
	scanf("%lf",&cmp[i].real);
	scanf("%lf",&cmp[i].imagei);
   }
}

void displayComplex(Complex* cmp,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("\n%.2lf  %.2lf\n",cmp[i].real,cmp[i].imagei);
	}
}

void main() 
{
	Complex cmp[3];

  printf("Enter 3 Complex numbers (real imaginary):\n");
  	storeComplex(cmp,3);

	printf("\ncomplex details are :");
	displayComplex(cmp,3);

}