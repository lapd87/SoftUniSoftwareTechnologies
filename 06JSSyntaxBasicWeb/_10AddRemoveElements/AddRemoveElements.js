function addRemoveElements(input) {
    let result = [];

    for (let i = 0; i < input.length; i++) {
        let commandNum = input[i].split(" ");
        if (commandNum[0] == "add") {
            result.push(commandNum[1]);
        }
        else if (commandNum[0] == "remove") {
            let index = Number(commandNum[1]);

            if (index >= 0 && index < result.length) {
                result.splice(index, 1);
            }
        }
    }

    for (let num of result) {
        console.log(num);
    }
}

addRemoveElements(["add 3", "add 5", "remove 2", "remove 0", "add 7"]);