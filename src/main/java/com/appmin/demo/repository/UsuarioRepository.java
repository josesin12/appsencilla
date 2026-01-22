package com.appmin.demo.repository;
import com.appmin.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
