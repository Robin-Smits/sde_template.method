package com.hz;

public abstract class Card {
    private Printer printer;

    public Card(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        printHeader(this.printer);
        printMessage(this.printer);
        printImage(this.printer);
        printFooter(this.printer);
    }

    abstract void printHeader(Printer printer);
    abstract void printMessage(Printer printer);
    abstract void printImage(Printer printer);
    abstract void printFooter(Printer printer);
}
