package com.company;

/**
 * Primzahlen und nicht Primzahlen unter einer Arrayslänge , mittels zwei Arrays, bestimmen;
 */
class Aufgabe3 {
        public static boolean[] sieb(int n) {
            boolean[] siebs;
            siebs = new boolean[n + 1];
            for (int i = 2; i <= n; i++) {
                siebs[i] = true;
            }

            for (int i = 2; i <= n; i++) {
                if (siebs[i] == true) {
                    for (int j = i + 1; j <= n; j++) {
                        if (j % i == 0) {
                            siebs[j] = false;
                        }
                    }
                }
            }

            return siebs;
        }

        public static void main(String[] args) {
            int n = 50;

            // Funktion aufrufen und Ergebnis anzeigen
            boolean[] result = sieb(n);
            System.out.print("Primzahlen:");
            for (int i = 2; i < result.length; i++) {
                if (result[i]) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("");
            System.out.print("Keine Primzahlen:");
            for (int i = 2; i < result.length; i++) {
                if (!result[i]) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("");
        }
    }

