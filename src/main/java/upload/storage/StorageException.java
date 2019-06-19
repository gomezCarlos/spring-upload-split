package upload.storage;

public class StorageException extends RuntimeException {

	public StorageException(String message, Exception e) {
		super(message, e);
	}
	
	public StorageException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2451555009206808415L;

}
