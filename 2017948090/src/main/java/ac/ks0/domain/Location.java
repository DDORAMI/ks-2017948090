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
public class Location implements Serializable {

    @Id  // 키값
    @Column  // 집어넣는다
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // idx순서 부여
    private Long idx;

    @Column
    private String address;

    @Column
    private String postcode;

    @Builder
    public Location(String address, String postcode){
        this.address = address;
        this.postcode = postcode;
    }
}
