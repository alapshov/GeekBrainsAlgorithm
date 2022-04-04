package sorted;

public class Sorted {
    private static Notebook[] notebooks;

    public static void main(String[] args) {
        notebooks = NotebooksGenerator.generate(10000);

        for (int j = notebooks.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (notebooks[i].getPrice() > notebooks[i + 1].getPrice()) {
                    swap(i, i + 1);
                } else if (notebooks[i].getPrice() == notebooks[i + 1].getPrice()) {
                    if (notebooks[i].getMemory() > notebooks[i + 1].getMemory()) {
                        swap(i, i + 1);
                    } else if (notebooks[i].getMemory() == notebooks[i + 1].getMemory()) {
                        if (notebooks[i].getBrand().hashCode() > notebooks[i + 1].getBrand().hashCode()) {
                            swap(i, i + 1);
                        }
                    }
                }
            }
        }
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }

    private static void swap(int i, int j) {
        Notebook notebook = notebooks[i];
        notebooks[i] = notebooks[j];
        notebooks[j] = notebook;
    }

}
