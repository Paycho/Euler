# Barebones, sloppy Makefile for people that are scared of UIs.

all:
	cd src && find . -name \*.java | xargs javac -classpath ../guava-17.0.jar ../guice-4.0-beta4-no_aop.jar ../mockito-all-1.9.5.jar ../cli-parser-1.0.jar ../com.springsource.javax.inject-1.0.0.jar ../guice-multibindings-4.0-beta4.jar
	cp guava-17.0.jar Euler.jar
	cd src && find . -name \*.class | xargs jar uvfe ../Euler.jar com.paycho.euler.EulerMain

run:
	java -jar Euler.jar

clean:
	rm Euler.jar
	find src -name \*.class | xargs rm -f
