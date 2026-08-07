typedef struct Complex {
	double real;
	double imagei;
} Complex;

Complex storeComplex(Complex cmp) {
	scanf("%lf",&cmp.real);
	scanf("%lf",&cmp.imagei);
	return cmp;
}

void displayComplex(Complex cmp) {
	{
		printf("\n%.2lf  %.2lf\n",cmp.real,cmp.imagei);
	}
}
void main() {
	Complex cmp1,cmp2,cmp3;

	printf("Enter Complex details1: real, imaginary:\n ");
	cmp1=storeComplex(cmp1);
	printf("Enter Complex details1: real, imaginary:\n ");
	cmp2=storeComplex(cmp2);
	printf("Enter Complex details1: real, imaginary:\n ");
  	cmp3=storeComplex(cmp3);

	printf("\ncomplex details are :");
	displayComplex(cmp1);
	displayComplex(cmp2);
	displayComplex(cmp3);

}