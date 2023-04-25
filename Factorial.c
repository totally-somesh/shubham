#include <stdio.h>

int main()
{
    int n;
    int factorial = 1;
    char ch;
    
    
    printf("Enter A Number.\n");
    scanf("%d",&n);
    
    if(n > 0)
    {
        int i;
        for (i=1; i<=n; i++)
        {
            factorial = factorial*i;
        }
        
        printf("%d",factorial);
    }
    else if (n <= 0)
    {
        printf("Invalid Entry.");
    }
}
