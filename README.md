# autocomplete

Cities auto completion application

1.	Checkout(Download) the application from github.

2.	Build process

	2.1	Make sure that Java and Ant is configured in you machine.
        
	2.2	Extract the downloaded file you will see autocomplete-master folder.
        
	2.3	Open the command prompt in you machine.
        
	2.4	Navigate to autocomplete folder through command prompt.
        
		Ex: cd autocomplete
                
	2.5 Run the build.xml using below command.
        
			       ant or ant -buildfile build.xml (if our build file name is build.xml then it is not necessary to give build file name, we just run using ant, if not we need to specify.)
                               
	2.6 This build process will generate two folders named with bin and dist.
        
	2.7 bin folder cosist of all class files of autocomplete application.
        
	2.8 Navigate to dist directory.
        
		Ex: cd dist
                
	2.9 See the files in dist directory using respective command (dir, ls -lrt, ls) and you will see the jar file named with autocomplete.jar .
        
	2.10 Type this command java -jar autocomplete.jar hy 5 (Here in this command the start value is hy and atmost value is 5) and press enter you will see the suggestions.
        

      
        
