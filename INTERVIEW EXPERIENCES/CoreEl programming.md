1. Reverse a String

While this can be done by creating a new array, interviewers prefer an in-place solution to save memory.
C

#include <stdio.h>
#include <string.h>

void reverseString(char str[]) {
    int n = strlen(str);
    for (int i = 0; i < n / 2; i++) {
        // Swap characters using a temporary variable
        char temp = str[i];
        str[i] = str[n - i - 1];
        str[n - i - 1] = temp;
    }
}

int main() {
    char str[] = "CoreEL";
    reverseString(str);
    printf("Reversed String: %s", str); // Output: LEeroC
    return 0;
}

2. Swap the Nibbles of a Character

A "nibble" is 4 bits. Since a char is 8 bits (1 byte), swapping nibbles means moving the first 4 bits to the last 4 positions and vice versa.

Logic:

    Isolate the right nibble and shift it left by 4: (x & 0x0F) << 4

    Isolate the left nibble and shift it right by 4: (x & 0xF0) >> 4

    Combine them using the OR (|) operator.

C

#include <stdio.h>

unsigned char swapNibbles(unsigned char x) {
    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
}

int main() {
    unsigned char val = 0x64; // Binary: 0110 0100
    printf("Original: %02x, Swapped: %02x", val, swapNibbles(val)); 
    // Output: Original: 64, Swapped: 46 (Binary: 0100 0110)
    return 0;
}

3. Count the Number of 1s (Set Bits)

This is commonly known as finding the Hamming Weight. There are two popular ways to solve this:
Method A: Simple Bit Shift

Iterate through all bits and check if the last bit is 1.
C

int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        count += (n & 1); // Check last bit
        n >>= 1;          // Shift right
    }
    return count;
}

Method B: Brian Kernighan’s Algorithm (Optimized)

This is the "pro" way to do it. Instead of checking every bit, it only iterates as many times as there are set bits.
C

int countSetBitsOptimized(int n) {
    int count = 0;
    while (n > 0) {
        n &= (n - 1); // This operation clears the least significant set bit
        count++;
    }
    return count;
}

How to Crack the CoreEL Interview

    Explain the Logic First: Before writing code, explain the bitwise logic (ANDing with masks, shifting).

    Edge Cases: For string reversal, mention how you'd handle a null pointer or an empty string.

    Bitwise Mastery: Be ready for follow-up questions like "How do you check if the nth bit is set?" or "How do you toggle a specific bit?"