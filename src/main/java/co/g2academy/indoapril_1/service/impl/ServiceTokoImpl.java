package co.g2academy.indoapril_1.service.impl;

import co.g2academy.indoapril_1.model.ModelToko;
import co.g2academy.indoapril_1.repository.RepositoryToko;
import co.g2academy.indoapril_1.request.RequestToko;
import co.g2academy.indoapril_1.response.ResponseToko;
import co.g2academy.indoapril_1.service.ServiceToko;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Repository("ServiceToko")
public class ServiceTokoImpl implements ServiceToko {
    private RepositoryToko repository;

    // menampilkan semua sales
    @Override
    public List<ResponseToko> getToko (String Status){
        return repository.findByStatus(Status).stream().map(this::toResponseTokoSimpel).collect(Collectors.toList());
    }
    private ResponseToko toResponseTokoSimpel(ModelToko entity){
        return new ResponseToko(entity.getId_User(),
                entity.getNama_User(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getAlamat_penempatan(),
                entity.getTelephon_user(),
                entity.getStatus());
    }

    // menambah data sales
    @Override
    @Transactional
    public ResponseToko create(RequestToko request){
        System.out.println(request);
        ModelToko entity = toEntity(request);
        ModelToko saveEntity = repository.save(entity);
        return toResponseTokoSimpel(saveEntity);
    }
    private ModelToko toEntity(RequestToko request){
        return ModelToko.builder()
                .id_User(request.getId_User())
                .nama_User(request.getNama_User())
                .username(request.getUsername())
                .password(request.getPassword())
                .alamat_penempatan(request.getAlamat_penempatan())
                .telephon_user(request.getTelephon_user())
                .status(request.getStatus())
                .build();
    }
}
