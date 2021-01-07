package hellojpa.basicKeyMapping;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
public class IMember {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
