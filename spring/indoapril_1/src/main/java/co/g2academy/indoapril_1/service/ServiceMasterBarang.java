package co.g2academy.indoapril_1.service;

import co.g2academy.indoapril_1.model.ModelMasterBarang;
import co.g2academy.indoapril_1.response.ResponseMasterBarang;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ServiceMasterBarang {
    //Untuk Menampilkan Data All
//    List<ResponseMasterBarang> getMasterBarangList();

    Page<ModelMasterBarang> getMasterBarangList(Integer page, Integer limit);
}
