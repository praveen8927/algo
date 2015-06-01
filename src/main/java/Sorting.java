/**
 * Created by praveen.adlakha on 06/12/14.
 */
public class Sorting {

    public static void main(String[] args) {
        //insertion_sort();
        int[] a = {92,100,13,45,67,89,17,21};
        //quickSort sorter = new quickSort();
        SelectionSort sorter=new SelectionSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");

    }
    }

    public static class SelectionSort{
        public void sort(int inputArray[]){
            for(int i=0 ;i< inputArray.length;i++){
                for(int j=i+1; j < inputArray.length; j++){
                if(inputArray[i]>inputArray[j]){
                    int tmp = inputArray[j];
                    inputArray[j]=inputArray[i];
                    inputArray[i]=tmp;
                }
                }
            }
        }

    }

    public static void insertion_sort(){
        int[] a= {93,100,13,45,67};
        for (int i=0;i<a.length;i++){
            System.out.println("Before:" + a[i]);
        }
        for (int i=0; i<a.length ;i++){
            for(int j=i+1; j<a.length ; j++ ){
                if(a[i]>a[j]){
                    int p =a[i];
                    a[i]=a[j];
                    a[j]=p;
                }
            }
        }
        for (int i=0;i<a.length;i++){
        System.out.println("After:" + a[i]);
        }

    }
    public static class quickSort {
        private int array [];
        private int length;

        public void sort (int[] inputArr){

            if(inputArr == null || inputArr.length ==0) {return;}
            this.array=inputArr;
            length=inputArr.length;
            quickSort(0,length-1);
        }

        private void quickSort(int left,int right){
            int i =left,j=right;

            int pivot= array[(i+j)/2];

            while (i<j){
                while(array[i]<pivot){
                    i++;
                }
                while(array[j]>pivot) {
                    j--;
                }
                if(i<=j){
                    exchangeNumbers(i, j);
                }
                i++;
                j--;
            }
            if (left < j)
                quickSort(left, j);
            if (i < right)
                quickSort(i, right );
        }
        private void exchangeNumbers(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

}
