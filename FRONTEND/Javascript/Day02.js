// let age = 16;
// if(age >= 18){
//     console.log("Adult");
// }else {
//     console.log("Not Adult");
// }


let marks = 85;
if(marks >= 90){
    console.log("A grade");
}else if(marks >= 75){
    console.log("B Grade");
}else{
    console.log("C grade");
}

let day = 3;
switch(day){
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    default:
        console.log("Invalid Day");            
}

let age = 16;
let result = age >= 18 ? "Adult" : "Not Adult"
console.log(result);


if(""){
    console.log("This code won't run");
}else{
    console.log("This code will be run");
}

for(let i= 1; i<=5; i++){
    if(i ==3){
        break;
    }
    console.log(i);
}

// output 1, 2


for(let i=1; i<=5; i++){
    console.log(i);
}

console.log("While loop");

let count = 1;
while(count <= 5){
    console.log(count);
    count++;
}

console.log("do while loop");
let i = 1;
do {
    console.log(i);
    i++;
}while(i <=5);

let fruits = ["apple", "banana", "mango"];
for (let fruit of fruits) {
  console.log(fruit);
}

let person = {
  name: "John",
  age: 25,
};

for (let key in person) {
  console.log(key + ": " + person[key]);
}


for (let i = 1; i <= 3; i++) {       // Outer loop
    for (let j = 1; j <= 2; j++) {   // Inner loop
        console.log(i, j);
    }
}