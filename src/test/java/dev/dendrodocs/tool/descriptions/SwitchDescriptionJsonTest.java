package dev.dendrodocs.tool.descriptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

class SwitchDescriptionJsonTest {

  private final ObjectMapper mapper = new ObjectMapper();

  @Test
  void switch_description_serializes_as_expected() throws IOException {
    String expected = """
        {
          "$type": "DendroDocs.Switch, DendroDocs.Shared",
          "Expression": "season",
          "Sections": [
            {
              "Labels": ["Spring"],
              "Statements": [{
                "$type": "DendroDocs.ReturnDescription, DendroDocs.Shared",
                "Expression": ""
              }]
            },
            {
              "Labels": ["Summer"]
            },
            {
              "Labels": ["default"],
              "Statements": [{
                "$type": "DendroDocs.ReturnDescription, DendroDocs.Shared",
                "Expression": ""
              }]
            }
          ]
        }
        """;

    assertEquals(
        mapper.readTree(expected),
        mapper.valueToTree(new SwitchDescription("season", List.of(
            new SwitchSection(List.of("Spring"), List.of(new ReturnDescription(""))),
            new SwitchSection(List.of("Summer"), List.of()),
            new SwitchSection(List.of("default"), List.of(new ReturnDescription("")))))));
  }
}
