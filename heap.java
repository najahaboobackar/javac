import java.util.ArrayList; // Import ArrayList
import java.util.Arrays;

import java.util.Collections;
import java.util.List; 
public class heap {
    List <Integer> heap=new ArrayList<>();
    public heap(){

    }
public heap(List<Integer>array){
    heap=array;
    buildHeap(array);
}
public void buildHeap(List<Integer>array){
    for(int i=heap.size()-1;i>0;i--){
        shiftDown(i);
    }
}
public void shiftDown(int curIdx){
    int leftidx=Left(curIdx);
    int endIdx=heap.size()-1;
    int idxshift;
    while(leftidx<=endIdx){
        int rightIdx=Right(curIdx);
        if(rightIdx<=endIdx && heap.get(rightIdx)<heap.get(leftidx)){
             idxshift=rightIdx;
        }
        else{
            idxshift=leftidx;
        }
        if(heap.get(idxshift)<heap.get(curIdx)){
            Collections.swap(heap, idxshift, curIdx);
            curIdx=idxshift;
            leftidx=Left(curIdx);
        }
        else{
            break;
        }
    }
}
public void Shiftup(int curIdx){
    int parentIdx=Parent(curIdx);
    while(curIdx>0 && heap.get(parentIdx)>heap.get(curIdx)){
        Collections.swap(heap, parentIdx, curIdx);
        curIdx=parentIdx;
        parentIdx=Parent(curIdx);
    }

}
public void peek(){
    System.out.println(heap.get(0));
}
public void remove(){
    Collections.swap(heap, 0, heap.size()-1);
    heap.remove(heap.size()-1);
    shiftDown(0);
}
public void Display(){
    int n=heap.size()-1;
    for (int i=0;i<n;i++){
        System.out.println(heap.get(i));
    }
}
public void Insert(int value){
    heap.add(value);
    Shiftup(heap.size()-1);
}
public int Parent(int i){
    return (i-1)/2;
}
public int Left(int i){
    return (2*i+1);
}
public int Right(int i){
    return (2*i+2);
}
public static void main(String [] argc){
    List <Integer> array=new ArrayList<>(Arrays.asList(5,9,7));
    heap h=new heap(array);
    h.Display();
    h.Insert(4);
    h.Insert(6);
    h.Insert(8);
    System.out.println("added");
    h.Display();
    h.remove();
    System.out.println("after removing root");
    h.Display();
    h.remove();
    System.out.println("after removing root");
    h.Display();

}
    
}
