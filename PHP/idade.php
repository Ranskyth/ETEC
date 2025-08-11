<?php
$nome = "Ana";
$idade = 25;
$sexo = "feminino";


if (($sexo == "feminino" || $sexo == "FEMINIO") && $idade < 25) {
    echo $nome . "<br>ACEITA.";
} else {
    echo $nome . "<br>NÃO ACEITA.";
}

?>