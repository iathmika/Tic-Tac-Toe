import java.lang.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's play Tic Tac Toe!");
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    char a[][]=new char[3][3];
    int winner=0,post,pos2,pos3;
int pos;
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
a[i][j]='t';

    while(winner==0)
    {
System.out.println("Enter position for X");
pos=sc.nextInt();

switch(pos)
{
  case 1:
  if(a[0][0]=='t')
  a[0][0]='X';
  break;
  case 2:
  if(a[0][1]=='t')
  a[0][1]='X';
  break;
  case 3:
  if(a[0][2]=='t')
  a[0][2]='X';
  break;
  case 4:
  if(a[1][0]=='t')
  a[1][0]='X';
  break;
  case 5:
  if(a[1][1]=='t')
  a[1][1]='X';
  break;
  case 6:
  if(a[1][2]=='t')
  a[1][2]='X';
  break;
  case 7:
  if(a[2][0]=='t')
  a[2][0]='X';
  break;
  case 8:

  if(a[2][1]=='t')
  a[2][1]='X';
  break;
  case 9:
  if(a[2][2]=='t')
  a[2][2]='X';
  break;
  }
  
  pos2=r.nextInt(3);
  pos3=r.nextInt(3);
  while(a[pos2][pos3]!='t')
  {
    pos2=r.nextInt(3);
    pos3=r.nextInt(3);
  }
 a[pos2][pos3]='0';

   for(int i=0;i<3;i++)
   {
     if(a[i][0]==a[i][1] && a[i][2]==a[i][1] && a[i][0]!='t') {
     winner =2;
     System.out.println("Winner");
     break;}
     else if(a[0][i]==a[1][i] && a[0][i]==a[2][i] && a[0][i]!='t') {
       System.out.println("Winner");
     winner =2;
     break;}
   }
 
  if(a[0][0]==a[1][1] && a[1][1]==a[2][2] && a[1][1]!='t')
  {
    System.out.println("Winner");
  winner =2;
  }
  
  for(int i=0;i<3;i++)
  {
    for(int j=0;j<3;j++)
    {
      if(a[i][j]!='t')
      {
        System.out.print(" |"+a[i][j]);
      }
      else
      System.out.print(" |");
      
    }
    System.out.println();
  }
    }
  }
}
    

    
 