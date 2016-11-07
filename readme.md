TestRandomizer is a tool written for educators that quickly creates multiple versions of multiple choice tests with random orders for the questions and answers. This is intended to make cheating by copying other students' answers more difficult.

Use
---
1. Download the .jar file from the Releases page at the top of the github page, or build a jar from the source code.
2. Ensure you have Java installed. Run the .jar file.
3. In Notepad or a similar program, create a .txt file with the test questions and answers. It must follow the format explained below to be properly parsed by TestRandomizer.
3. Using the Browse button, select your input file.
4. Select the number of test versions you would like to generate.
5. Give a name for the output files. Make sure it does not match an existing file in the folder containing the input file, as it will over write any existing file.
6. Hit the Randomize Questions button. Output .txt files will be generated in the same folder as the input file. If you have selected "Open output files upon completion", these files will be opened in your computer's default .txt editing program.
7. Copy-paste the contents of the output files into a better text editor like Word in order to give proper formatting.

Input format
------------
TestRandomizer takes a .txt file with test questions and answers and outputs a set of .txt files with the questions and their answers in a random order.

Questions are indicated by a new line starting with "q:", and the answers pertaining to a question are on the following lines starting with a "a:". One answer may be marked as "correct" by starting the line with "a*:". An answer key may then be generated for each test version (questions with no answer marked as correct will have a "?" in the answer key).

By surrounding a group of one or more questions in curly braces, you can keep them together in a section, but are in a random order within that section. For example, if you have a series of questions about a certain topic, you could put them into a section together so they appear in the same part of the test, but in a random order.

Example input
-------------
```
{
q: What is 2+2?
a: 3
a*: 4
a: What
a: 4.4

q: Where are the bodies?
a: Umm....
a: I'll never talk.
a: In the cemetary. Duh.

q: Hi.
a: Lo.
a: Ho.
a*: Hello.
}

q: Why did the gods become angry at Gilgamesh and Enkidu in the Epic of Gilgamesh?
a*: Because they killed Humbaba and the Bull of Heaven
a: Because they went to the Underworld
a: Because they killed Ut-napishtim
a: Because they destroyed the gods' temple

Q: What do you want to be when you grow up?
a: A monster.
A: A copy editor.
a: A firetruck.
A: Rich.
a: A home owner.
```
More examples can be found in the Input directory of the code.

ToDo
----
* Add better error reporting for bad input.
* Add fixed answer or question position, for example an "All of the above" option.