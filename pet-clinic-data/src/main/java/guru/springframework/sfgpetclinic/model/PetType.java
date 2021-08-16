package guru.springframework.sfgpetclinic.model;

/**
 * Created by jt on 7/13/18.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="types")
public class PetType extends BaseEntity {
    @Column(name="name")
    private String name;

}
