public class CalculadoraImc {

    double peso;
    double altura;

    IndiceMassaCorporal calcular() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
