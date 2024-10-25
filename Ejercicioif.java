public class Ejercicioif{
    float salarioInicial;
    float porcentajeAumento;
    float salarioFinal;

    public Ejercicioif(float porcentajeAumento, float salarioInicial, float salarioFinal) {
        this.porcentajeAumento = porcentajeAumento;
        this.salarioInicial = salarioInicial;
        this.salarioFinal = salarioFinal;
    }
    public float calcularSalario(){
         if (salarioInicial<1300606) {
            salarioFinal=salarioInicial+(salarioInicial*porcentajeAumento);
            
         } else {
         salarioFinal=salarioInicial;
            
         }
        
        return salarioFinal;
    }

}