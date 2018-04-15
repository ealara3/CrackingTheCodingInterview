#include <stdio.h>

char* change(char *word){
  int i,j,l=0,c=0;
  char count[sizeof(word)];
  
  for(i=0;i<sizeof(word);i++){
    count[l]=word[i];
    for(j=0;j<sizeof(word);j++){
      if(count[i]==word[i]){
	c++;
      }
    }
    l++;
    count[l] =c;
    l++;
    i=i+(c-2);
    c=0;
  }
  word = count;
  return count;
}


int main(){
  char word[11] ={"aabcccccaaa"};

  printf("%s\n", change(word));

}
