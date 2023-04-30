package com.kamelyazev.shortlink.repository;

import com.kamelyazev.shortlink.model.LinkMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkMapRepository extends JpaRepository<LinkMap,Long> {

    @Query(value = "select longLink from LinkMap where tokenLink = ?1")
    String getLongLinkByToken(String token);

    @Query(value = "select tokenLink from LinkMap where longLink = ?1")
    String findTokenByLongLink(String longLink);

}
