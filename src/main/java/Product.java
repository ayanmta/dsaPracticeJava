
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private BigDecimal Price;
    private int Inventory;

    @ManyToMany()
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "image",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Image> images;

}
