<?php
$nota1 = 6;
$nota2 = 8;

$media = ($nota1 + $nota2) / 2;

$aprovados = 0;
$exame = 0;
$reprovados = 0;

if ($media >= 7) {
    echo "Média: $media - Aprovado\n";
    $aprovados++;
} elseif ($media >= 4) {
    echo "Média: $media - Exame\n";
    $exame++;
} else {
    echo "Média: $media - Reprovado\n";
    $reprovados++;
}

echo "Total de Aprovados: $aprovados\n";
echo "Total de Exame: $exame\n";
echo "Total de Reprovados: $reprovados\n";
echo "Média da Classe: $media\n";
?>