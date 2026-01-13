import java.util.Scanner;



public class matrix {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        // declatarion....    
                double [][] mat1 = null;
                double [][] mat2 = null;
                int r1 = 0, col1 = 0 ;
                float a1, a2, a3, b1, b2, b3, c1, c2, c3, a4, b4, c4;
                int iterations,n;
                boolean retry = true;


        do{
        
        System.err.println("----------------------------------------");
        System.err.println("choose the operation ypu want to perform");
        System.err.println("----------------------------------------");
        System.err.println("""
                1 -> sum of the matrices
                2 -> difference of 2 matrices
                3 -> product of 2 matrices
                4 -> determent of matrix
                5 -> jacobi's iteration
                6 -> gauss seidel iteration
                """);

                int choice = sc.nextInt();

            
            switch(choice){
                
/* sum */                     case 1 :
        

        System.out.println("Please enter the no of rows for mat 1 : ");
        r1 = sc.nextInt();
        System.out.println("Please enter the no of columns for mat 1 : ");
        col1 = sc.nextInt();
        mat1 = new double[r1][col1];
        mat2 = new double[r1][col1];
        

         for(int i=0; i < r1 ; i++){
            for(int j=0; j<col1 ; j++){

                System.err.println("enter the values of matrix 1 :");
                mat1[i][j] = sc.nextDouble();
            }
            }
         for(int i=0; i < r1 ; i++){
            for(int j=0; j<col1 ; j++){

                System.err.println("enter the values of matrix 2 :");
                mat2[i][j] = sc.nextDouble();
            }
            }
            matrixfuntion.sum(mat1, mat2);
            break;
            
            //diff
/*subtraction */              case 2 :
        
         ;

        System.out.println("Please enter the no of rows for mat 1 : ");
        r1 = sc.nextInt();
        System.out.println("Please enter the no of columns for mat 1 : ");
        col1 = sc.nextInt();
        mat1 = new double[r1][col1];
        mat2 = new double[r1][col1];
        

         for(int i=0; i < r1 ; i++){
            for(int j=0; j<col1 ; j++){

                System.err.println("enter the values of matrix 1 :");
                mat1[i][j] = sc.nextDouble();
            }
            }
         for(int i=0; i < r1 ; i++){
            for(int j=0; j<col1 ; j++){

                System.err.println("enter the values of matrix 2 :");
                mat2[i][j] = sc.nextDouble();
            }
            }
            matrixfuntion.diff(mat1, mat2);
            break ;

/* product */                 case 3 :

        System.out.println("Please enter the no of rows for mat 1 : ");
        r1 = sc.nextInt();
        System.out.println("Please enter the no of columns for mat 1 : ");
        col1 = sc.nextInt();
        mat1 = new double[r1][col1];
        mat2 = new double[r1][col1];
        

         for(int i=0; i < r1 ; i++){
            for(int j=0; j<col1 ; j++){

                System.err.println("enter the values of matrix 1 :");
                mat1[i][j] = sc.nextDouble();
            }
            }
         for(int i=0; i < r1 ; i++){
            for(int j=0; j<col1 ; j++){

                System.err.println("enter the values of matrix 2 :");
                mat2[i][j] = sc.nextDouble();
            }
            }
            matrixfuntion.product(mat1, mat2);
            break;

/*det */                      case 4 :

        System.err.println(" Enter the order of the matrix u would like:  ");
        n = sc.nextInt();

        mat1 = new double[n][n];

        if ( n == 2 || n == 3){

            for( int i = 0 ; i < n ; i ++){
            for ( int j = 0 ; j < n ; j ++){
                System.err.println("enter the elements of the matrix ");

                mat1[i][j] = sc.nextDouble();

            }
        }
        matrixfuntion.determent(mat1,n);
        }
        else{
            System.err.println("Determent of this order is not available");
        }
        break;

/* jacobi's iteration */      case 5 :


        System.out.println("Enter all values for coefficients of first equation (a1 a2 a3 a4):");
        a1 = sc.nextFloat();
        a2 = sc.nextFloat();
        a3 = sc.nextFloat();
        a4 = sc.nextFloat();

        System.out.println("Enter all values for coefficients of second equation (b1 b2 b3 b4):");
        b1 = sc.nextFloat();
        b2 = sc.nextFloat();
        b3 = sc.nextFloat();
        b4 = sc.nextFloat();

        System.out.println("Enter all values for coefficients of third equation (c1 c2 c3 c4):");
        c1 = sc.nextFloat();
        c2 = sc.nextFloat();
        c3 = sc.nextFloat();
        c4 = sc.nextFloat();

        System.out.print("Enter number of iterations to be performed: ");
        iterations = sc.nextInt();

        matrixfuntion.jacobis_iterations(a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,iterations);

        break;


/* gauss_seidel_iterations */ case 6 :

            System.out.println("Enter all values for coefficients of first equation (a1 a2 a3 d1):");
        a1 = sc.nextFloat();
        a2 = sc.nextFloat();
        a3 = sc.nextFloat();
        a4 = sc.nextFloat();

        System.out.println("Enter all values for coefficients of second equation (b1 b2 b3 d2):");
        b1 = sc.nextFloat();
        b2 = sc.nextFloat();
        b3 = sc.nextFloat();
        b4 = sc.nextFloat();

        System.out.println("Enter all values for coefficients of third equation (c1 c2 c3 d3):");
        c1 = sc.nextFloat();
        c2 = sc.nextFloat();
        c3 = sc.nextFloat();
        c4 = sc.nextFloat();

        System.out.print("Enter number of iterations to be performed: ");
        iterations = sc.nextInt();

        matrixfuntion.gauss_seidel_iterations(a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, iterations);

            case 7 : retry = false;

            default : System.err.println("this option does not exist");
                  System.err.println(" please try a valid option ");

        }


      
     
    }while( retry != false);

    sc.close();

    }
}