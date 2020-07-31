import java.util.ArrayList;

public class 旋转矩阵 {
    /*
     * (top,left)       (top,right)
     *
     * (bottom,left)    (bottom,right)
     * */
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        ArrayList<Integer> integers = printMatrix(arr);
        for(Integer x:integers){
            System.out.println(x);
        }
    }


    public static ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(array==null ||array.length==0) return result;
        int row=array.length;
        int cel=array[0].length;
        int top=0,left=0;
        int bottom=row-1;
        int right=cel-1;
        while(left<=right && top<=bottom){
            for(int i=top;i<=bottom;i++){
                result.add(array[i][left]);
            }
            for(int i=left+1;i<=right;i++){
                result.add(array[bottom][i]);
            }
            for(int i=bottom-1;i>top;i--){
                result.add(array[i][right]);
            }
            for(int i=right;i>left;i--){
                result.add(array[top][i]);
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return result;
    }

}
