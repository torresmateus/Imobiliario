package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.FormaPagamento;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long>{

	FormaPagamento findById(long id);
}
