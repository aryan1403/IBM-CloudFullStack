// console.log("hello my name is aaryan");
// variables
let a = 5;
let b = 6.7;

var c;

// console.log("Sum:", a + b);
if(a > b) {
    // console.log("hi");
} else if( a < b) {
    // console.log("bye");
} else {
    // console.log("eq");
}

for(let i=0; i < 5; i++) {
    // console.log(i);
}

let i = 0;
while(i < 5) {
    i++;
}

do {
    i++;
} while(i < 10);

let arr = [1, "aaryan", true, undefined, null, 90];
let arr2 = [2, 3, 4];

// arr.filter(e => e % 2 == 0).forEach(e => console.log(e))
// arr.filter(e => typeof e === "number").map(e => e * 2).forEach(e => console.log(e));
arr.sort();
// console.log(arr.filter(e => typeof e === "number").reduce((acc, e) => {
//     // console.log(acc, e);
//     return acc + e;
// }, 0));


// console.log([...arr, ...arr2]);

// console.log(arr.indexOf(true));

// arr.forEach(e => console.log(e));

let s = (a, b) => a + b;

// s(3, 4);
if (typeof a === "number") {
    // console.log('a is a number');
    
}

// typeof(a);
let obj = {
    name: "aaryan",
    role: "trainer",
    exp: 10
}

// console.log(obj.name);

let cal = {
    sum: (...e) => e.reduce((acc, e) => acc + e, 0),
    sub: (a, b) => e.reduce((acc, e) => acc - e, 0),
    mul: (a, b) => e.reduce((acc, e) => acc * e, 1),
    div: (a, b) => e.reduce((acc, e) => acc / e, 1),    
}

console.log(cal.sum(3, 4, 10, 8));





// == (value)

// === (type and value)


// console.log(arr);
// for(let e of arr) {
//     console.log(e);
// }
// for(let i in arr) {
//     console.log(i);
// }

// let a1 = 5;
function sum(a1=10, b) {
    console.log(a1 + b);
    return a1 + b;
}

// sum(undefined,7);

// function closure() {
//     let a2;
//     function inner() {
//         a2 = 5;
//         console.log(a2);
//     }
//     inner();
//     console.log(a2);
// }

let l = 5;
var v = 6;

{
    l = 10; // This l is block-scoped, different from the global l
    v = 20; // This v is function-scoped, it will overwrite the global v
    // console.log("Inside block, a:", l); // 10
    // console.log("Inside block, b:", v); // 20
}

// console.log("Outside block, l:", l); // 5
// console.log("Outside block, v:", v); // 20


let str = "Aaryan";

// console.log(str.length);
// console.log(str.toUpperCase());
// console.log(str.includes("Aa"));

const con = 6;
// con = 7;
// console.log("This is my program" + a + ", " + b + ", " + con);
// console.log(`fghjkjhgfghj ${a} fghjkjhgf ${a + b} sdfs ${Math.pow(2, 3)}`)

