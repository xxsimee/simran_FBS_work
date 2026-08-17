typedef struct Player
{
	char name[10];
	int matPlayed;
	int run;
	int wicket;
}Player;

void maxrunPlayer(Player* parr,int ci)
{
	int Maxrun=0;
	for(int i=0;i<ci;i++)
	{
		if(parr[i].run > parr[Maxrun].run)
		{
			Maxrun=i;
		}
	}
	printf("Player Name: %s\n",parr[Maxrun].name);
	printf("MatchPlayes: %d\n",parr[Maxrun].matPlayed);
	printf("Run:         %d\n",parr[Maxrun].run);
	printf("Wicket:      %d\n",parr[Maxrun].wicket);
	printf("\n");
}
void maxwicketPlayer(Player* parr,int ci)
{
	int Maxwicket=0;
	for(int i=0;i<ci;i++)
	{
		if(parr[i].wicket > parr[Maxwicket].wicket)
		{
			Maxwicket=i;
		}
	}
	printf("Player Name: %s\n",parr[Maxwicket].name);
	printf("MatchPlayes: %d\n",parr[Maxwicket].matPlayed);
	printf("Run:         %d\n",parr[Maxwicket].run);
	printf("Wicket:      %d\n",parr[Maxwicket].wicket);
	printf("\n");
}
void storePlayer(Player* parr,int ci)
{
	for(int i=0; i<ci;i++)
	{
		scanf("%s",parr[i].name);
		scanf("%d",&parr[i].matPlayed);
		scanf("%d",&parr[i].run);
		scanf("%d",&parr[i].wicket);
	}
	
}

void displayPlayer(Player* parr,int ci)
{
	for(int i=0;i<ci;i++)
	{
		printf("Player Name: %s\n",parr[i].name);
		printf("MatchPlayes: %d\n",parr[i].matPlayed);
		printf("Run:         %d\n",parr[i].run);
		printf("Wicket:      %d\n",parr[i].wicket);
		printf("\n");
	}
}
void main()
{
	Player parr[10];
	
	printf("Enter Player details are:name , matplayed, run, wicket\n");
	storePlayer(parr,10);
	
	printf("Player details are:\n");
	displayPlayer(parr,10);
	
	printf("Player having Maximum Wicket:\n");
	maxwicketPlayer(parr,10);
	
	printf("Player having Maximum Runs:\n");
	maxrunPlayer(parr,10);
	
}