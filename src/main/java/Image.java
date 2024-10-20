import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
private String name;
private Blob Image;
private String downloadUrl;
@ManyToOne
@JoinColumn(name = "product_id")
private Product Product;

}
