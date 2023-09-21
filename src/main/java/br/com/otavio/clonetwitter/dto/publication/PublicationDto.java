package br.com.otavio.clonetwitter.dto.publication;

import br.com.otavio.clonetwitter.entities.LikeEntity;
import br.com.otavio.clonetwitter.entities.ShareEntity;
import br.com.otavio.clonetwitter.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PublicationDto {

    private Long id;
    private String caption;
    private Date create_at;
    private UserEntity user;
    private List<LikeEntity> likes;
    private List<ShareEntity> shares;
}
