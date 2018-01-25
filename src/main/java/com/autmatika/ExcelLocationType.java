package com.autmatika;

import java.io.IOException;
import java.util.List;

public abstract class ExcelLocationType {

    public abstract List<String> getExcelWorkSheetNames() throws IOException;

    public abstract List<List<Object>> getExcelData(String sheetName, String addressRangeOrUsedRange) throws IOException;

    public abstract void authorize() throws IOException;
}
