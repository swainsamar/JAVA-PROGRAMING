class ArrayPrinter{
static void print(int[] ia){
System.out.println("No of values available:"+ia.length);
System.out.println("array values:");
for(int i=0;i<ia.length;i++){
System.out.println("value"+(i+1)+":"+ia[i]);
}
}
}





class ArrayPrinterTest
{
public static void main(String[] args)
{
int[] ia={5,6,7,8,9};

ArrayPrinter.print(ia);
}
}

