var salarioInicial;
var porcentajeAument;
var salarioFinal;

salarioIinical = parseFloat(prompt("ingrese salario que desea ajustar"));
salarioIinical = parseFloat(prompt("ingrese el porcentaje de aumento(por ejemplo 0.1 para 10%): "));
if (salarioInicial<130060) {
    salarioFinal = salarioInicial+(salarioInicial*porcentajeAumento)
    
} else {
    salarioFinal = salarioInicial
    
}
alert("su salario es igual a: " +salarioFinal)