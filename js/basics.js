// variables
// var, let, const
let x = 10; // block level scope
console.log(x);
// Ctrl+Alt+N - to run js code

var y = 20;
console.log(y);

for (let i = 0; i < 5; i++) {
  console.log(i); //0-4
}
//console.log(i); // err: ReferenceError: i is not defined

for (var j = 0; j < 5; j++) {
  console.log(j); // 0-4
}
console.log(j); // 5

const Z = 100;
console.log(Z); //100
//Z = 200;
//console.log(Z); // err: TypeError: Assignment to constant variable.

// Data types
/* 
  number
  boolean
  string 
  undefined
  NaN
  object
*/
// typeof() - gives type of a variable
console.log(typeof x); // number
console.log(typeof true); // boolean
console.log(typeof false); // boolean
console.log(typeof 10.5); //number
console.log(typeof "hello"); //string
console.log(typeof "world"); // string
console.log(typeof "c"); // string
let k;
console.log(typeof k); //undefined
console.log(typeof 10 / 0); //NaN

// Array
const colors = ["white", "black", "red", "green"];
console.log(typeof colors); //object

let numArr = [10, 15, 20, 25];
// read array
for (let i = 0; i < numArr.length; i++) {
  // 4
  console.log(numArr[i]); //10, 15, 20, 25
}

// add element to an array
numArr.push(30);
console.log(numArr); //10, 15, 20, 25, 30

// remove element from an array
numArr.pop(); // last element
console.log(numArr); ////10, 15, 20, 25

// remove specific element from an array
// splice(startIndex, numberOfElementsToRemove)
numArr.splice(2, 1);
console.log(numArr); // 10, 15, 25
//numArr.splice(2, 3);

// sort an array
const numArr1 = [34, 12, 45, 23, 67];
console.log("Before sort: " + numArr1); //34,12,45,23,67
numArr1.sort();
console.log("After sort: " + numArr1); //12, 23, 34, 45, 67;

// reverse an array
numArr1.reverse();
console.log(numArr1); //[67, 45, 34, 23, 12];

// update an array
numArr1[0] = 500;
console.log(numArr1);
[500, 45, 34, 23, 12];

console.log(x + " " + y + " " + Z);

const numArr2 = [30, 40, 50];
//numArr2 = numArr1; //TypeError: Assignment to constant variable.
//console.log(numArr2);

// Object
const person = {
  name: "Ram",
  age: 20,
  contactNos: [999991111, 9999922222, 9999933333],
  address: [
    { city: "Chennai", state: "TamilNadu" },
    { city: "Bengaluru", state: "Karnataka" },
    { city: "Hyderabad", state: "Telangana" },
  ],
};

console.log(typeof person); // object
console.log(typeof null); // object

// read object
console.log(person.name); // Ram
console.log(person.age); //20
console.log(person.contactNos); //[999991111, 9999922222, 9999933333]
console.log(person.contactNos[1]); // 9999922222
console.log(person.address); // address list
console.log(person.address[1]); //{ city: "Bengaluru", state: "Karnataka" },
console.log(person.address[1].city); // Bengaluru
console.log(person.address[1].state); // Karnataka

// Another way of reading object
console.log(person["name"]);

// Update person object
//person = {}; //TypeError: Assignment to constant variable.
//console.log(person);

person.age = 21;
console.log(person.age); // 21

// function
// function funcName(inputArgs) {
//   // code
// }

function isEven(num) {
  if (num % 2 == 0) {
    return true;
  } else {
    return false;
  }
}

function isOdd(num) {
  return num % 2 == 0 ? false : true;
}

// call functions
console.log(isEven(10));
console.log(isOdd(21));

function add(num1, num2) {
  console.log(num1 + num2);
}

add(10, 20); //30

// map, filter
function square(num) {
  return num * num;
}
// numArr = [ 10, 15, 25 ]
// console.log(numArr);
const newNumArr = numArr.map(square);
console.log(newNumArr);

// filter
const filteredNumbers = numArr.filter(notEqual25);
console.log(filteredNumbers);

function grtThan50(num) {
  return num > 50;
}

function lessThan50(num) {
  return num < 50;
}

function notEqual25(num) {
  return num != 25;
}

// class
class Employee {
  // initializing emp obj
  constructor(empId, empName, email) {
    this.empId = empId;
    this.empName = empName;
    this.email = email;
  }

  // read
  getEmpId() {
    return this.empId;
  }
  getEmpName() {
    return this.empName;
  }
  getEmail() {
    return this.email;
  }
  // update
  setEmpId(empId) {
    this.empId = empId;
  }
  setEmpName(name) {
    this.empName = name;
  }
  setEmail(email) {
    this.email = email;
  }
}

// create emp obj - 'new' keyword
const emp1 = new Employee(1001, "Ram", "ram@example.com");
const emp2 = new Employee(1002, "Sam", "sam@example.com");

// get obj details
console.log(emp1);
console.log(emp2.getEmpName());

// update
emp2.setEmpName("Sam R");
console.log(emp2);

// Date/Math
const date = new Date();
console.log(date); // return current date
console.log(date.getDate()); // 11
console.log(date.getDay()); // 4(0- Sunday 6-Saturday)
console.log(date.getTime()); // time in milliseconds - 1660194311601

console.log(Math.PI); // 3.14
console.log(Math.pow(2, 3)); //8
console.log(Math.sqrt(144)); //12
console.log(Math.random()); // 0.13615338799177956 (returns random number between 0-1)
console.log(Math.ceil(4.3)); //5 - upside nearest rounded value
console.log(Math.floor(4.6)); // 4 - downside nearest rounded value

// DOM - Document Object Model
