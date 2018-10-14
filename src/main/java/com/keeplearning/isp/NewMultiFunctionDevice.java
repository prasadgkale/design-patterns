package com.keeplearning.isp;

public class NewMultiFunctionDevice implements Machine {
    private Scanner scanner;
    private Printer printer;

    public NewMultiFunctionDevice(Scanner scanner, Printer printer) {
        this.scanner = scanner;
        this.printer = printer;
    }

    @Override
    public void scan(Document document) {
        // Delegate
        scanner.scan(document);
    }

    @Override
    public void print(Document document) {
        // Delegate
        printer.print(document);
    }
}
