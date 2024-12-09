package br.com.delogic.ticketExchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.delogic.ticketExchange.domain.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}