package lesson1;

public class lesson {
    public static void main(String[] args) {
int myNumber=5;
//System.out.print(myNumber);
//это разные дни
int differentDays=4;

byte myByte = -128;
byte myByte2 = 127;

short myShort= -32000;
short myShort2= 32000;

int myInteger= -2_000_000_000;
int myInteger2= 2_000_000_000;

long myLong = 2_100_000_000L;

float myFloat = 3.123456f;
     //   System.out.print(myFloat);
        double myDouble = 3.123456789123456789;
        //System.out.print(myDouble);

boolean myBoolean = true;
boolean myBoolean2 = false;

char letter  = 'a';
//System.out.println(letter = 1);

char[] myArray = new char[6];
myArray[3]= 'c';
myArray[4] = 'o';
myArray[5] = 'k';
myArray[1] = 'ч';
myArray[2] = 'е';
 //System.out.print(myArray);

 char [] myArray2 = myArray;
 myArray[4]= 'н';
 myArray[5]= 'o';
 //myArray[6]= 'k';
 //System.out.print(myArray2);

 Object user = new Object();
 Object user2 = user;
 //System.out.print(user);

 int testInt = 1000;
 int testInt2 = 13;

 double result = (testInt / (double) testInt2);

 //System.out.print(result);


String hi = "    Hello".trim();
String world = " woRld!".toLowerCase();
char newline = '\n';
String end = (hi + world + newline).repeat(3);
//System.out.print(end);

        int growth = 154;
        int weight = 44;
        double index =  (double)weight / (growth*2);
      //  System.out.printf("%.2f",index);

        char[] myArray3 = new char [6];
        myArray3[1] = 'a';
        myArray3[2] = 'b';
        myArray3[3] = 'c';
        myArray3[4] = 'd';
        myArray3[5] = 'e';

        char[] myArray4 = myArray3;
        myArray4[4]= 'h';
        System.out.println(myArray3);
        System.out.print(myArray4);








    }
}
