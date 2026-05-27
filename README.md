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

## How to run

See each lesson's `README.md` for the exact command.
