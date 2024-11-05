public class Prvocisla {
    private boolean[] pole;
    int max;

    Prvocisla(int pocet){
        max = pocet + 1;
        pole = new boolean[max];
        for(int i=2;i<max;i++)
            pole[i] = true;

        int prvocislo = 2;
        double limit = Math.sqrt(max);

        while(prvocislo <= limit){
            if(pole[prvocislo]){
                for(int i=prvocislo*prvocislo;i<max;i+=prvocislo)
                    pole[i] = false;
            }
            prvocislo++;
        }
    }

    void vypis(){
        for(int i=2;i<max;i++)
            if(pole[i])
                System.out.print(i+" ");
        System.out.println();
    }
}
