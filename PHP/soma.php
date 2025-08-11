<?php
$num1 = 7;
$num2 = 15;

$soma = $num1 + $num2;

if ($soma > 20) {
    $soma = $soma + 8;
    echo "O valor é: " . $soma;
} elseif ($soma <= 20) {
    $soma = $soma - 5;
    echo "O valor é " . $soma;
}
?>