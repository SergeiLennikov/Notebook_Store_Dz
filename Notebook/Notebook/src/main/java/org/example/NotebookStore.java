package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookStore {
    private List<Notebook> notebooks;

    public NotebookStore() {
        this.notebooks = new ArrayList<>();
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public List<Notebook> filterNotebooks(String criterion, Object value) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            switch (criterion) {
                case "model":
                    if (notebook.getModel().equals(value)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case "purpose":
                    if (notebook.getPurpose().equals(value)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case "ram":
                    if (notebook.getRam() >= (int) value) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case "hdd":
                    if (notebook.getHdd() >= (int) value) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case "os":
                    if (notebook.getOs().equals(value)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case "color":
                    if (notebook.getColor().equals(value)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case "price":
                    if (notebook.getPrice() <= (double) value) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
            }
        }
        return filteredNotebooks;
    }
}
