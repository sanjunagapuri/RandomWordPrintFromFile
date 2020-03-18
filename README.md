<h1>RandomWordPrint Java Program</h1>
<p>Author: Sanjay Nagapuri</p>
<p>Date: 03-16-2020</p>


<h2>Problem</h2>
<ul>
  <li>This is a java program to print out a random word from a given list of words in a text file.</li>
</ul>


<h2>Requirements</h2>
<p>Please have the below software installed to run this program:</p>
<ul>
  <li>Java 8</li>
  <li>maven 3</li>
</ul>


<h2>Execution</h2>
<p>To execute the program you need to clone the repo https://github.com/sanjunagapuri/RandomWordPrintFromFile.git</p>
<p>Executing from terminal / command line</p>
<ul>
  <li>Step1: Run mvn clean install</li>
  <li>Step2: mvn exec:java -Dexec.mainClass="com.thr.code.challenge.Main"</li>
</ul>
<p>Executing program as a standalone Java application using an IDE</p>
<ul>
  <li>Step1: Select class "com.thr.code.challenge.Main" </li>
  <li>Step2: Run as a java standlaone program"</li>
</ul>

<h2>Solution</h2>
<p>This Java Program uses the static file words_alpha.txt (~4MB) present in "src/main/resources" when reading the file contents and convert the lines in the file into a List of Strings. From this list of strings (words), randomly chooses a word and prints out in the console as well as "application.log" file present in logs folder under the parent directory for each execution of the program</p>
<p>This program can be enhanced to use a Resrvoir Sampling Algorithm https://en.wikipedia.org/wiki/Reservoir_sampling to randomly choosing k samples from a list S containing n items, where n is either a very large or unknown number with huge file sizes (in GBs).</p>


<h2>Unit Tests</h2>
<p>Unit Tests Unit tests for all classes has been written and can be executed using command <strong>mvn test</strong> from project directory</p>
