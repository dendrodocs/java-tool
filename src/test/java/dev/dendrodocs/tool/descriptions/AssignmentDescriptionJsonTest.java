package dev.dendrodocs.tool.descriptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class AssignmentDescriptionJsonTest {

  private final ObjectMapper mapper = new ObjectMapper();

  @Test
  void assignment_description_serializes_as_expected() throws IOException {
    String expected =
        """
          {
            "$type": "DendroDocs.AssignmentDescription, DendroDocs.Shared",
            "Left": "ringo",
            "Operator": "=",
            "Right": "george"
          }
        """;
    assertEquals(
        mapper.readTree(expected),
        mapper.valueToTree(new AssignmentDescription("ringo", "=", "george")));
  }
}
