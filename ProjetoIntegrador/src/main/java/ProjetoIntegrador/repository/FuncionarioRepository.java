package ProjetoIntegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoIntegrador.entites.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long>{

}
