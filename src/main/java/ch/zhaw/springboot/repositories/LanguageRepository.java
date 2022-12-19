package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Language;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LanguageRepository extends JpaRepository<Language, Long> {
  
  @Query("SELECT la FROM Language la WHERE la.origin = ?1")
  public List<Language> findLanguagesByOrigin(String origin);

  @Query("SELECT la FROM Language la WHERE la.name = ?1")
  public List<Language> findLanguagesByName(String name);
}
