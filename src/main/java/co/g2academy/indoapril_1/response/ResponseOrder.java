package co.g2academy.indoapril_1.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
public class ResponseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id_Order;
    private String Tgl_Order;
    private String Nama_Barang;
    private Integer Qty_Detail;
    private String Alamat_Penempatan;

    public ResponseOrder(
            String id_Order,
            String tgl_Order,
            String nama_Barang,
            Integer qty_Detail,
            String alamat_Penempatan
    ) {
        this.Id_Order = id_Order;
        this.Tgl_Order = tgl_Order;
        this.Nama_Barang = nama_Barang;
        this.Qty_Detail = qty_Detail;
        this.Alamat_Penempatan = alamat_Penempatan;
    }

}