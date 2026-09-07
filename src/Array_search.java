import java.util.ArrayList;

public class Array_search {
    public static void main (String[] args){
        int [] arr = {1,3,6,18,24,55};
        int [] arr1 ={1,3,6,7,8 ,8 ,56};
        System.out.println(findIndex(arr , 18 , 0));
        System.out.println(findIndx1(arr , 18,0));
        System.out.println(findIndexLast(arr,18, arr.length-1));
        findIndex2(arr1 , 8 , 0);
        System.out.println(list);
    }

    static boolean findIndex(int [] arr , int target , int i){
        if( i == arr.length){
            return false;
        }
        return arr[i] == target || findIndex(arr , target , i+1);
    }

    static int findIndx1(int [] arr, int target , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return target;
        }
        else{
            return findIndx1(arr, target,i+1);
        }
    }

    static int findIndexLast(int [] arr, int target , int i){
        if(i ==-1){
            return -1;
        }
        if (arr[i] == target ){
            return target;
        }

        return findIndexLast( arr , target , i -1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndex2( int [] arr1 , int target, int i){
        if(i == arr1.length){
            return;
        }
        if(arr1[i] == target){
            list.add(i);
        }
        findIndex2(arr1 , target,i+1 );
    }
}
