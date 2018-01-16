function workingWithKeyValuePairs(input) {
    let keyValue = [];

    for (let i = 0; i < input.length - 1; i++) {
        let inputLine = input[i].split(" ");
        let key = inputLine[0];
        let value = inputLine[1];

        keyValue[key] = value;
    }

    let printKey = input[input.length - 1];

    if (printKey in keyValue) {
        console.log(keyValue[printKey]);
    }
    else {
        console.log("None");
    }
}

workingWithKeyValuePairs(["3 test", "3 test1", "4 test2", "4 test3", "4 test5", "4"]);