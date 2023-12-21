package com.hz;

public class GraduationCard extends Card {

    public GraduationCard(Printer printer) {
        super(printer);
    }
    @Override
    void printHeader(Printer printer) {
        String header = "--@--#--&----------------------&--#--@--";
        printer.printLine(header);
    }

    @Override
    void printMessage(Printer printer) {
        String msg = "This calls for celebrating! Congratulations!";
        printer.printLine(msg);
    }

    @Override
    void printImage(Printer printer) {
        printer.printLine("     ,_");
        printer.printLine("| `\"\"---..._____");
        printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        printer.printLine("       \\   ```` ``\"---...__  |");
        printer.printLine("       |`              |   ``!");
        printer.printLine("       |               |     A");
        printer.printLine("       |               /\\   /#\\");
        printer.printLine("       /`--..______..-'  |  ###");
        printer.printLine("      |   /  `\\    /`--. |  ###");
        printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        printer.printLine("   \\_,                 /_/");
        printer.printLine("       `\\              /");
        printer.printLine("         '.  '.__.'  .'");
        printer.printLine(" jgs      `-,____,-'");
        printer.printLine("           /\"\"\"I\"\"\\");
        printer.printLine("           /`---'--'\\");
    }

    @Override
    void printFooter(Printer printer) {
        String footer = "--@--#--&----------------------&--#--@--";
        printer.printLine(footer);
    }
}