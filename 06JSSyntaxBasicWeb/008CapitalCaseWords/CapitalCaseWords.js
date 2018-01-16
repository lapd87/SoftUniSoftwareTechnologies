function capitalCaseWords(input) {
    let inputLines = input.join(",");

    let regex = /\b[A-Z]+\b/g;
    let matches = inputLines.match(regex);

    console.log(matches.join(", "));
}

capitalCaseWords(['We start by HTML, CSS, JavaScript, JSON and REST.',
    'Later we touch some PHP, MySQL and SQL.',
    'Later we play with C#, EF, SQL Server and ASP.NET MVC.',
    'Finally, we touch some Java, Hibernate and Spring.MVC.']);