package functional_interface;

interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Export to JSON feature added (default implementation).");
    }
}

class CSVExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Data exported in CSV format.");
    }

    public void exportToPDF() {
        System.out.println("PDF export not supported in CSVExporter.");
    }
}

class PDFExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("CSV export not supported in PDFExporter.");
    }

    public void exportToPDF() {
        System.out.println("Data exported in PDF format.");
    }

    public void exportToJSON() {
        System.out.println("Data exported in JSON format using PDFExporter logic.");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {

        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.exportToCSV();
        csv.exportToPDF();
        csv.exportToJSON();

        pdf.exportToCSV();
        pdf.exportToPDF();
        pdf.exportToJSON();
    }
}

