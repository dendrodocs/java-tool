# DendroDocs Java Tool

[![Maven Central Version][MAVEN_BADGE]][MAVEN_FEED] [![Coverage Status][COVERALLS_BADGE]][COVERALLS_LINK]

**dev.dendrodocs.tool** is a command-line tool for analyzing Java projects and generating structured JSON output.
It forms an integral part of the DendroDocs ecosystem, providing an easy way to bridge the gap between your Java code and up-to-date, detailed documentation.

## Features

A command-line tool that analyzes Java projects and produces a JSON file that follows the schema defined in the [DendroDocs Schema](https://github.com/dendrodocs/schema) repository.

## Prerequisites

* JDK 21 or newer.

## Installation

To install **dev.dendrodocs.tool**, you can fetch it directly via Maven:

```bash
mvn dependency:get -Dartifact="dev.dendrodocs:tool:LATEST:jar"
```

This will download the tool and store it in your local Maven repository.

## Usage

Once installed, you can run the tool using the following command, in PowerShell:

```powershell
java -jar "$env:USERPROFILE\.m2\repository\dev\dendrodocs\tool\0.1.0\tool-0.1.0.jar" --project "G:\DendroDocs\java-tool\" --output "java-tool.json" --pretty
```

This command will analyze the Java project located at `G:\DendroDocs\java-tool\`, generate a pretty-printed JSON file named `java-tool.json`, and store it in the current directory.

### Viewing the Output

To quickly preview the first few lines of the generated JSON output, use the following PowerShell command:

```powershell
Get-Content -Path "java-tool.json" -Head 8
```

Output

```json
[ {
  "FullName" : "dev.dendrodocs.tool.descriptions.ForEachDescriptionJsonTest",
  "Fields" : [ {
    "Name" : "mapper",
    "Modifiers" : 132,
    "Type" : "com.fasterxml.jackson.databind.ObjectMapper",
    "Initializer" : "new ObjectMapper()"
  } ],
```

This JSON output contains detailed descriptions of your Java classes, including fields, methods, types, and modifiers.

## The DendroDocs Ecosystem

**dev.dendrodocs.tool** is part of the larger DendroDocs ecosystem.
Explore [DendroDocs](https://github.com/dendrodocs) to find more tools, libraries, and documentation resources that help you bridge the gap between your code and its documentation.

## Contributing

Contributions are welcome! Please feel free to create [issues](https://github.com/dendrodocs/java-tool/issues) or [pull requests](https://github.com/dendrodocs/java-tool/pulls).

## License

This project is licensed under the [MIT License](LICENSE).

[MAVEN_BADGE]: https://img.shields.io/maven-central/v/dev.dendrodocs/tool?style=plastic
[MAVEN_FEED]: https://central.sonatype.com/artifact/dev.dendrodocs/tool
[COVERALLS_BADGE]: https://coveralls.io/repos/github/dendrodocs/java-tool/badge.svg?branch=main
[COVERALLS_LINK]: https://coveralls.io/github/dendrodocs/java-tool?branch=main