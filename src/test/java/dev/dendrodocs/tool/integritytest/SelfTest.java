package dev.dendrodocs.tool.integritytest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dev.dendrodocs.tool.Main;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class SelfTest {

  @Test
  @SuppressWarnings("ResultOfMethodCallIgnored")
  void testMain() throws IOException {
    String outputJson = "parserTest.json";
    // returns absolute path to directory where the project is stored
    String projectRoot = System.getProperty("user.dir");
    String projectDirectory =
        projectRoot + File.separator + "src" + File.separator + "main" + File.separator + "java";
    String[] args = {"--output", outputJson, "--project", projectDirectory};
    Main.main(args);
    File outputFile = new File(outputJson);
    assertTrue(outputFile.exists());
    outputFile.delete();
    assertFalse(outputFile.exists());
  }
}
