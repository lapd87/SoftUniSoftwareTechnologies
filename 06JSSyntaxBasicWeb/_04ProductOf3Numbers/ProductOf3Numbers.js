function productOf3Numbers(input) {
    let negativeCount = 0;

    for (let num of input) {
        if (Number(num) < 0) {
            negativeCount++;
        }
    }

    if (negativeCount % 2 == 0) {
        console.log("Positive");
    }
    else {
        console.log("Negative");
    }
}

productOf3Numbers(["2", "3", "-1"]);