<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    echo Factorial($num);
};

function Factorial($i)
{
    if ($i <= 1) {
        return 1;
    } else {
        return $i * Factorial($i - 1);
    }
}
?>
</body>
</html>