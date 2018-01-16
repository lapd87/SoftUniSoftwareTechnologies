function multipleValuesForKey(input) {
    let keyValue = {};

    for (let i = 0; i < input.length - 1; i++) {
        let inputLine = input[i].split(" ");
        let key = inputLine[0];
        let value = inputLine[1];

        if (!keyValue.hasOwnProperty(key)) {
            keyValue[key] = new Array();
        }

        keyValue[key].push(value);
    }

    let printKey = input[input.length - 1];

    if (printKey in keyValue) {
        for (let values of keyValue[printKey]) {
            console.log(values);
        }
    }
    else {
        console.log("None");
    }
}

multipleValuesForKey(["3 test", "3 test1", "4 test2", "4 test3", "4 test5", "4"]);