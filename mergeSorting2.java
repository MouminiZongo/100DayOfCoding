
import java.util.ArrayList;

import java.util.Scanner;

import java.util.Random;
public class mergeSorting2 {



    public static void main(String [] args ){

     int [] array  = {1,6,3,79,10,13};

      mergeSorting2  rd = new mergeSorting2();

      rd.Split(array,0,6);

    /**
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

       // Random rands= new Random();

        System.out.println("please enter 5 mnumbers .");

          for(int i =0;i<=4;i++){

             array.add(in.nextInt()) ;
             // rd.sorting(array);

          }

        System.out.println("the list before the sorting");
            display(array);
        System.out.println("___________________________________________________________");

          mergeSorting2 rd = new mergeSorting2();
          rd.sorting(array);

           display(array);

*/
    }


/**
    public static  void sorting(ArrayList<Integer> arr){
        int size = arr.size();
        if(size<=1) {
       return;
        }

            int mid = size/2;
            int rightSize= size-mid;

            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();

           for(int i = 0 ; i < mid;i++) {

               left.add(arr.get(i));


           }

             for(int j =mid; j<size;j++) {
                 right.add(arr.get(j));

             }
               sorting(left);
              sorting(right);
            merge(left,right,arr);







    }

    public static void  merge(ArrayList<Integer> left,ArrayList<Integer> right, ArrayList<Integer> arr){


    int i=0 , j=0, k=0;


    while(i< left.size()  && j < right.size()){


            if(left.get(i) < right.get(j)) {


                arr.set(k,left.get(i));
                i++;
                k++;

            }
            else{

                arr.set(k,right.get(j));

                j++;
                k++;


            }

    }


    while(i<left.size()){

        arr.set(k,left.get(i));
        i++;
        k++;
    }


    while(j<right.size()){


        arr.set(k,right.get(j));

        j++;
        k++;

    }

    }



   public static  void display(ArrayList<Integer> arr){

         for(int i =0 ; i< arr.size();i++){

             System.out.println(arr.get(i));

         }
   }
*/


public static void Split(int [] arr, int startInde,int endingIndex){

      int size = arr.length;

      if (size==1) {


          return;
      }

      int mid = startInde+(endingIndex-startInde)/2;

       Split(arr,startInde,mid);
       Split(arr,mid+1,endingIndex);

           merge(arr, mid, endingIndex);


      }
       public  static  void  merge(int []  array, int mid ,int end){
      int i=0,j=0,k=0;
        int leftsize= mid;
        int rightSize = end-mid;
        int [] left = new int[leftsize];

         int [] right = new  int[rightSize];

           while(i<left.length && j< right.length){


                   if (left[i] < right[j]) {

                       left[i] = array[k];
                       i++;
                       k++;

                   }

                  else{
                           right[j]= array[k];
                           j++;
                           k++;




                       }

           }


           while(i<left.length){

               left[i] = array[k];
               i++;
               k++;
           }

           while(j<right.length){

               right[j] = array[k];
               j++;
               k++;
           }
            for(int l = 0 ;l<array.length;l++)
           System.out.println(array[l]);
       }





}
