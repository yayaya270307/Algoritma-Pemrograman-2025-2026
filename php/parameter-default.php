<?php
function perkenalan($nama, $salam="Assalamualikum") {
    echo $salam.",";
    echo"Perkenalkan, nama saya ".$nama."<br/>";
    echo"Senang bertemu denan anda<br/>";
}

perkenalan("Muhardian", "Hi");
echo"<hr>";
$saya = "indry";
$ucapanSalam = "Selamat pagi";
perkenalan($saya);
?>