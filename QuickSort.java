public class QuickSort{
public static void main(String args[]){
Static void qsort(chatr items[]){
qs(items;0;items.length-1);
}
private static void qs(char item[],int left,int right)
{
int i,j;
char x,y;
i=left;j=right;
x=items[(left+right)/2];
do{
while((items[i]<x)&&(i<right))i++;
while((x<item[j]&&(j>left))j--;
if(i<=j){
y=items[i];
items[i]=items[j];
items[j]=y;
i++,j--;
}
}
while(i<=j);
if(left<j)qs(items,left,j);
if(i<right)qs(items,i,right);
}
}