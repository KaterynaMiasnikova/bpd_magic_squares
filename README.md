### Simple encryption/decryption methods. Use of magic squares

A variation of the permutation method is the method based on the use of a magic square.

A magic square (MS) is a square table randomly filled with consecutive natural numbers from 1 to n2, where n is the size of the square.

The purpose of this work is to master the MK-based encryption/decryption method.

Theoretical provisions

The method of filling out the MS is as follows: the encrypted text fits into the magic squares in accordance with the certain numbering of their cells. If then write out the contents of such a table line by line, one will get a ciphertext formed by permuting the letters of the original message.

When the text of the message is chosen; renumber the characters of the text, including a space (use the _ symbol), with numbers from 1 to 2n. Divide the text into blocks of 2n characters each; each block corresponds to its own MS.

Enter the letters of the message in the cells of the table, the number of which coincides with the serial number of the letters.

After reading from the table of symbols from top to bottom, a ciphertext is formed from left to right.

Magic squares of medium and large sizes served as a good basis for meeting the encryption needs of that time, since it is practically impossible to perform a manual enumeration of all options for such a cipher.

The MS can be rotated by n multiples of 90 degrees clockwise or counterclockwise to complicate encryption.