#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool change(char s1[], char s2[]){
  int i,j;
  int length,differences;
  if(sizeof(s1) != sizeof(s2)){
    length = (strlen(s1) <strlen(s2))? strlen(s1) : strlen(s2);
  }else{
    length = strlen(s1)-1;
    printf("%d", length);
  }
    for(i=0; i<sizeof(s1); i++){
      for(j=0; j<sizeof(s2); j++){
	if(s1[i] == s2[j]){
	  differences++;
	  break;
	}
      }
    }
    printf("[ %d%d ]", length,differences);
    if(differences== length){
      return true;
    }else{
      return false;
    }

}
int main(){
  char s1[4]={"pale"};
  char s2[4]={"bale"};
  printf("%d\n", change(s1,s2));


}
