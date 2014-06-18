# Barebones, sloppy Makefile for people that are scared of UIs.

all:
	cd src && find . -name \*.java | xargs javac -classpath ../guava-17.0.jar
	cp guava-17.0.jar Euler.jar
	cd src && find . -name \*.class | xargs jar uvfe ../Euler.jar com.paycho.euler.EulerMain

run:
	java -jar Euler.jar

clean:
	rm Euler.jar
	find src -name \*.class | xargs rm -f
