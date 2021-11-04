import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {                                    //The_Main_Method
	    Scanner input=new Scanner(System.in);
		System.out.println(" For finding area : 1 \n For matrices : 2 \n For octal conversion : 3 \n For counting vowels : 4 ");
		int n1=input.nextInt();
		switch(n1){
		   case 1:
		        area();                                                         //goes to The_Area_Method
		        break;
		   case 2:                                                              //goes to The_Matrices_Method
		        matrices();
		        break;
		   case 3:                                                              //goes to The_Octal_Method
		       octal();
		       break;
		   case 4:                                                              //goes to The_Vowels_Method
		       vowels();
		       break;
		   default:
		   System.out.println("Invalid choice please try again ");
		   break;
		}
	}
	static void area(){                                                         //The_Area_Method
	    	Scanner input=new Scanner(System.in);
	    System.out.println(" For circle : 1 \n For rectangle : 2 \n For square : 3 \n");
	    int x=input.nextInt();
	    switch(x){
	        case 1:                                                             //Area of a circle
	            System.out.println("Enter the radius");
	            float r=input.nextFloat();
	            float a=r*22/7;
	            System.out.println("The area of the circle is  " + a );
	        case 2:                                                             //Area of a rectangle
	            System.out.println("Enter the rectangle length and width");
	            float l=input.nextFloat();
	            float w=input.nextFloat();
	            float b=l*w;
	            System.out.println("The area of the rectangle is  "+ b );
	        case 3:                                                             //Area of a square
	            System.out.println("Enter the length of the square");
	            float len=input.nextFloat();
	            float c=len*4;
	            System.out.println("The area of the square is   " + c );
	    }
	}
    static void matrices(){                                                     //The_Matrices_Method
        Scanner input=new Scanner(System.in);
        System.out.println(" For addition : 1 \n For subtraction : 2 \n For multiplication : 3 ");
        int x=input.nextInt();
        switch(x){
            case 1:                                                             //Matrices addition
              System.out.println("Enter the rows then the columns of the 2 matrices");
              int row=input.nextInt();
              int col=input.nextInt();
              int [][] a=new int[row][col];
              int [][] b=new int[row][col];
              System.out.println("Enter values of first matrix");
                for(int i=0;i<row;i++){
                  for(int j=0;j<col;j++){
                       a[i][j]=input.nextInt();
                  }
              }
              System.out.println("Enter values of second matrix");
              for(int i=0;i<row;i++){
                  for(int j=0;j<col;j++){
                      b[i][j]=input.nextInt();
                  }
              }
              int [][] sum=new int[row][col];
              for(int i=0;i<row;i++){
                  for(int j=0;j<col;j++){
                      sum[i][j]=a[i][j]+b[i][j];
                  }}
                  System.out.println("The sum is");
              for(int i=0;i<row;i++){
                  for(int j=0;j<col;j++){
                      System.out.print(sum[i][j] + "   ");
                  }
                  System.out.println();
              }  
              break;
            case 2:                                                             //matrices subtraction
                System.out.println("Enter the rows then the columns of the 2 matrices");
              int row1=input.nextInt();
              int col1=input.nextInt();
              int [][] a1=new int[row1][col1];
              int [][] b1=new int[row1][col1];
              System.out.println("Enter values of first matrix");
                for(int i=0;i<row1;i++){
                  for(int j=0;j<col1;j++){
                       a1[i][j]=input.nextInt();
                  }
              }
              System.out.println("Enter values of second matrix");
              for(int i=0;i<row1;i++){
                  for(int j=0;j<col1;j++){
                      b1[i][j]=input.nextInt();
                  }
              }
              int [][] sub=new int[row1][col1];
              for(int i=0;i<row1;i++){
                  for(int j=0;j<col1;j++){
                      sub[i][j]=a1[i][j]-b1[i][j];
                  }}
                  System.out.println("The subtraction matrix is");
              for(int i=0;i<row1;i++){
                  for(int j=0;j<col1;j++){
                      System.out.print(sub[i][j] + "   ");
                  }
                  System.out.println();
              }
            break;  
	}
}
    static void octal(){                                                        //The_Octal_Method
        Scanner input=new Scanner(System.in);
        System.out.println(" From decimal to octal : 1 \n From octal to decimal : 2");
        int x=input.nextInt();
        switch (x){
            case 1:                                                             //decimal to octal conversion
                System.out.println("Enter the decimal number");
	            int decimal=input.nextInt();
                int octalNumber = 0, i = 1;
                while (decimal != 0)
        {
                octalNumber += (decimal % 8) * i;
                decimal /= 8;
                i *= 10;
        }
                System.out.println("In octal \n"+ octalNumber);
                break;     
                 
            case 2:                                                             //octal to decimal conversion
                System.out.println("Enter the octal number");
                int octal=input.nextInt();
                int decimalNumber = 0, f = 0;

                while(octal != 0)
        {
                decimalNumber += (octal % 10) * Math.pow(8, f);
                ++f;
                octal/=10;
        }
                System.out.println("In decimal \n" + decimalNumber);
                break;
        }
    }
    static void vowels(){                                                       //The_Vowels_Method
        int count = 0;
        System.out.println("Enter a string to count the vowels");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
           char ch = sentence.charAt(i);
           if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
              count ++;
         } 
      }
      System.out.println("Number of vowels in the given string is "+count);
   }
}