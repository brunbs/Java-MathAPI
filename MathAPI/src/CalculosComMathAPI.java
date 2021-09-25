
public class CalculosComMathAPI {

    public static void main(String[] args) {

/* min() e max() : comparam dois valores e retorna um deles
    Assinaturas:
    double min(double a, double b)
    float min(float a, float b)
    int min(int a, int b)
    long min(long a, long b)
*/

        int primeiro = Math.max(3, 7); // 7
        int segundo = Math.min(7, -9); // -9

/* round() : tira a porção decimal do número, podendo arredondar;
    Assinatura:
    long round(double num)
    int roun(float num)
*/

        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); //123

/* pow() : para exponenciais
    Assinatura:
    double pow(double number, double exponent)
*/

        double quadrado = Math.pow(5, 2); // 25.0

/* random() : retorna um valor maior ou igual a 0 e menor que 1
    Assinatura:
    double random()
*/
        double numero = Math.random();

    }
}
