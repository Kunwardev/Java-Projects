/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch4Question3
{
    private static int splitindex(int[] arr){
        return(arr.length/2);
    }
//Copying the array again and again is waste of time and memory... Also showing double values
    private static Tree Function(Tree root, int[] arr){
        int index = splitindex(arr);
        if(root == null )
            root = new Tree(arr[index]);
        if(arr.length > 1){
        int L[] = new int[arr.length/2];
        int R[] = new int[arr.length - arr.length/2];
        for(int i=0;i<arr.length/2;i++){
            L[i] = arr[i];
            //System.out.println(L[i]);
        }
        for(int i=0;i<arr.length - arr.length/2;i++){
            R[i] = arr[i+arr.length/2];
            //System.out.println(R[i]);
        }
        root.left = Function(root.left, L);
        root.right = Function(root.right, R);
        }
        return root;
    }
    
    /*
    private static void SplitArrays(int[] arr){
        if(arr.length == 1)
            return;
        int index = splitindex(arr);
        int L[] = new int[arr.length/2];
        int R[] = new int[arr.length-arr.length/2];
        for(int i=0;i<arr.length/2;i++){
            L[i] = arr[i];
            System.out.println(L[i]);
        }
        System.out.println("");
        for(int i=0;i<arr.length - arr.length/2;i++){
            R[i] = arr[i+arr.length/2];
            System.out.println(R[i]);
        }
    }
    */
    private static Tree optimizedFunction(int arr[],int start,int end){
        if(start > end)
            return null;
        int mid = (start + end)/2;
        Tree root = new Tree(arr[mid]);
        root.left = optimizedFunction(arr, start, mid-1);
        root.right = optimizedFunction(arr, mid+1, end);
        return root;
    }
    
    private static void inOrder(Tree root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }
    
    public static void main(String[] args)
    {
        Tree root;
        int arr[] = new int[]{1,2,3,4,8,9};
        root = optimizedFunction(arr, 0, arr.length-1);
        //SplitArrays(arr);
        inOrder(root);
    }
    
}
