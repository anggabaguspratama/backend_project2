package co.g2academy.indoapril_1.service;

import co.g2academy.indoapril_1.request.RequestInventoryReport;
import co.g2academy.indoapril_1.response.ResponseInventoryReport;

import java.util.List;

public interface ServiceInventoryReport {
    List<ResponseInventoryReport> getInventoryReportBy( RequestInventoryReport request );

}
