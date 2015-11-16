package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        
     int[][]arr = new int[5][];// 5 колличество элементов
     for(int i =arr.length-1; i >= 0; i-- ){
         arr [i] = new int[i+1];//второй массив , который в начале пустой
         for(int j =arr[i].length-1; j >=0; j--){
         if(j == arr[i].length-1){
             int x = arr.length - arr[i].length;
             for(int t = 0; t < x;t++){
             System.out.print(" ");
         }
         }
             System.out.print(arr[i][j]);
           
         }
         System.out.println();
    }
  
    
    String a = "Hello";
    String b = "Hllo";
    if(a == b){
        System.out.println("equivalent");
    }
    if(a.equals(b)){
        System.out.println("+");
        
    }
  
    
    
    }
    
}
