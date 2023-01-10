package JavaDemos;

public class MultiplicationTable {
    void print() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }
        void print(int tables){
        print(tables,1,10);
            /*for (int i=0;i<=10;i++) {
                System.out.printf("%d * %d = %d", tables, i, tables*i).println();
            }*/
    }
    void print(int table, int from, int to){
        for (int i=from;i<=to;i++) {
            System.out.printf("%d * %d = %d", table, i, table*i).println();
        }
    }
}
