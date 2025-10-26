public class RunersApp
{
    static java.util.Scanner entrada;
    public static void main (String args[])
    {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba())
        {
        }
    }
    private static boolean casoDePrueba ( )
    {
        int hm = entrada.nextInt();
        if (hm == 0){
            return false;
        }

        int[] etapas = new int[hm];
        int inicio = 0;
        int final1 = 0;
        int segundos = 0;
        int finalSegundos = 0;

        for (int i = 0; i < hm; i++) {
            etapas[i] = entrada.nextInt();
        }

        for (int i = 0; i < hm; i++) {
            if (i <= 9) {
                segundos += etapas[i];
                finalSegundos += etapas[i];
                inicio = i - 10 + 1;
                final1 = i + 1;
            } else {
                segundos = segundos - etapas[i - 10] + etapas[i];
                if (segundos <= finalSegundos) {
                    inicio = i - 10 + 1;
                    final1 = i + 1;
                    finalSegundos = segundos;
                }
            }
        }

        int minutos = finalSegundos / 60;
        int segundosres= finalSegundos % 60;
        System.out.printf( "%d-%d %d:%02d\n",inicio * 100, final1 * 100, minutos, segundosres);
        return true;
    }
}
