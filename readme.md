A tool for creating multiple versions of multiple choice tests with random orders for the questions and answers.

Use
---
To use, make a .txt file with the test questions and answers. Questions are indicated by a new line starting with "q:", followed by answers indicated by a new line starting with a "a:".
By surrounding a group of one or more questions in curly braces, you can keep them together in a section, but are in a random order within that section. For example, if you have a series of questions about a certain topic, you could put them into a section together so they appear in the same part of the test, but in a random order.
Once you have an appropriately marked up input file, select it using the Browse button in the GUI, select the number of test versions, and give your output file a name. Hitting the Randomize Questions button will create as many test versions as you asked for in the same folder as the input files. You may then copy paste the contents of these .txt files into a better text editor like Word for formatting.

Example input
-------------
```{q: What is 2+2?
a: 3
a: 4
a: What
a: 4.4

q: Where are the bodies?
a: Umm....
a: I'll never talk.
a: In the cemetary. Duh.

q: Hi.
a: Hello.
a: Lo.
a: Ho.
}
q: Why did the gods become angry at Gilgamesh and Enkidu in the Epic of Gilgamesh?
a: Because they killed Humbaba and the Bull of Heaven
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
* Add answer key output
* Add fixed answer or question position, for example an "All of the above" option.