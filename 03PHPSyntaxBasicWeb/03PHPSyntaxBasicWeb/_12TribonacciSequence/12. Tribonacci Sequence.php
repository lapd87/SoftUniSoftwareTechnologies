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
    echo 1 . " ";
    echo 1 . " ";
    echo 2 . " ";
    Tribonacci(1, 1, 2, 4, $num);
};

function Tribonacci($a, $b, $c, $count, $number)
{
    echo $a + $b +$c . " ";

    if ($count < $number) {
        return Tribonacci($b, $c, $a + $b + $c, $count + 1, $number);
    } else {
        return 0;
    }
}

?>
</body>
</html>