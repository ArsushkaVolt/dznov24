public class Diapozon {
    public int k, start, end;

    public Diapozon(int start, int end){
        this.start = start;
        this.end = end;
    }

    public int len() {
        if (end < start) {
            System.out.println("Начальное значение больше конечного!");

        }
         else {
            k = end - start;
        }
        return k;
    }
}
