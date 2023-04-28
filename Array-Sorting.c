#include <stdio.h>

void main ()
{
   int arr[20];
   int i, j, x, count;
   
   printf("Enter Count Of Elements.\n");
   scanf("%d", &count);
   
   printf("Enter the elements");
   for (i = 0; i < count; ++i)
   scanf("%d", &arr[i]);
      
   for (i = 0; i < count; ++i)
   {
      for (j = i + 1; j < count; ++j)
      {
         if (arr[i] > arr[j])
         {
            x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
         }
      }
   }
   printf("The Array In Ascending Order Is: ");
   for (i = 0; i < count; ++i)
   {
      printf("%d\t", arr[i]);
   }
}