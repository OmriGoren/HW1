import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftRight(int[] arr,int move)
    {
        int temp;
        for(int i=0;i<move;i++)
        {
            temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
    }

    public static int[] shiftLeft(int[] arr,int move)
    {
        int temp;
        for(int i=0;i<move;i++)
        {
            temp=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }



    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (direction == 'R') {
            if (move < 0) 
            {
                move = -move;
                return shiftLeft(array, move);
            } 
            else 
            {
                return shiftRight(array, move);
            }
        } 
        else if (direction == 'L') {
            if (move < 0) 
            {
                move = -move;
                return shiftRight(array, move);
            } 
            else 
            {
                return shiftLeft(array, move);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}