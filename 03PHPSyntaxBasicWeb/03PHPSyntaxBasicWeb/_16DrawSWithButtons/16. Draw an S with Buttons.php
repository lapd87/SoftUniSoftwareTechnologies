<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
for ($row = 1; $row <= 9; $row++) {
    for ($col = 1; $col <= 5; $col++) {
        $oneOrZero = ($row == 1 || $row == 5 || $row == 9)
            || ($row < 5 && $col == 1)
            || ($row > 5 && $col == 5);

        if ($oneOrZero) {
            echo "<button style='background-color: blue'>1</button>";
        } else {
            echo "<button>0</button>";
        }
    }
    echo "<br>";
}
?>
</body>
</html>