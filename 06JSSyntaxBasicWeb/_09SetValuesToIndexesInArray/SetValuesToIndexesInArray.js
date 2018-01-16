function setValuesToIndexesInArray(input) {
    let arrayLength = Number(input[0]);
    let result = [];

    for (let i = 0; i < arrayLength; i++) {
        result[i] = 0;
    }

    for (let i = 1; i < input.length; i++) {
        let indexNum = input[i].split(" - ");

        result[indexNum[0]] = indexNum[1];
    }

    for (let value of result) {
        console.log(value);
    }
}

setValuesToIndexesInArray(["3", "0 - 5", "1 - 6", "2 - 7"]);