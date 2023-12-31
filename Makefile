check: check-counter check-basics
	@echo All checks passed!

check-counter: Counter.output
	cmp Counter.output Counter.expected
	@echo counter - Success!

check-basics: basics.output 
	cmp basics.output basics.expected
	@echo basics - Success!

clean:
	@rm -f *.output
	@rm -f *.class

basics.output: basics.scm 
	@(scheme --quiet < basics.scm > basics.output) 

Counter.class: Counter.java
	@(javac Counter.java)

Counter.output: Counter.class
	@(java Counter > Counter.output)

update:
	git pull https://gitlab.csi.miamioh.edu/cse465/instructor/lab01.git master

submit: update check
	git add -u 
	git commit -m "Final submission"
	git push origin master

# This uses grep to make sure there are no for-loops or while-loops
check-if-instructions-followed : Counter.java
	@[ -z "$(shell grep for Counter.java)" ] || (echo "You may not use for loops (the word 'for' appears in the file)" && false)
	@[ -z "$(shell grep while Counter.java)" ] || (echo "You may not use while loops (the word 'while' appears)" && false)

# This used grep to make sure students address all of the TODO comments
# (and then remove them!)
no-todos-in-%: %
	@[ -z "$(shell grep -i todo $*)" ] || (echo "You must replace all TODO comments" && false)




