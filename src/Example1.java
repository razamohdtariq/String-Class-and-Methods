
public class Example1 {
public static void main(String args[])
{
String str1 = "Computer";
String str2 = "Computer";
String str3 = new String("Computer");
System.out.println("Result1:"+(str1==str2));
System.out.println("Result2:"+str1.equals(str2));
System.out.println("Result3:"+(str1==str3));
System.out.println("Result4:"+str1.equals(str3));
}

}
