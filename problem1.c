#include <stdio.h>
#include <stdbool.h>

int check(char *word){
 bool arr[255];                         ////the Ascii 
 int i=0;
 for(i = 0; i < sizeof(arr);i++){
   arr[i] = false;
 }

 for(i=0;i<sizeof(word);i++){
   if(arr[word[i]]== true){
     return false;
   }
   arr[word[i]] = true;
             
 }
}
int main(){
 
  printf("%d \n",check("Helo"));





}
