void main()
{
	//printf("%s",strerror(2));
	//strerror(2)=no such file or directory
	int error=2;
	char*  msg;
	msg=strerror(error);
	printf("Error : %s", msg);
	// strerror ek character pointer return karta hai !!!!
}