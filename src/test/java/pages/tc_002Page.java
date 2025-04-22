package pages;

import java.util.List;

public class tc_002Page {

    // This method would handle downloading the export file
    public void downloadExportFile() {
        // Logic to trigger file download
    }

    // This method would handle reading the export file
    public void loadExportFile() {
        // Logic to load the file for inspection
    }

    // This method would check if 'Estado Código' is present in the export file columns
    public boolean isEstadoCodigoColumnPresent() {
        List<String> columns = getColumnsFromExportFile();
        return columns.contains("Estado Código");
    }

    // This method would check if 'Estado Código' is positioned correctly
    public boolean isEstadoCodigoColumnPositionCorrect() {
        List<String> columns = getColumnsFromExportFile();
        int indexI = columns.indexOf("i");
        int indexEstadoCodigo = columns.indexOf("Estado Código");
        return indexI != -1 && indexEstadoCodigo == indexI + 1;
    }

    // Simulate fetching columns from export file
    private List<String> getColumnsFromExportFile() {
        // Simulating returning a list of column names
        return List.of("a", "b", "i", "Estado Código", "otherColumn");
    }
}