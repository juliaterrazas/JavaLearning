import java.util.*;
import java.io.*;
class Nde{
    Nde left,right;
    int data;
    Nde(int data){
        this.data=data;
        left=right=null;
    }
}


public class Trees {
    public static int getHeight(Nde root){
        //Write your code here
        int heightleft=0;
        int heightright=0;
        if(root.left!=null){
            heightleft=getHeight(root.left)+1;
        }
        if(root.right!=null){
            heightright=getHeight(root.right)+1;
        }
       // System.out.println(heightleft+" "+heightright);
        return (heightleft>heightright?heightleft:heightright);
    }

    public static Nde insert(Nde root,int data){
        if(root==null){
            return new Nde(data);
        }
        else{
            Nde cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Nde root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
