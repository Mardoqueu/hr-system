package br.com.mardoqueu.userapi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name= "TB_USER")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;


}
