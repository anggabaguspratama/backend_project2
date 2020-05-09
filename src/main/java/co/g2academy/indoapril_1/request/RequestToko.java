package co.g2academy.indoapril_1.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestToko {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_User;
    private String nama_User;
    private String username;
    private String password;
    private String alamat_penempatan;
    private String telephon_user;
    private String status;
}
