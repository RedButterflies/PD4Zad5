public class Zad5 {
    static void Kolumny()
    {
        int [][] tablica = new int[10][10];
        int liczba=0;
        int liczba2=0;
        int pierwszaKolumna=0;
        int drugaKolumna=0;
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {

                if (j == 0) {

                    tablica[i][j] = liczba;
                    pierwszaKolumna += tablica[i][j];
                    liczba++;
                } else if (j == 1) {

                    tablica[i][j] = liczba2 * liczba2;
                    drugaKolumna += tablica[i][j];
                    liczba2++;

                } else {
                    tablica[i][j] = 1;
                }
            }
        }



            for(int i=0;i<10;i++)
            {
                for(int j=0;j<10;j++)
                {
                    if(tablica[i][j]<10){
                        System.out.print(" ");
                    }
                    System.out.print(tablica[i][j]+"    ");
                }
                System.out.println();
            }
        System.out.println("Suma liczb w pierwszej kolumnie wynosi: "+ pierwszaKolumna);
        System.out.println();
        System.out.println("Suma liczb w drugiej kolumnie wynosi: "+drugaKolumna);


        }

    }







