function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.operator = operator;
    this.rightOperand = rightOperand;

    this.calculateResult = function () {
        let result = 0;

        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
            case "%":
                result = this.leftOperand % this.rightOperand;
                break;
            case "sqrt":
                result = Math.pow(this.rightOperand,1/this.leftOperand);
                break;
            case "power":
                result = Math.pow(this.leftOperand,this.rightOperand);
                break;
        }

        return result;
    }
}

module.exports = Calculator;