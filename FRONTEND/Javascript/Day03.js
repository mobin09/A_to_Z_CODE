// function greet() {
//   console.log("Hello!");
// }

// greet(); // calling the function


// const greet = function() {
//   console.log("Hello!");
// };
// greet();

// const greet = () => {
//   console.log("Hello!");
// };
// greet();

function greet(name) {
  console.log("Hello " + name);
}

greet("Mobin");

function add(a, b) {
  return a + b;
}

let result = add(5, 3); // 8
console.log("Result is ::" + result);

setTimeout(function() {
  console.log("Done!");
}, 1000);

(function() {
  console.log("I am an IIFE");
})();


(function(){
    console.log("Hi Everyone");
})();

console.log("Array start here");


let numbers = [1, 2, 3, 4];

//let nums = new Array(5, 10, 15);

//let arr = [];

let colors = ["Red", "Green", "Blue"];
console.log(colors[0]); // Red
console.log(colors[2]); // Blue

let fruits = ["Apple", "Banana"];
fruits[1] = "Mango";  // Banana → Mango

let arr = [1, 2, 3];
arr.push(40);
arr.unshift(5);
console.log(arr); // [ 5, 1, 2, 3, 40 ]
arr.pop();
arr.shift();
console.log(arr); // [ 1, 2, 3 ]
console.log(arr.indexOf(2)); //1
console.log(arr.includes(20)); // false

let color = ["Red", "Green", "blue"];
let strVal = color.join(", "); 
console.log(strVal);// // Red, Green, blue


// let names = ["Java", "Javascript", "Python", "Dart", "R"];
// let updatedVal = names.slice(1, 3);
// console.log(updatedVal); // [ 'Javascript', 'Python' ]

let names = ["Java", "Javascript", "Python", "Dart", "R"];
let updatedNames = names.splice(0,2, "SpringBoot", "React", "React-Native");
console.log(updatedNames);

// loop through arr;

let lang = ["Java", "Spring", "Spring Boot", "Postgres", 
    "Microservice", "Javascript", 
    "React", "React-Native", "HTML", "CSS", "Python"];

// console.log("For Loop");
// for(let i=0; i<lang.length; i++){
//     console.log(lang[i]);
// }
// console.log("For Of loop");
// for(let lan of lang){
//     console.log(lan);
// }
// console.log("For Each Loop");
// lang.forEach(item => console.log(item));


// Method	Use
// map()	transform elements
// filter()	return matching elements
// reduce()	accumulate values
// find()	find first matching element
// sort()	sort elements
// reverse()	reverse array
console.log("\n\n");

// let nums = [9,5,8,2,5];
// let double = nums.map(n => n * 2);
// console.log(double); // [ 18, 10, 16, 4, 10 ]

// let nums = [9,5,8,2,5];
// let numFilter = nums.filter(n => n % 2 == 0);
// console.log(numFilter); // [ 8, 2 ]

//let nums = [9,5,8,2,5];
// let s = 0;
// let sum = nums.reduce((a, b) => a + b, s);
// console.log(sum); // 29

// let nums = [9,5,8,2,5];

// let x = nums.find(n => n % 8);
// console.log(x);


//et nums = [5, 8, 12, 3, 15];
// let resul1 = nums.find(num => num > 10);
// console.log(resul1);  // 12

// let nums = [5, 8, 12, 3, 15];
// let sortedNums = nums.sort((a,b) => a-b); // ascending order 
// console.log(sortedNums); //[ 3, 5, 8, 12, 15 ]

// let dsort = nums.sort((a,b)=> b-a);
// console.log(dsort); // [ 15, 12, 8, 5, 3 ]


// let nums = [1, 2, 3, 4, 5];
// nums.reverse();
// console.log(nums);  // [ 5, 4, 3, 2, 1 ]

// sort the base on number of length of string in ascending order
let city = ["Delhi", "Lucknow", "Goa", "Banglore", "Mumbai"];
let citySeq = city.sort((a,b)=> a.length - b.length);
console.log(citySeq); // [ 'Goa', 'Delhi', 'Mumbai', 'Lucknow', 'Banglore' ]

let person = {
  name: "Mobin",
  age: 25,
  isStudent: false
};
console.log(person); // { name: 'Mobin', age: 25, isStudent: false }

console.log(person.name);
console.log(person.age);

console.log(person["name"]);
person.city = "Delhi";
console.log(person);

delete person.age;
console.log(person);
person.name = "Arshad";
console.log(person);

let car = {
  brand: "Toyota",
  start: function() {
    console.log("Car started");
  }
};

car.start();  // calling the method

let student = {
  name: "Rahul",
  marks: [80, 85, 90],
  address: {
    city: "Mumbai",
    pin: 400001
  }
};

for (let key in student) {
  console.log(key, student[key]);
}

/* 
name Rahul
marks [ 80, 85, 90 ]
address { city: 'Mumbai', pin: 400001 }
*/

console.log(Object.keys(student)); // [ 'name', 'marks', 'address' ]

console.log(Object.values(student));
// [ 'Rahul', [ 80, 85, 90 ], { city: 'Mumbai', pin: 400001 } ]

console.log(Object.entries(student));
/*
  [ 'name', 'Rahul' ],
  [ 'marks', [ 80, 85, 90 ] ],
  [ 'address', { city: 'Mumbai', pin: 400001 } ]
]
*/

// let obj = { name: "Mobin" };

let obj = new Object();
obj.name = "Mobin";

// function Person(name, age) {
//   this.name = name;
//   this.age = age;
// }

// let p1 = new Person("Ali", 22);

class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
}

let p2 = new Person("Rahul", 30);
console.log(p2); // Person { name: 'Rahul', age: 30 }
console.log(p2.name); // Rahul