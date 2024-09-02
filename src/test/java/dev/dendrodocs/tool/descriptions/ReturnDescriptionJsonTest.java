package dev.dendrodocs.tool.descriptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class ReturnDescriptionJsonTest {

  private final ObjectMapper mapper = new ObjectMapper();

  @Test
  void return_description_serializes_as_expected() throws IOException {
    String plain = """
        {
          "$type": "DendroDocs.ReturnDescription, DendroDocs.Shared",
          "Expression": ""
        }
        """;
    String value = """
        {
          "$type": "DendroDocs.ReturnDescription, DendroDocs.Shared",
          "Expression": "1"
        }
        """;

    assertEquals(mapper.readTree(plain), mapper.valueToTree(new ReturnDescription("")));
    assertEquals(mapper.readTree(value), mapper.valueToTree(new ReturnDescription("1")));
  }
}
