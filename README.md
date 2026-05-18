# analyzer-test-java

Minimal Maven Java project for analyzer language-detection testing.

## Expected analyzer behavior

- **Primary language**: Java
- **Secondary/config**: XML, Markdown
- **Min source files detected**: 3
- **Key paths**: `src/main/java/`, `src/test/java/`, `pom.xml`, `config/app.xml`

## Run locally

```bash
mvn -q compile exec:java -Dexec.mainClass=com.analyzer.Main
```
