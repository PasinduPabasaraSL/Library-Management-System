<!DOCTYPE html>
<html lang="en">
    
<body>

<h1>📚 Library Management System (Java - Command Line)</h1>

<p>A simple and lightweight Library Management System developed in Java, designed to manage book inventory, including adding, updating, removing, displaying books, and searching by author. The system also incorporates a secure login mechanism to ensure only authorized users can access the features.</p>

<h2>🌟 Features</h2>
<ul>
    <li><strong>📖 Book Management:</strong> Add, update, remove, and display books.</li>
    <li><strong>🔎 Search by Author:</strong> Search books by author name.</li>
    <li><strong>🔐 Secure Login:</strong> Protect access with a simple login system (3 attempts allowed).</li>
    <li><strong>📝 Command-Line Interface:</strong> Perform all operations via an intuitive text-based interface.</li>
</ul>

<h2>🛠️ How to Install</h2>
<ol>
    <li><strong>Clone the repository:</strong></li>
    <pre><code>git clone https://github.com/your-username/library-management-system.git</code></pre>
    
    <li><strong>Navigate to the project directory:</strong></li>
    <pre><code>cd library-management-system</code></pre>
    
    <li><strong>Compile the Java files:</strong></li>
    <pre><code>javac *.java</code></pre>
    
    <li><strong>Run the application:</strong></li>
    <pre><code>java LibraryApp</code></pre>
</ol>

<h2>🚀 Usage</h2>
<p>Upon starting the application, you will be prompted to log in:</p>
<ul>
    <li><strong>Username:</strong> <code>admin</code></li>
    <li><strong>Password:</strong> <code>1234</code></li>
</ul>

<p>Once logged in, you can perform the following operations:</p>
<ol>
    <li><strong>Add Book:</strong> Add a new book by entering its ID, title, author, and year.</li>
    <li><strong>Update Book:</strong> Update existing book details by ID.</li>
    <li><strong>Remove Book:</strong> Remove a book from the library by its ID.</li>
    <li><strong>Display Books:</strong> View all books currently stored in the system.</li>
    <li><strong>Search by Author:</strong> Search for books by the author's name.</li>
    <li><strong>Exit:</strong> Exit the system.</li>
</ol>

<h3>Sample Interaction</h3>
<pre><code>Welcome to the Library Management System!

Enter Username: admin
Enter Password: 1234

Login successful!

1. Add Book
2. Update Book
3. Remove Book
4. Display Books
5. Search Books By Author
6. Exit

Choose an option: 1

Enter ID: 101
Enter title: Java Programming
Enter author: John Doe
Enter year: 2020
Book added successfully!
</code></pre>

<h2>📂 Project Structure</h2>
<ul>
    <li><strong>LibraryApp.java:</strong> Main class controlling the application workflow.</li>
    <li><strong>LibraryManager.java:</strong> Handles book operations like add, update, remove, and display.</li>
    <li><strong>Book.java:</strong> Defines the <code>Book</code> entity with attributes such as ID, title, author, and year.</li>
</ul>

<h2>🤝 Contributions</h2>
<p>Contributions are welcome! Feel free to fork the repository, submit issues, or create pull requests.</p>

<h2>📜 License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>
