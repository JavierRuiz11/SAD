#include <stdio.h>

int main(int argc, char const *argv[])
{
	int i;
	
	while (scanf("%d", &i) != EOF){
		

   fwrite(&i , sizeof(i) , 1 , stdout);


	}
}	
	



