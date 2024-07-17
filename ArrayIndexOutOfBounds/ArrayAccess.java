package ArrayIndexOutOfBounds;

import java.util.Scanner;

public class ArrayAccess {
    private int[] num = {1,2,3,4,5};
    public void accessElement(){
 Scanner scanner= new Scanner(System.in);
boolean vaidIndex=false;
while(!vaidIndex){
    System.out.println("Enter an index to access (0 to"+(num.length-1)+"");
int index= scanner.nextInt();
try {
   System.out.println("Element at index "+index+":"+num[index]);
 vaidIndex=true;
} catch (ArrayIndexOutOfBoundsException
        e) {
    System.out.println("Invalid Index");
}
}
scanner.close();
    }

    public static void main(String[] args) {
        ArrayAccess arrayAccess= new ArrayAccess();
        arrayAccess.accessElement();
    }

}
