# Java 'continue' Statement Bug

This repository demonstrates a potential issue when using Java's `continue` statement within loops.  The `continue` statement skips the rest of the current iteration and proceeds to the next.  While seemingly straightforward, it can lead to unexpected behavior if not handled precisely, especially in nested loops or complex conditional logic.  The example highlights a common oversight that can be easily addressed.

## Bug Description

The provided Java code uses a `while` loop and a `continue` statement to skip a particular iteration. While this works as intended in this simple case, this type of logic can be more difficult to debug and understand in complex applications and within nested loops where the correct incrementing of the counter is dependent on the continued execution of the loop body.  The bug is subtle and may not be immediately apparent to developers unfamiliar with the precise behavior of `continue` in Java. 

## Solution

The solution provides a slightly improved implementation that maintains clarity and avoids potential pitfalls associated with `continue` in more complex scenarios.