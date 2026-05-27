# kotlin-lang

Incremental lessons learning Kotlin.

## Prerequisites

- Kotlin compiler
- OpenJDK 26

### Install

- macOS (Homebrew):

        brew install kotlin openjdk@26

  `openjdk@26` is keg-only. Symlink so the system finds it:

        sudo ln -sfn /opt/homebrew/opt/openjdk@26/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-26.jdk

  And put it on `PATH`:

        echo 'export PATH="/opt/homebrew/opt/openjdk@26/bin:$PATH"' >> ~/.zshrc

- Linux / cross-platform (recommended): install [SDKMAN](https://sdkman.io/install), then `sdk install kotlin` and `sdk install java 26-open`

### Verify

    kotlinc -version && java --version

## Lessons

- [0001-hello-world](0001-hello-world/) — print "Hello, world!"
- [0002-variables-and-types](0002-variables-and-types/) — declare and print an int, float, string, and bool
- [0003-arithmetic-and-operators](0003-arithmetic-and-operators/) — sum, difference, product, quotient, modulo of two integers
- [0004-conditionals](0004-conditionals/) — compare to 10 and print less / equal / greater

## How to run

See each lesson's `README.md` for the exact command.
