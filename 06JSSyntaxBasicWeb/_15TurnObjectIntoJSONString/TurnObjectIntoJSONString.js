function turnObjectIntoJSONString(input) {
    let object = {};

    for (let i = 0; i < input.length; i ++) {
        let objArgs = input[i].split(" -> ");

        if (objArgs[1] == Number(objArgs[1])) {
            objArgs[1] = Number(objArgs[1]);
        }
        object[`${objArgs[0]}`] = objArgs[1];
    }

    console.log(JSON.stringify(object));
}

turnObjectIntoJSONString(["name -> Angel", "surname -> Georgiev", "age -> 20", "grade -> 6.00", "date -> 23/05/1995", "town -> Sofia"]);