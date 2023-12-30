package cricketplush.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cricketplush.service.ServiceClass;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class CricketController {
	 private ServiceClass cricketService;

	    public CricketController(ServiceClass cricketService) {
	        this.cricketService = cricketService;
	    }

	    @GetMapping("/live")
	    public ResponseEntity<?> getLiveMatches() throws InterruptedException {
	       
	        return new ResponseEntity<>(this.cricketService.getLiveMatches(), HttpStatus.OK);
	    }

	    @GetMapping("/point-table")
	    public ResponseEntity<?> getPointTables() {
	        return new ResponseEntity<>(this.cricketService.getPointTables(), HttpStatus.OK);
	    }

	   @GetMapping
	   public ResponseEntity<?> getAllMatches()
	   {
		   return new ResponseEntity<>(this.cricketService.getAllMatches(),HttpStatus.OK);
	   }
}
