function storingObjects(input) {
    let students = [];

    for (let student of input) {
        let studentArgs = student.split(" -> ");
        let name = studentArgs[0];
        let age = studentArgs[1];
        let grade = studentArgs[2];

        let currentStudent = {};
        currentStudent['Name'] = name;
        currentStudent['Age'] = age;
        currentStudent['Grade'] = grade;

        students.push(currentStudent);
    }

    for (let student of students) {
        for (let key of Object.keys(student)) {
            console.log(`${key}: ${student[key]}`);
        }
    }
}

storingObjects(["Pesho -> 13 -> 6.00",
    "Ivan -> 12 -> 5.57",
    "Toni -> 13 -> 4.90"]);