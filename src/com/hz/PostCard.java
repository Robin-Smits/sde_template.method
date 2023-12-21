package com.hz;

public class PostCard extends Card{

    public PostCard(Printer printer) {
        super(printer);
    }

    public void printHeader(Printer printer) {
        String header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        printer.printLine(header);
    }

    @Override
    void printMessage(Printer printer) {
        String msg = "Greetings from the netherlands!";
        printer.printLine(msg);
    }

    public void printImage(Printer printer) {
            printer.printLine("        Art by Hayley Jane Wakenshaw");
            printer.printLine("");
            printer.printLine("             /)  (\\");
            printer.printLine("        .-._((,~~.))_.-,");
            printer.printLine("         `=.   99   ,='");
            printer.printLine("           / ,o~~o. \\");
            printer.printLine("          { { .__. } }");
            printer.printLine("           ) `~~~\' (");
            printer.printLine("          /`-._  _\\.-\\");
            printer.printLine("         /         )  \\");
            printer.printLine("       ,-X        #   X-.");
            printer.printLine("hjw   /   \\          /   \\");
            printer.printLine("     (     )| |  | |(     )");
            printer.printLine("      \\   / | |  | | \\   /");
            printer.printLine("       \\_(.-( )--( )-.)_/");
            printer.printLine("       /_,\\ ) /  \\ ( /._\\");
            printer.printLine("           /_,\\  /._\\");
        }

    @Override
    void printFooter(Printer printer) {
        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        printer.printLine(footer);
    }
}
