import java.io.*;
import java.util.*;
public class Number
{
public static void main(String[] args)
{
int c= 0,n= 2207;
while(n!= 0)
{
 n/= 10;
 ++c;
 }
System.out.println("No. of digits: " + c);
}
}
