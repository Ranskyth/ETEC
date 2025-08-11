<?php
function aliquota_ir($salario) {
    if ($salario < 2112.00) {
        return 0;
    } elseif ($salario <= 2826.65) {
        return 7.5;
    } elseif ($salario <= 3751.05) {
        return 15;
    } elseif ($salario <= 4664.68) {
        return 22.5;
    } else {
        return 27.5;
    }
}

function calc_salario($salario, $alicota){

    if ($salario < 2112.00) {
        $deducao = 0;
    } elseif ($salario <= 2826.65) {
        $deducao = 158.48;
    } elseif ($salario <= 3751.05) {
        $deducao = 370.40;
    } elseif ($salario <= 4664.68) {
        $deducao = 651.73;
    } else {
        $deducao = 884.96;
    }

    return number_format(($salario * $alicota / 100) - $deducao, 2, ',', '.');
}

function main(){
    $salario = 3000.00;
    $alicota = aliquota_ir($salario);
    $desconto = calc_salario($salario, $alicota);
    
    echo "Salário: R$ {$salario}<br>";
    echo "Alíquota: {$alicota}%<br>";
    echo "Imposto devido: R$ " . $desconto;

}

main();
?>