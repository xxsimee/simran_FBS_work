#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct Player
{
	int jNum;
	char playerName[30];
	int runs,wicket,matPlayed;
}Player;

void storeHardcodedPlayer(Player* plyarr,int* ci)
{
	plyarr[*ci].jNum=11;
	strcpy(plyarr[*ci].playerName,"Virat");
	plyarr[*ci].runs=75;
	plyarr[*ci].wicket=100;
	plyarr[*ci].matPlayed=7;
	(*ci)++;
	
	plyarr[*ci].jNum=12;
	strcpy(plyarr[*ci].playerName,"shashank");
	plyarr[*ci].runs=80;
	plyarr[*ci].wicket=107;
	plyarr[*ci].matPlayed=89;
	(*ci)++;

	plyarr[*ci].jNum=13;
	strcpy(plyarr[*ci].playerName,"sonam");
	plyarr[*ci].runs=66;
	plyarr[*ci].wicket=89;
	plyarr[*ci].matPlayed=25;
	(*ci)++;
	
	plyarr[*ci].jNum=14;
	strcpy(plyarr[*ci].playerName,"shreyas");
	plyarr[*ci].runs=90;
	plyarr[*ci].wicket=100;
	plyarr[*ci].matPlayed=15;
	(*ci)++;
	
}

/////////////////////////////////////////////Search Player by Jnum/////////////////////////////////////////////////////
int searchPlayerByjNum(Player* plyarr,int ci, int jNum)
{
	for(int i=0;i<ci; i++)
	{
		if(plyarr[i].jNum==jNum)
			return i;
	}
	return -1;
}
/////////////////////////////////////////////////Add  new Player///////////////////////////////////////
Player* addPlayer(Player* plyarr, int* ci,int* capacity ,Player ply)
{
	if(searchPlayerByjNum(plyarr,*ci,ply.jNum)!=-1)
	{
		printf("jNum is already Exist");
		return plyarr;
	}
		if(*ci == *capacity)
    	{
    		printf("\nArray full tha, memory increase kar di!\n");
       		 *capacity = *capacity * 2;
			plyarr = (Player*)realloc(plyarr,*capacity * sizeof(Player));
			printf("Player Add successfully");
    	}
	plyarr[*ci]=ply;
	(*ci)++;
}
////////////////////////////////////Search Player by Name/////////////////////////////////////////////////
void searchPlayerByplayerName(Player* plyarr, int ci, char playerName[])
{
    int found = 0;

    for(int i = 0; i < ci; i++)
    {
        if(stricmp(plyarr[i].playerName, playerName) == 0)
        {
            printf("\nPlayer Found at Index : %d\n", i);
            printf("Jersey Number : %d\n", plyarr[i].jNum);
            printf("Player Name   : %s\n", plyarr[i].playerName);
            printf("Runs          : %d\n", plyarr[i].runs);
            printf("Wickets       : %d\n", plyarr[i].wicket);
            printf("Matches Played: %d\n", plyarr[i].matPlayed);

            found++;
        }
    }

    if(found == 0)
    {
        printf("\nPlayer Not Found\n");
    }
}

////////////////////////////////////////// sorting by Wicket min///////////////////////////////////////////
void sortingPlayerByWicketMin(Player* plyarr,int ci)
{
	for(int j=0; j<ci-1; j++)
    {
        for(int i=0; i<ci-1-j; i++)
        {
            if(plyarr[i].wicket > plyarr[i+1].wicket)
            {
                Player temp = plyarr[i];
                plyarr[i] = plyarr[i+1];
                plyarr[i+1] = temp;
            }
        }
    }
    printf("\n.......Top Three Player are........\n");
    for(int i=0;i<3;i++)
     {
     	printf("\nJersey Number : %d\n", plyarr[i].jNum);
	    printf("Player Name   : %s\n", plyarr[i].playerName);
		printf("Runs          : %d\n", plyarr[i].runs);
	    printf("Wickets       : %d\n", plyarr[i].wicket);
	    printf("Matches Played: %d\n", plyarr[i].matPlayed);
	    printf("\n");
	 }
}

//////////////////////////////////////sorting by wicket Max/////////////////////////////////////
void sortingPlayerByWicketMax(Player* plyarr,int ci)
{
	for(int j=0; j<ci-1; j++)
    {
        for(int i=0; i<ci-1-j; i++)
        {
            if(plyarr[i].wicket < plyarr[i+1].wicket)
            {
                Player temp = plyarr[i];
                plyarr[i] = plyarr[i+1];
                plyarr[i+1] = temp;
            }
        }
    }
    printf("\n.......Top Three Player are........\n");
    for(int i=0;i<3;i++)
     {
     	printf("\nJersey Number : %d\n", plyarr[i].jNum);
	    printf("Player Name   : %s\n", plyarr[i].playerName);
		printf("Runs          : %d\n", plyarr[i].runs);
	    printf("Wickets       : %d\n", plyarr[i].wicket);
	    printf("Matches Played: %d\n", plyarr[i].matPlayed);
	    printf("\n");
	 }
}

/////////////////////////////////////////Sorting by run min/////////////////////////////////////////////////
void sortingPlayerByRunsMin(Player* plyarr,int ci)
{
	for(int j=0; j<ci-1; j++)
    {
        for(int i=0; i<ci-1-j; i++)
        {
            if(plyarr[i].runs > plyarr[i+1].runs)
            {
                Player temp = plyarr[i];
                plyarr[i] = plyarr[i+1];
                plyarr[i+1] = temp;
            }
        }
    }
    printf("\n.......Top Three Player are........\n");
    for(int i=0;i<3;i++)
     {
     	printf("\nJersey Number : %d\n", plyarr[i].jNum);
	    printf("Player Name   : %s\n", plyarr[i].playerName);
		printf("Runs          : %d\n", plyarr[i].runs);
	    printf("Wickets       : %d\n", plyarr[i].wicket);
	    printf("Matches Played: %d\n", plyarr[i].matPlayed);
	    printf("\n");
	 }
}

//////////////////////////////////////////sorting by run Max/////////////////////////////////////////////
void sortingPlayerByRunsMax(Player* plyarr,int ci)
{
	for(int j=0; j<ci-1; j++)
    {
        for(int i=0; i<ci-1-j; i++)
        {
            if(plyarr[i].runs < plyarr[i+1].runs)
            {
                Player temp = plyarr[i];
                plyarr[i] = plyarr[i+1];
                plyarr[i+1] = temp;
            }
        }
    }
  printf("\n.......Top Three Player are........\n");
   		 for(int i=0;i<3;i++)
     	{
     	printf("\nJersey Number : %d\n", plyarr[i].jNum);
	    printf("Player Name   : %s\n", plyarr[i].playerName);
		printf("Runs          : %d\n", plyarr[i].runs);
	    printf("Wickets       : %d\n", plyarr[i].wicket);
	    printf("Matches Played: %d\n", plyarr[i].matPlayed);
	    printf("\n");
		 }
}

///////////////////////////////////////////delete Player//////////////////////////////////////////////
void deletePlayer(Player* plyarr, int* ci, int jNum)
{
	int index= searchPlayerByjNum(plyarr,*ci, jNum);
			if(index!=-1)
			{
				while(index<(*ci-1))
				{
					plyarr[index]= plyarr[index+1];
					index++;
				}
				(*ci)--;
			}
			else
				printf("Not found");

}
/////////////////////////////////////////////update Player///////////////////////////////////////////
void updatePlayer(Player* plyarr, int* ci, int jNum,int updatechoice)
{
	int index= searchPlayerByjNum(plyarr,*ci, jNum);
			if(index!=-1)
			{
				if(updatechoice==1)
				{
				char newName[30];
				printf("Enter player's new name: ");
				scanf("%s",newName);
				strcpy(plyarr[index].playerName,newName);
				}
				else if(updatechoice==2)
				{
					int newRun;
					printf("Enter Playes's new Run: ");
					scanf("%d",&newRun);
					plyarr[index].runs=newRun;
				}
				else if(updatechoice==3)
				{
					int newWicket;
					printf("Enter Player's new wicket: ");
					scanf("%d",&newWicket);
					plyarr[index].wicket=newWicket;
				}
				else if(updatechoice==4)
				{
					int newMatchplayed;
					printf("Enter Player's new Matched played");
					scanf("%d",&newMatchplayed);
					plyarr[index].matPlayed=newMatchplayed;
				}
				else 
				{
					printf("...Invalid update player...");
					return;
				}
				
				printf("Player is succussfull update....\n");
			}
			else
				printf("player Not found");
	
}
//////////////////////////////////////display  Player///////////////////////////////////////////
void displayPlayer(Player* plyarr, int ci)
{
    printf("\n");
    printf("+------+-----------------+----------+----------+-----------------+\n");
    printf("| J.No | Player Name     | Runs     | Wickets  | Matches Played  |\n");
    printf("+------+-----------------+----------+----------+-----------------+\n");

    for(int i=0; i<ci; i++)
    {
        printf("| %-4d | %-15s | %-8d | %-8d | %-15d |\n",
               plyarr[i].jNum,
               plyarr[i].playerName,
               plyarr[i].runs,
               plyarr[i].wicket,
               plyarr[i].matPlayed);

        printf("+------+-----------------+----------+----------+-----------------+\n");
    }

    printf("                 Total Players : %d\n", ci);
}
//////////////////////////////////////////////////////////Manu Driven///////////////////////////////////////////////
int main()
{
	int capacity;
	int ci=0;
	
	printf("Enter initail capacity: ");
	scanf("%d",&capacity);
	  if(capacity < 4)
    {
        capacity = 4;
    }

	Player* plyarr = (Player*)malloc(capacity * sizeof(Player));
    storeHardcodedPlayer(plyarr, &ci);
	
	/////////////////******MANU******////////////////////
	
	while(1)
	{
		printf("\n=============================================");
		printf("\nEnter 1: Add Player \nEnter 2: Display Player \nEnter 3: Search Player \nEnter 4: Update Player \nEnter 5: Sort Player \nEnter 6: Delete Player \nEnter 7: Exit\n");
		printf("=============================================\n");
		int choice;
		scanf("%d",&choice);
		
		if(choice==1)
		{
			//Addplayer;
			Player ply;
			//printf("\nAdd New Player (jNum,PlayerName,Runs,Wicket,Match Played):\n");
			//scanf("%d%s%d%d%d",&ply.jNum,ply.playerName,&ply.runs,&ply.wicket,&ply.matPlayed);
			printf("Add new Player:\n");
			printf("jNum:");
			scanf("%d",&ply.jNum);
			printf("PlayerName: ");
			scanf("%s",ply.playerName);
			do
			{
				printf("Runs: ");
				scanf("%d",&ply.runs);
				if(ply.runs < 0)
				{
					printf("Runs cannot be negative!\n");
				}
			}while(ply.runs<0);
			do
			{
				printf("Wicket: ");
				scanf("%d",&ply.wicket);
				if(ply.wicket < 0)
				{
					printf("Wicket cannot be negative!\n");
				}
			}while(ply.wicket<0);
			do
			{
				printf("Match Played : ");
				scanf("%d",&ply.matPlayed);
				if(ply.matPlayed <=0)
				{
					printf("Match Played cannot be negative or Zero!\n");
				}
			}while(ply.matPlayed<=0);
			
			plyarr = addPlayer(plyarr, &ci, &capacity, ply);
			//printf("Player is successfully Added:");
		}
		else if(choice==2)
		{
			//displayPlayer
			//printf("Players are:\n ");
			displayPlayer(plyarr, ci);
		}
		else if(choice==3)
		{
			printf("Enter 1: Search by Jersey Number \nEnter 2: Search by Player Name\n");
			int Searchchoice;
			scanf("%d",&Searchchoice);
			if(Searchchoice==1)
			{
			//searchplayer  By jNumber;
			int jNum;
			printf("Enter jNum you want to search:\n");
			scanf("%d",&jNum);
			int index=searchPlayerByjNum(plyarr,ci,jNum);
				if(index==-1)
				{
						printf("Not Found");
				}
				else
				{
					printf("\nPlayer Found at : %d\n",index);
    				printf("Jersey Number : %d\n", plyarr[index].jNum);
    				printf("Player Name   : %s\n", plyarr[index].playerName);
    				printf("Runs          : %d\n", plyarr[index].runs);
    				printf("Wickets       : %d\n", plyarr[index].wicket);
    				printf("Matches Played: %d\n", plyarr[index].matPlayed);
    		    }
			}
			
			else if(Searchchoice == 2)
			{
   				 char playerName[30];

   				 printf("Enter playerName you want to search:\n");
   				 scanf("%s", playerName);

   				 searchPlayerByplayerName(plyarr, ci, playerName);
				}
		}
		else if(choice==4)
		{
			//updateplayer
			int jNum;
			int updatechoice;
			printf("Enter Jnum want to update:\n ");
			scanf("%d",&jNum);
			int index= searchPlayerByjNum(plyarr,ci,jNum);
			if(index==-1)
			{
				printf("\nPlayer not found");
			}
			else
			{
			printf("..what do you want to update..\n");
			printf("Enter 1: By PlayerName \nEnter 2: By Run \nEnter 3: By Wicket \nEnter 4: By Matched Played\n");
			scanf("%d",&updatechoice);
			updatePlayer(plyarr,&ci,jNum,updatechoice);
			}
		}
		else if(choice==5)
		{
			//sortingplayer;
			printf("Enter 1: Sort by Runs \nEnter 2: Sort by Wicket \n");
			int sortchoice;
			scanf("%d",&sortchoice);
			if(sortchoice==1)
			{
				printf("Enter 1: Min to Max \nEnter 2: Max to Min\n");
				int minmaxchoice;
				scanf("%d",&minmaxchoice);
				 if(minmaxchoice==1)
				{
				printf("Player sorted by runs Min to Max:");
				sortingPlayerByRunsMin(plyarr,ci);
			    }
			    else if(minmaxchoice==2)
			    {
			    printf("Player sorted by runs Max to Min:");
				sortingPlayerByRunsMax(plyarr,ci);
				}
			}		
			else if(sortchoice==2)
			{
				printf("Enter 1: Min to Max \nEnter 2: Max to Min\n");
				int minmaxchoice;
				scanf("%d",&minmaxchoice);
				 if(minmaxchoice==1)
				{
				printf("Player sorted by wicket Min to Max:");
				sortingPlayerByWicketMin(plyarr,ci);
			    }
			    else if(minmaxchoice==2)
			    {
			    printf("Player sorted by wicket Max to Min:");
				sortingPlayerByWicketMax(plyarr,ci);
				}
			}
		}
		else if(choice==6)
		{
			//deleteplayer;
			int jNum;
			printf("Enter playernumber you want to delete\n");
			scanf("%d",&jNum);
			deletePlayer(plyarr,&ci,jNum);
			printf("player is delete\n");

		}
		else if(choice==7)
		{
			break;
		}
		else
		{
			printf("Invalid choice");
		}
	}
	
}