package co.g2academy.indoapril_1.service;

import co.g2academy.indoapril_1.request.RequestToko;
import co.g2academy.indoapril_1.response.ResponseToko;

import java.util.List;

public interface ServiceToko {
    //Untuk Menampilkan Data Barang Masuk All
    List<ResponseToko> getToko(String Status);

    //Tambah Data Barang Masuk:
    ResponseToko create(RequestToko request);
}
