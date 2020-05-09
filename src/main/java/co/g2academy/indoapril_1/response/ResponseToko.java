package co.g2academy.indoapril_1.response;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class ResponseToko {
    private int id_User;
    private String nama_User;
    private String username;
    private String password;
    private String alamat_penempatan;
    private String telephon_user;
    private String status;


    public ResponseToko(int Id_User,
                        String Nama_User,
                        String Username,
                        String Password,
                        String Alamat_Penempatan,
                        String Telephon_User,
                        String Status) {
        this.id_User = Id_User;
        this.nama_User = Nama_User;
        this.username = Username;
        this.password = Password;
        this.alamat_penempatan = Alamat_Penempatan;
        this.telephon_user = Telephon_User;
        this.status = Status;
    }
}
