package EC2AngelCuchilloBodega.DTO;

public class UsuarioDTOResponse {
	
	private String token;

	  public UsuarioDTOResponse(String token) {
	    this.token = token;
	  }

	  public UsuarioDTOResponse() {
	  }

	  public String getToken() {
	    return token;
	  }

	  public void setToken(String token) {
	    this.token = token;
	  }


}
