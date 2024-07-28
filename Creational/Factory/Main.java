package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();

        wordFactory.openDocument();
        pdfFactory.openDocument();
    }
}

