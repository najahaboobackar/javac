import java.io.*;
import java.util.*;

public class String1 {
    public void Encrypter(String name,int key){
        int nkey= key%26;
        char [] arr=new char[name.length()];
        for(int i=0;i<name.length();i++){
            int letterpos=name.charAt(i)+nkey;
            if(letterpos<122){
                arr[i]=(char)letterpos;
            }
            else{
                arr[i]=(char)(96+letterpos%122);
            }

        }
        for(int i=0;i<name.length();i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String []argc){
        String1 s1=new String1();
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter name");
    s=sc.nextLine();
    s=s.toLowerCase();
    s1.Encrypter(s, 30);
    
    
    }



}
