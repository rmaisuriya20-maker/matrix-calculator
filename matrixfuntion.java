class matrixfuntion{

public static void sum( double mat1[][], double mat2[][]){
       
        int n = mat1.length;
        int m = mat1[0].length;
      double[][] mat3 = new double[n][n];
      if(mat1.length != mat2.length || mat1[0].length != mat2[0].length){
        System.err.println("error!! the matrix must be of same order");
        return;
      }
        for(int i=0; i < n ; i++){
            for(int j=0; j<m; j++){

                mat3 [i][j] = mat1[i][j] + mat2[i][j];
                System.err.print(mat3[i][j] + "|");
            }
            System.err.println();
        }

    
    } 
public static void diff( double[][] mat1, double[][] mat2){
    int n = mat1.length;
    double[][] mat3 = new double[n][n];

    for(int i=0; i < n ; i++){
        for(int j=0; j<n; j++){

        mat3 [i][j] = mat1[i][j] - mat2[i][j];
        System.err.print(mat3[i][j] + "|");

        }
            System.err.println();
    }
}   
public static void product(double[][] mat1 , double[][] mat2){

    int r = mat1.length;
    int c = mat2[0].length;
    int n = mat1[0].length;
        
    double[][] mat3 =new double[r][c];

    for(int i = 0; i < r ; i++){
        for (int j = 0; j < c; j++ ){
            for(int k=0; k< n; k++)

             mat3 [i][j] += mat1[i][k]* mat2[k][j];

            }
    }
    for(int i = 0; i < r ; i++){
        for (int j = 0; j < c; j++ ){

            System.out.print(mat3[i][j] + "|");

                }

            System.err.println();
    }
}        
public static void determent(double[][] mat1,int n){

    double detA =0;
    if(n == 2) {
        detA = mat1[0][0]*mat1[1][1]-mat1[0][1]*mat1[1][0];
    }else if(n ==3){
     
    detA = mat1[0][0]*(mat1[1][1]*mat1[2][2]-mat1[1][2]*mat1[2][1])-mat1[0][1]*(mat1[1][0]*mat1[2][2]-mat1[1][2]*mat1[2][0])+mat1[0][2]*(mat1[1][0]*mat1[2][1]-mat1[1][1]*mat1[2][0]);
    }
    System.err.println("det of matrix is " +detA);
}
public static void jacobis_iterations(float a1,float a2,float a3,float a4,float b1,float b2,float b3,float b4,float c1,float c2,float c3,float c4, int iterations){
    
    float x = 0,y = 0 ,z = 0;
    System.err.println("x\t\ty\t\tz");
    do{
    float x1 = (a4 - a2 * y - a3 * z)/a1;
    float x2 = (b4 - b1 * x - b3 * z)/b2;
    float x3 = (c4 - c1 * x - c2 * y)/c3;

    x = x1;
    y = x2;
    z = x3;

    System.out.printf("%.6f %.6f %.6f", x,y,z);

    iterations--;

    }while(iterations != 0);
}
public static void gauss_seidel_iterations(float a1,float a2,float a3,float a4,float b1,float b2,float b3,float b4,float c1,float c2,float c3,float c4, int iterations){
    
    float x = 0,y = 0 ,z = 0;
    System.err.println("x\t\ty\t\tz");
    do{
    float x1 = (a4 - a2 * y - a3 * z)/a1;
    float x2 = (b4 - b1 * x1 - b3 * z)/b2;
    float x3 = (c4 - c1 * x1 - c2 * x2)/c3;

    x = x1;
    y = x2;
    z = x3;

    System.err.printf("%.6f %.6f %.6f \n", x,y,z);

    iterations--;

    }while(iterations != 0);
}
}
