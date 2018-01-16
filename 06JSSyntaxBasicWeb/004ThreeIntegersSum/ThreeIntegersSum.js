function threeIntegersSum(input) {
    let nums = input[0].split(" ").map(Number);

    console.log(
        Sort(nums[0], nums[1], nums[2]) ||
        Sort(nums[0], nums[2], nums[1]) ||
        Sort(nums[2], nums[1], nums[0]) ||
        "No"
    );

    function Sort(num1, num2, num3) {
        if (num1 > num2) {
            [num1, num2] = [num2, num1]
        }
        if (num1 + num2 === num3) {
            return `${num1} + ${num2} = ${num3}`
        }
        else {
            return false;
        }
    }
}

threeIntegersSum(["-5 -3 -2"]);