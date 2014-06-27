# Barebones, sloppy Makefile for people that are scared of UIs.

JARS=../guava-17.0.jar:../guice-4.0-beta4-no_aop.jar:../mockito-all-1.9.5.jar:../cli-parser-1.0.jar:../com.springsource.javax.inject-1.0.0.jar:../guice-multibindings-4.0-beta4.jar:../junit-4.11.jar

all: jar

jar: classes
	rm -rf Euler.jar tmp.jar
	mkdir -p tmp.jar
	cd tmp.jar && find .. -name \*.jar | find .. -name \*.jar | awk {'print "unzip -o " $$0'} | sh
	cp -rv src/* tmp.jar
	cd tmp.jar && jar cvfe ../Euler.jar com.paycho.euler.EulerMain *
	rm -rf tmp.jar

classes:
	cd src && find . -name \*.java | xargs javac -cp $(JARS)

run:
	java -jar Euler.jar

clean:
	rm -rf Euler.jar tmp.jar
	find src -name \*.class | xargs rm -f
