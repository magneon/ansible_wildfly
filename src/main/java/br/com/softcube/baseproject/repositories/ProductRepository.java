package br.com.softcube.baseproject.repositories;

import br.com.softcube.baseproject.domains.EProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<EProduct, Integer> {}