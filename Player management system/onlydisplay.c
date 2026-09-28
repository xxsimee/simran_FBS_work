typedef struct 
{
	int jerseyNum;
	char playerName[30];
	int runs,wicket,matchPlayer;
}Player;


void storePlayer (Player* parr,int currindex)
{
	printf("Enter JerseynNum , PlayerName , Runs , Wicket, Matchplayer\n");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&parr[i].jerseyNum);
		scanf("%s",parr[i].playerName);
		scanf("%d",&parr[i].runs);
		scanf("%d",&parr[i].wicket);
		scanf("%d",&parr[i].matchPlayer);
		
	}
}

DisplayPlayer(Player* parr, int currindex)
{
	for(int i=0; i<5; i++)
	{
		printf("%d",parr[i].jerseyNum);
		printf("%s",parr[i].playerName);
		printf("%d",parr[i].runs);
		printf("%d",parr[i].wicket);
		printf("%d",parr[i].matchPlayer);
	}
}
void main()
{
	Player parr[5];
	int currindex;
	
	storePlayer(parr,5);
	
	printf("Player are:");
	DisplayPlayer(parr, 5);
	 
}