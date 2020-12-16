package br.com.softcube.baseproject.repositories;

import br.com.softcube.baseproject.domains.EPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<EPrice, Integer> {}