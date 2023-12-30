package cricketplush.service;

import java.util.List;



import cricketplush.entity.Match;


public interface ServiceClass {

	List<Match> getLiveMatches();

	List<List<String>> getPointTables();

	List<Match> getAllMatches();

}
