package com.db.demo.config.audit;
import java.util.Optional;

import com.db.demo.model.MyUserDetails;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
/*
public class AuditorAwareImpl implements AuditorAware<> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Ramesh");
        // Use below commented code when will use Spring Security.
    }
}*/

// ------------------ Use below code for spring security --------------------------

/*public class SpringSecurityAuditorAware implements AuditorAware<User> {

 public User getCurrentAuditor() {

  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

  if (authentication == null || !authentication.isAuthenticated()) {
   return null;
  }

  return ((MyUserDetails) authentication.getPrincipal()).getUser();
}
}*/
/**
 Using the AuditingEntityListener Class With @EntityListeners
 Spring Data JPA provides a JPA entity listener class, AuditingEntityListener, which contains the callback methods (annotated with the @PrePersist and @PreUpdate annotations), which will be used to persist and update these properties when we will persist or update our entity.
 JPA provides the @EntityListeners annotation to specify callback listener classes, which we use to register our AuditingEntityListener class.
 **/