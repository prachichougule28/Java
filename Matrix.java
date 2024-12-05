import java.util.*;
class Matrix
{
  Scanner sc=new Scanner(System.in);
  int row;
  int col;
  int [][]m1;
  int [][]m2;
  int [][]m3;
 
  
  Matrix(int r,int c)
  {
    row=r;
    col=c;
    m1=new int[row][col];
    m2=new int[row][col];
    m3=new int[row][col];
  }
 
  
  void getMatrix1()
  {
       System.out.print("Enter matrix 1 elemnets :-");       
       for(int i=0;i<row;i++)
       { 
         for(int j=0;j<col;j++)
          {
            m1[i][j]=sc.nextInt();
          }
       }
      System.out.print("matrix 1 elemnets are :-\n");    
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {         
            System.out.print(m1[i][j]+"\t" ); 
          }
          System.out.print("\n" ); 
      }   
   }   

   void getMatrix2()
  {
       System.out.print("Enter matrix 2 elemnets :-");       
       for(int i=0;i<row;i++)
       { 
         for(int j=0;j<col;j++)
          {
            m2[i][j]=sc.nextInt();
          }
       }
      System.out.print("matrix 1 elemnets are :-\n");    
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {         
            System.out.print(m2[i][j]+"\t" ); 
          }
          System.out.print("\n" ); 
      }   
   }      
   void addtion()
   {
       System.out.print("Addition of matrix :-\n");      
          for(int i=0;i<row;i++)
          {
             for(int j=0;j<col;j++)
             {
               m3[i][j]=m1[i][j]+m2[i][j];
               System.out.print(m3[i][j]+"\t" ); 
              }
              System.out.print("\n" ); 
          }       
    }
   void subtraction()
   {
       System.out.print("\nSubtraction of matrix :-\n");      
          for(int i=0;i<row;i++)
          {
             for(int j=0;j<col;j++)
             {
               m3[i][j]=m1[i][j]-m2[i][j];
               System.out.print(m3[i][j]+"\t" ); 
              }
              System.out.print("\n" ); 
          }       
    }
    void transpose()
    {
       System.out.print("\nTranspose of 1st matrix :-\n");      
          for(int i=0;i<row;i++)
          {
             for(int j=0;j<col;j++)
             {
               m3[i][j]=m1[j][i];
               System.out.print(m3[i][j]+"\t" ); 
              }
              System.out.print("\n" ); 
          }       
    }
   void multiplication()
   {
       System.out.print("\nMultiplication matrix :-\n");  
          for(int i=0;i<row;i++)
          {
             for(int j=0;j<col;j++)
             { 
                  m3[i][j]=0; 
                  for(int k=0;k<col;k++) 
                {
                  m3[i][j]+=m1[i][k]*m2[k][j];
                }
             }
           }     

         for(int i=0;i<row;i++)
          {
             for(int j=0;j<col;j++)
             {
               System.out.print(m3[i][j]+"\t" ); 
              }
              System.out.print("\n" ); 
          }         
    }

   void scalerMultiplication()
   {   
       System.out.print("Enter scaler value :- ");
       int scaler=sc.nextInt();
       System.out.print("\nScaler multiplication of matrix :-\n");      
          for(int i=0;i<row;i++)
          {
             for(int j=0;j<col;j++)
             {
                  m3[i][j]=m1[i][j]*scaler;
                  System.out.print(m3[i][j]+"\t" ); 
                }
                System.out.print("\n" ); 
          }       
    }

}

class MatrixTest
{
  public static void main(String [] arg)
  {
 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter rows and clomn no of 1st matrix :-" ); 
      int r1=sc.nextInt();
      int c1=sc.nextInt();

      System.out.println("Enter rows and clomn no of 2nd matrix :-" ); 
      int r2=sc.nextInt();
      int c2=sc.nextInt();

       Matrix M=new Matrix(r1,c1);
       M.getMatrix1();
       M.getMatrix2();
       M.addtion();
       M.subtraction();
       M.multiplication();
       M.transpose();
       M.scalerMultiplication();
   }
}
