package co.g2academy.indoapril_1.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ModelToko implements Serializable {
    @Id //ganti2 kalo ada erorr kan ada 2 tuh Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_User;
    private String nama_User;
    private String username;
    private String password;
    private String alamat_penempatan;
    private String telephon_user;
    private String status;
}
