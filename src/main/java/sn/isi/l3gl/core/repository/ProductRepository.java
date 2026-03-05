package sn.isi.l3gl.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.l3gl.core.entity.Product;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Requête pour trouver les produits avec quantité <= 5
    List<Product> findByQuantityLessThanEqual(Integer quantity);
}