///For and Foreach

val num=0;
for(i in 0..10){
  println("Number : ${num++} ") }

val arr=ArrayList<Int>()
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4);

for(i in arr){
  println(i);}

//want to print 0 to 9 then  0 until 10
//want to increment from 2 then 0..10 step2 (0,2,4,6,8,10)


///While
var nums=10;
while(nums<20){
  println(nums) nums++;
}

///Do While
var numm=10;
do{
  println("$numm")}
while(numm>10){
  numm++;}
