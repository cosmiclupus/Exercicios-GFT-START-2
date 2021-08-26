#include <stdio.h>
#include <stdlib.h>


int main() {
 

  int ini,fim,auxini,auxfim;

  printf("Digite dois valores:");
  scanf("%d %d",&ini,&fim);//Leitura de valores

  if(fim<ini){//verificando se fim menor que inicio
    do{
      printf("Digite 2 valores novamente: ");
      scanf("%d %d",&ini,&fim);
     
    } while(fim<ini);//enquanto não for válido irá ficar lendo inicio e fim
  }
  

if(ini %2 != 0){//caso for ímpar,auxini irá receber a variavel ini,somar +1,printar a mesma e depois somar 2 a ela
  auxini= ini;
  auxini=auxini+1;
  while(auxini <= fim){
    printf("%d\t",auxini);
    auxini+=2;
  }
}

else{//caso for par,auxini irá receber ini,printar e depois ir incrementando de 2 em 2

  auxini= ini;

  while(auxini <= fim){
    printf("%d\t",auxini);
    auxini=auxini+2;
  }
}

}
 
