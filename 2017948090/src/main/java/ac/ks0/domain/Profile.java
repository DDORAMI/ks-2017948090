package ac.ks0.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Profile implements Serializable {

    @Id  // 키값
    @Column  // 집어넣는다
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // idx순서 부여
    private Long idx;

    @Column
    private String network;

    @Column
    private String username;

    @Column
    private  String url;

    @Builder
    public Profile(String network, String username, String url){
        this.network = network;
        this.username = username;
        this.url = url;
    }
}
