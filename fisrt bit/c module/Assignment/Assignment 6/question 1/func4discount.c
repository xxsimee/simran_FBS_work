int discount(int, char);
void main()
{
char student = 'n';
int price=800;
int final=discount(price, student);
printf("final price after applying discount is %d",final);		
}
int discount(int price ,char student)
{
double fprice;
if(student == 'y')
{
	if(price>=500)
	{
		fprice=price-price*0.20;
	 //printf("final price after apply discount %f",fprice);
	}
	else
	{
		   fprice=price-price*0.10;
		  //	 printf("final price after apply discount %f",fprice);
	}
}
else
{
  if(price>=600)
  {
  	fprice=price-price*0.15;
  	 //printf("final price after apply discount %f",fprice);
  }
  else
  {
  	fprice=price;
	// printf("final price after apply discount %f",fprice);
  }
}
//printf("final price after apply discount %f",fprice);
return fprice;
}