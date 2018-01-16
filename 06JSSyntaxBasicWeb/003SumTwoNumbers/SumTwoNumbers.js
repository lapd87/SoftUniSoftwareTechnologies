function sumTwoNumbers(args){
    "use strict";
    let  num1 = Number(args[0]);
    let num2 = Number(args[1]);

    let sum = num1+num2;

    console.log(sum);
}

sumTwoNumbers(['10', '20'])