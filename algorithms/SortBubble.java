package algorithms;

public class SortBubble {


    public static void main(String [] arguments){
        int[] array = {5,2,9,0,-3};
        show(array);
        bubble(array);
    }

    public static void bubble(int[] array)
    {
        int quantity=array.length;
        for (int i=quantity; i>=0; i--)
        {
            for (int position=0;position<i-1;position++)
            {
                if(array[position] > array[position+1])
                {
                    swap(position,position+1,array);
                }
            }
            show(array);
        }
    }

    private static void swap(int pos1, int pos2, int[] array)
    {
        array[pos1]=array[pos1]+array[pos2];
        array[pos2]=array[pos1]-array[pos2];
        array[pos1]=array[pos1]-array[pos2];
    }

    private static void show(int[] array)
    {
        for(int value:array)
        {
            System.out.print(value+", ");
        }
        System.out.println("");
    }


}