# spring-upload-split

Upload a file and split it into random pieces (1 to 20) to donwload

This is a spring project who calls a service for storage, inside you will find an implementation that splits binary data from the file, obtains a random number and generates said number of chunks, finally creates a new InputStream for each one and save it to disk. 
