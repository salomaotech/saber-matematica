package br.com.ebook.saber.matematica;

import java.util.ArrayList;
import java.util.List;

public class CalculaFracao {

    private static List decomporFatores(int numero) {

        List<Integer> numeros = new ArrayList();

        for (int i = 2; i <= numero; i++) {

            while (numero % i == 0) {

                numeros.add(i);
                numero = numero / i;

            }

        }

        return numeros;

    }

    private static List identificarFatores(List<Integer> listaA, List<Integer> listaB) {

        List<Integer> fatoresComuns = new ArrayList();
        List<Integer> fatoresIncomuns = new ArrayList();
        List<Integer> fatoresRetorno = new ArrayList();

        for (int fator : listaA) {

            if (listaB.contains(fator) == true) {

                fatoresComuns.add(fator);

            } else {

                fatoresIncomuns.add(fator);

            }

        }

        for (int fator : listaB) {

            if (listaA.contains(fator) == false) {

                fatoresIncomuns.add(fator);

            }

        }

        /* itera fatores comuns */
        for (int fator : fatoresComuns) {

            fatoresRetorno.add(fator);

        }

        /* itera fatores incomuns */
        for (int fator : fatoresIncomuns) {

            fatoresRetorno.add(fator);

        }

        return fatoresRetorno;

    }

    private static int calcularMMC(List<Integer> fatores) {

        int retorno = 1;

        for (int fator : fatores) {

            retorno = (retorno * fator);

        }

        return retorno;

    }

    public static void calcular() {

        List<Integer> listaA = decomporFatores(631);
        List<Integer> listaB = decomporFatores(524);
        List<Integer> listaC = identificarFatores(listaA, listaB);
        int resultadoDoMMC = calcularMMC(listaC);

        System.out.println(resultadoDoMMC);

    }

}
