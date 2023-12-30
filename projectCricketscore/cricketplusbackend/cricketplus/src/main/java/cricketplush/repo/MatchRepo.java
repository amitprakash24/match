package cricketplush.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cricketplush.entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{ 
	
	
	Optional<Match> findByTeamHeading(String teamHeading);
}
