function multiplyDivideNumber(input) {
    let firstNum = Number(input[0]);
    let secondNum = Number(input[1]);

    if (secondNum >= firstNum) {
        console.log(firstNum * secondNum);
    }
    else {
        console.log(firstNum / secondNum);
    }
}

multiplyDivideNumber(["2", "3"]);