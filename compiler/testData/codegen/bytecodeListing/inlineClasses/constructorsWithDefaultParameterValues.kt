// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND: JVM_IR

inline class Test(val x: Int = 0) {
    constructor(a: Int, b: Int, c: Int = 42) : this(a + b + c)
}