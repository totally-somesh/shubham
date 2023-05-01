#include <stdio.h>

#define PI 3.14
void main()
{
    int radius, choice;
    printf("Please enter the radius of circle.\n");
    scanf("%d", &radius);
    
    printf("Press 1: Area Of Circle  2: Circumference Of Circle  3: Volume Of Sphere\n");
    scanf("%d", &choice);
    
    switch(choice)
    {
        case 1:
        float area;
        area = PI*radius*radius;
        printf("The Area Of The Circle Is : %f",area);
        break;
        
        case 2:
        float circumference;
        circumference = 2*PI*radius;
        printf("The Circumference Of The Circle Is : %f",circumference);
        break;
        
        case 3:
        float volume;
        volume = 4*PI*radius*radius*radius/3;
        printf("The Volume of the Sphere Is : %f",volume);
        break;
        
        default:
        printf("Invalid Entry.");
    }
}
