package sorted;

import java.util.Random;

public class NotebooksGenerator {
    public static Notebook[] generate(int notebookCount) {
        Notebook[] notebooks = new Notebook[notebookCount];
        Notebook notebook;
        Random random = new Random();

        for (int i = 0; i < notebookCount; i++) {
            notebook = new Notebook(random.nextInt(2000), random.nextInt(64), "Notebook_" + random.nextInt(10));
            notebooks[i] = notebook;
        }
        return notebooks;
    }
}
