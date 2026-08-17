#include <stdio.h>
#include <string.h>

typedef struct Movie
{
    char title[10];
    char direct[10];
    int year;
    char gener[10];
} Movie;

void updateMovie(Movie* mov, int ci, char* title)
{
	
		int index=searchMovie(mov,ci,title);
			if(index!=-1)
			{
				printf("\nEnter new title and director :");
				scanf("%s%s",mov[index].title,&mov[index].direct);
				printf("update successful");
			}
			else
				printf("Not found");
}
int searchMovie(Movie* mov, int ci, char* title)
{
    for(int i = 0; i < ci; i++)
    {
        if(strcmp(mov[i].title, title) == 0)
            return i;
    }

    return -1;
}


void addMovie(Movie* mov, int* ci, Movie nmov)
{
    if(*ci == 10)
    {
        printf("Array full\n");
        return;
    }

    mov[*ci] = nmov;
    (*ci)++;
}

void storeMovieHardcode(Movie* mov, int* ci)
{
    strcpy(mov[*ci].title, "DDLJ");
    strcpy(mov[*ci].direct, "Aditya");
    mov[*ci].year = 1995;
    strcpy(mov[*ci].gener, "Rom");
    (*ci)++;

    strcpy(mov[*ci].title, "Lagaan");
    strcpy(mov[*ci].direct, "Ashut");
    mov[*ci].year = 2001;
    strcpy(mov[*ci].gener, "Sport");
    (*ci)++;

    strcpy(mov[*ci].title, "PK");
    strcpy(mov[*ci].direct, "Rajk");
    mov[*ci].year = 2014;
    strcpy(mov[*ci].gener, "Come");
    (*ci)++;

    strcpy(mov[*ci].title, "Dhoom");
    strcpy(mov[*ci].direct, "Sanj");
    mov[*ci].year = 2004;
    strcpy(mov[*ci].gener, "Act");
    (*ci)++;

    strcpy(mov[*ci].title, "Raazi");
    strcpy(mov[*ci].direct, "Megh");
    mov[*ci].year = 2018;
    strcpy(mov[*ci].gener, "Thr");
    (*ci)++;
}

void displayMovie(Movie* mov, int ci)
{
    for(int i = 0; i < ci; i++)
    {
        printf("Title:      %s\n", mov[i].title);
        printf("Director:   %s\n", mov[i].direct);
        printf("Year:       %d\n", mov[i].year);
        printf("Genre:      %s\n", mov[i].gener);
        printf("\n");
    }
}


int main()
{
    Movie mov[10];
    int ci = 0;
    int choice;
    storeMovieHardcode(mov, &ci);

    while(1)
    {
        printf("\nEnter 1: Add Movie \nEnter 2: Display \nEnter 3: Search Movie \nEnter 4: Upadte \nEnter 5: Exit");
        printf("\nEnter choice: ");
        scanf("%d", &choice);
        if(choice == 1)
        {
            Movie nmov;

            printf("Add movie: title, director, year and genre:\n");

            scanf("%s%s%d%s",
                  nmov.title,
                  nmov.direct,
                  &nmov.year,
                  nmov.gener);

            addMovie(mov, &ci, nmov);
        }
        else if(choice == 2)
        {
            printf("\nMovies are:\n");

            displayMovie(mov, ci);
        }


        else if(choice == 3)
        {
            char title[10];

            printf("Enter title you want to search: ");
            scanf("%s", title);

            int index = searchMovie(mov, ci, title);

            if(index != -1)
            {
                printf("%s found at %d index\n",
                       mov[index].title,
                       index);
            }
            else
            {
                printf("Not found\n");
            }
        }
        else if(choice == 4)
        {
           char title[10];
				printf("Enter title you want update ");
				scanf("%s",title);
				updateMovie(mov,ci,title);
        }
        else if(choice==5)
        {
          break;
        }
        else
        {
        	  printf("Invalid choice\n");
		}
    }
}