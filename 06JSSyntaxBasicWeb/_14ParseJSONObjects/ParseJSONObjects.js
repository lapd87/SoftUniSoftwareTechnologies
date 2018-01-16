function parseJSONObjects(input) {
    for (let obj of input) {
        let result = JSON.parse(obj);

        console.log(`Name: ${result.name}`);
        console.log(`Age: ${result.age}`);
        console.log(`Date: ${result.date}`);
    }
}

parseJSONObjects(['{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}']);