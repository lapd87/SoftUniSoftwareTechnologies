function largest3Numbers(input) {
    let inputArray = input.map(Number);

    let biggest = Number.MIN_SAFE_INTEGER;
    let bigger = Number.MIN_SAFE_INTEGER;
    let big = Number.MIN_SAFE_INTEGER;

    for (let num of inputArray) {

        if (num > biggest) {
            big = bigger;
            bigger = biggest;
            biggest = num;
        }
        else if (num > bigger) {
            big = bigger;
            bigger = num;
        }
        else if (num > big) {
            big = num;
        }
    }

    if (biggest == Number.MIN_SAFE_INTEGER) {
        biggest = "";
    }
    if (bigger == Number.MIN_SAFE_INTEGER) {
        bigger = "";
    }
    if (big == Number.MIN_SAFE_INTEGER) {
        big = "";
    }

    console.log(biggest);
    console.log(bigger);
    console.log(big);
}

largest3Numbers(['10', '30', '15', '20', '50', '5'])