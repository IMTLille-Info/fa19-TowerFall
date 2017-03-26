rm *.class
find . -name "*.java" > source.txt
javac @source.txt
