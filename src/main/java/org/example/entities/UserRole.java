package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // includes @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor
@NoArgsConstructor  // generates a constructor with no parameters
@AllArgsConstructor // generates a constructor with all properties in the class
@Table(name = "roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    private String name;
}
