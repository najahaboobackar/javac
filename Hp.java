import java.util.ArrayList; // Import ArrayList
import java.util.Arrays;

import java.util.Collections;
import java.util.List; 

public class Hp {
    public Hp(){

    }
    List<Integer> heap=new ArrayList<>();
    public Hp(List<Integer> arr){
        heap=arr;
        BuildH(heap);
    }
    public void BuildH(List<Integer>arr){
        for(int i=heap.size()-1;i>0;i--){
            SD(i);
        }

    }
    public void SD(int ci){
        int li=L(ci);
        int i;
        int ei=heap.size()-1;
        while(li<=ei){
            int ri=R(ci);
            if(ri<=ei &&heap.get(ri)<heap.get(li)){
                 i=ri;
            }
            else{
                i=li;
            }
            if(heap.get(i)<heap.get(ci)){
                Collections.swap(heap, i, ci);
                ci=i;
                li=L(ci);
            }
            else{
                break;
            }
        }
    }
    public void SF(int ci){
        int pi=P(ci);
        while(ci>0 && heap.get(pi)>heap.get(ci)){
            Collections.swap(heap,pi,ci);
            ci=pi;
            pi=P(ci);
        }
    }
    public void Display(){
        int n=heap.size();
        for(int i=0;i<n;i++){
            System.out.println(heap.get(i));
        }
    }
    public int  L(int i){
        return (2*i+1);
    }
    public int R(int i){
        return (2*i+2) ;   }
        public int P(int i){
            return (i-1)/2;
        }
        public void Insert(int val){
            heap.add(val);
            SF(heap.size()-1);
        }
        public static void  main(String []argc){
            List <Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4));
            Hp h1=new Hp(arr);
            h1.Insert(5);
            h1.Insert(78);
            h1.Display();

        }
    
    
}
