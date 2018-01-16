function symmetricNumbers(num) {
    let n = Number(num);
    let result = "";

    for (let i = 1; i <= n; i++) {
        if (isSymmetric(i.toString())) {
            result += i+" ";
        }
    }

    console.log(result);

    function isSymmetric(numToString) {
        for (let i = 0; i < numToString.length/2; i++) {
            if (numToString[i]!=numToString[numToString.length-1-i]) {
                return false
            }
        }

        return true
    }
}

symmetricNumbers("750");