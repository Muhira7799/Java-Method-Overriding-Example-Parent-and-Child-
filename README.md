# Java Method Overriding Example (Parent and Child)

A small Java program that demonstrates **method overriding**: a child class replaces a method it inherits from its parent.

## What It Demonstrates

```java
class Parent {
    void dance() {
        System.out.println("Parent can dance");
    }
}

public class Child extends Parent {
    @Override
    void dance() {
        System.out.println("Child can dance");
    }
}
```

`Child` extends `Parent` and provides its own version of `dance()`. The `@Override` annotation tells the compiler to check that the method really overrides one in the parent.

## How It Works

1. `main` creates a `Child` object.
2. Calling `c.dance()` runs the version in `Child`, not the one in `Parent`.

## Output

```
Child can dance
```

## Overriding vs Overloading

| | Overriding | Overloading |
|---|-----------|-------------|
| Where | Child class replaces a parent method | Same class, same method name |
| Signature | Same name and parameters | Different parameters |

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac Child.java
java Child
```

## Project Structure

```
.
├── Child.java
└── README.md
```

## Next Steps

- Call the parent version from the child with `super.dance()`
- Create a `Parent` variable that holds a `Child` object and observe which method runs
- Add a second child class with its own `dance()`
