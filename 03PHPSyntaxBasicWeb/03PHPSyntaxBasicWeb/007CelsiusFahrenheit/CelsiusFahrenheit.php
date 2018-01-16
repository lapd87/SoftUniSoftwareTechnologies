<?php
$msgAfterCelsius = "";
$msgAfterFahrenheit = "";

if (isset($_GET['cel'])) {
    $celsius = floatval($_GET['cel']);
    $fahrenheit = $celsius * 9 / 5 + 32;
    $msgAfterCelsius = "$celsius &deg;C = $fahrenheit &deg;F";
}

if (isset($_GET['fah'])) {
    $fahrenheit = floatval($_GET['fah']);
    $celsius = ($fahrenheit - 32) * 5 / 9;
    $msgAfterFahrenheit = "$fahrenheit &deg;F = $celsius &deg;C";
}
?>
<form>
    Celsius: <input type="text" name="cel"/>
    <input type="submit" value="Convert">
    <?= $msgAfterCelsius ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah"/>
    <input type="submit" value="Convert">
    <?= $msgAfterFahrenheit ?>
</form>
