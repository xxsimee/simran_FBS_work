void discount();
void main()
{
	discount();
}
void discount()
{
char student = 'n';
int price=400;
double fprice;
if(student == 'y')
{
	if(price>=500)
	{
		fprice=price-price*0.20;
	 printf("final price after apply discount %f",fprice);
	}
	else
	{
		   fprice=price-price*0.10;
		  	 printf("final price after apply discount %f",fprice);
	}
}
else
{
  if(price>=600)
  {
  	fprice=price-price*0.15;
  	 printf("final price after apply discount %f",fprice);
  }
  else
  {
  	fprice=price;
	 printf("final price after apply discount %f",fprice);
  }
}

}