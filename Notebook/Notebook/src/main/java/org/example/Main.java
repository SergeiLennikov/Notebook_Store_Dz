package org.example;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotebookStore notebookStore = new NotebookStore();

        notebookStore.addNotebook(new Notebook("Dell XPS", "игровой", 16, 512, "Windows 10", "silver", 1500.0));
        notebookStore.addNotebook(new Notebook("HP Envy", "для работы", 8, 256, "Windows 10", "black", 800.0));
        notebookStore.addNotebook(new Notebook("Asus ROG", "игровой", 32, 1024, "Windows 10", "red", 2500.0));
        notebookStore.addNotebook(new Notebook("Lenovo ThinkPad", "для работы", 4, 128, "Linux", "gray", 500.0));
        notebookStore.addNotebook(new Notebook("Dell XPS", "gaming", 16, 512, "Windows 10", "black", 1500.0));
        notebookStore.addNotebook(new Notebook("MacBook Air", "business", 8, 256, "macOS", "silver", 1200.0));
        notebookStore.addNotebook(new Notebook("Asus ROG", "gaming", 32, 1024, "Windows 11", "red", 2500.0));
        notebookStore.addNotebook(new Notebook("HP Envy", "home", 4, 128, "Windows 10", "white", 700.0));
        notebookStore.addNotebook(new Notebook("Lenovo ThinkPad", "business", 16, 512, "Windows 10", "black", 1800.0));
        notebookStore.addNotebook(new Notebook("Acer Predator", "gaming", 64, 2048, "Windows 11", "black", 3500.0));
        notebookStore.addNotebook(new Notebook("Microsoft Surface", "home", 8, 256, "Windows 10", "silver", 1000.0));
        notebookStore.addNotebook(new Notebook("Razer Blade", "gaming", 32, 1024, "Windows 11", "black", 2800.0));
        notebookStore.addNotebook(new Notebook("Toshiba Satellite", "home", 4, 128, "Windows 10", "gray", 600.0));
        notebookStore.addNotebook(new Notebook("MSI GS65", "gaming", 16, 512, "Windows 11", "black", 2200.0));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Модель ноутбука");
        System.out.println("2 - Назначение (Игровой или для работы)");
        System.out.println("3 - ОЗУ");
        System.out.println("4 - Объем ЖД");
        System.out.println("5 - Операционная система");
        System.out.println("6 - Цвет");
        System.out.println("7 - Цена");
        System.out.println("8 - Вернуться в главное меню");
        System.out.print("Ввод: ");

        int criterion = scanner.nextInt();


        switch (criterion) {
            case 1:
                System.out.print("Введите модель ноутбука: ");
                String model = scanner.next();
                printFilteredNotebooks(notebookStore, "model", model);
                break;
            case 2:
                System.out.print("Введите назначение ноутбука (Игровой или для работы): ");
                String purpose = scanner.next();
                printFilteredNotebooks(notebookStore, "purpose", purpose);
                break;
            case 3:
                System.out.print("Введите минимальное значение ОЗУ: ");
                int ram = scanner.nextInt();
                printFilteredNotebooks(notebookStore, "ram", ram);
                break;
            case 4:
                System.out.print("Введите минимальный объем ЖД: ");
                int hdd = scanner.nextInt();
                printFilteredNotebooks(notebookStore, "hdd", hdd);
                break;
            case 5:
                System.out.print("Введите операционную систему: ");
                String os = scanner.next();
                printFilteredNotebooks(notebookStore, "os", os);
                break;
            case 6:
                System.out.print("Введите цвет ноутбука: ");
                String color = scanner.next();
                printFilteredNotebooks(notebookStore, "color", color);
                break;
            case 7:
                System.out.print("Введите максимальную цену: ");
                double price = scanner.nextDouble();
                printFilteredNotebooks(notebookStore, "price", price);
                break;
        }
    }

    private static void printFilteredNotebooks(NotebookStore notebookStore, String criterion, Object value) {
        List<Notebook> filteredNotebooks = notebookStore.filterNotebooks(criterion, value);
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.toString());
        }
    }
}