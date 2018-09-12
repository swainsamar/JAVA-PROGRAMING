class ArrayRemoveValue{
public static void main(String[] args){
int ia[]={3,4,5,6,7,8};
System.out.println("Second index value ia[2]="+ia[2]);
//Replace second index 
ia[2]=15;
System.out.println("replace second index value ia[2]="+ia[2]);
int ia1[]=new int[ia.length-1];
int m=0;
// remove second index value
for(int i=0;i<ia.length;i++){
if(ia[i]==ia[2])
{}
else{
ia1[m]=ia[i];
m++;
}
}
System.out.println("******************************");
System.out.println("Remove second index value");
display(ia1);
}
static void display(int ia[]){
for(int i=0;i<ia.length;i++){
System.out.println("Value"+(i+1)+":"+ia[i]);
}
System.out.println("*******************************");
}
}
