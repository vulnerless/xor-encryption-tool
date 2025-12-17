# Simple XOR Encryption Tool

## Project Overview
The application is a text encryption tool that uses the **XOR Cipher** logic. It allows users to:
1.  Set a custom encryption key.
2.  Encrypt plain text into Hexadecimal format.
3.  Decrypt Hexadecimal strings back into plain text.

## Features
*   **Console User Interface:** Simple menu-driven navigation.
*   **Object-Oriented Design:**
    *   `Crypto` (Interface): Defines the contract for encryption/decryption.
    *   `MyCipher` (Abstract Class): Implements shared logic (Key management).
    *   `SimpleXor` (Concrete Class): Implements the specific XOR algorithm.
*   **Error Handling:** Basic exception handling for empty keys or invalid inputs.

## How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/vulnerless/xor-encryption-tool.git
    ```
2.  **Compile the source files:**
    ```bash
    javac *.java
    ```
3.  **Run the application:**
    ```bash
    java Main
    ```

## Usage Example
1.  Start the app.
2.  Select **Option 1** to set a key (e.g., "secret").
3.  Select **Option 2** and enter text (e.g., "Hello").
4.  Copy the Hex output.
5.  Select **Option 3** and paste the Hex output to retrieve original text.
