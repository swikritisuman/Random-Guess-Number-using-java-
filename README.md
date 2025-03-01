# Random-Guess-Number-using-java-
Here ,I am using java code to make a simple game of guessing random number .



📌 Overview
This project is a mini Java game where the program generates a random number between 0 and 99, and the user has to guess it. The program provides hints after each incorrect guess and continues until the correct number is found.

🛠️ How It Works
The program generates a random number between 0 and 99.
The user is prompted to enter a guess.
The program compares the guess with the random number and provides feedback:
If the guess is correct, the user wins, and the game ends.
If the guess is too high, the program prints "Your number is too large."
If the guess is too low, the program prints "Your number is too small."
The guessing continues in a loop until the user guesses the correct number.
The correct number is displayed at the end.
📜 Code Breakdown
1️⃣ Importing Required Libraries
The program uses Scanner for user input.
The Math.random() function generates a random number.
2️⃣ Generating a Random Number
int myNumber = (int) (Math.random() * 100);
This generates a number between 0 and 99.
3️⃣ Taking User Input
Scanner sc = new Scanner(System.in);
This creates an object to read user input.
4️⃣ Checking the User's Guess
The program runs a loop that keeps taking guesses until the correct number is guessed.
It checks whether the user's guess is:
Too high → "Your number is too large."
Too low → "Your number is too small."
Correct → "Wohooo... Correct number!"
5️⃣ Loop Execution
The loop (do-while) ensures the user can keep guessing until they get it right.
6️⃣ Closing the Scanner
sc.close();
This prevents memory leaks by closing the scanner after use.
▶️ How to Run the Program
🔹 Using Command Line
Compile the code:
javac guessnumber.java
Run the program:
java guessnumber
🔹 Using an IDE (VS Code, IntelliJ, Eclipse)
Open the .java file in your preferred IDE.
Click Run or execute the program via the terminal.
💡 Future Enhancements
✅ GUI Version using Java Swing or JavaFX.
✅ Web-based Version using HTML, CSS, JS, and Java Backend.
✅ Add a scoreboard to track attempts.
✅ Implement a difficulty level option.
📌 Technologies Used
Java (Core Java, Math Library)
Scanner Class for user input
📌 Author
👤 [Swikriti Suman
🔗 GitHub: https://github.com/swikritisuman
