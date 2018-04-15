#include <stdio.h>
#include <stdbool.h>

bool palindrome(char *word){
  int i=0; 
  int j=(sizeof(word)-2);
  // printf("hello %c %c %d \n", word[i],word[j],j );
  while(j !=i){
    if(word[i] != word[j]){
      return false;
    }
    j--;
    i++;


  }


}

int main(){
  char *word = {"tacocat"};

  printf("%d\n", palindrome(word));


}
