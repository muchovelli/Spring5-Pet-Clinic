package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="vets")
public class Vet extends Person {

    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name="vet_specialities",joinColumns = @JoinColumn(name="vet_id"), inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

}
