package upload.storage;

public class StorageFileNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4967080342544496193L;
	
	public StorageFileNotFoundException() {
		super();
	}
	
	public StorageFileNotFoundException(String message) {
		super(message);
	}
	
	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
