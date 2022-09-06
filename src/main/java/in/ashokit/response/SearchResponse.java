package in.ashokit.response;

import lombok.Data;

@Data
public class SearchResponse {
	
	private String name;
	private int mobile;
	private String email;
	private char gender;
	private int ssn;
	private String planName;
	private String planStatus;

	

}
