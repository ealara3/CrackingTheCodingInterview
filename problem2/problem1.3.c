#include <stdio.h>


char* change(char *word){
  int i=0;
  int j=0;
  char hold;
  char hold2;
  char replace;
  for(i=0; i<sizeof(word);i++){
    if(word[i]==' '){
      
     
      word[i] = '%';
      for(j=i+1; j<sizeof(word);j++){
	 hold = word[j];
	 if((i+1) == j){
	   word[j] = '2';
	 }else if((i+2) == j){
	   word[j] = '0';
	 }else{
	   word[j]=hold;
	 }
	 
      }
    }
    
  }
  return word;
}
int main(){
  char word[9];
  word[0] = 'M';
  word[1] = 'r';
  word[2] = ' ';
  word[3] = 'J';
  word[4] = 'o'; 
  word[5] = 'h';
  word[6] = 'n';
  word[7] = ' ';
  word[8] = ' ';
  printf("%s\n",change(word));



}
