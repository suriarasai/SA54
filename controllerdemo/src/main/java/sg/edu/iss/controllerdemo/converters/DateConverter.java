package sg.edu.iss.controllerdemo.converters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class DateConverter implements Converter<String, LocalDate> {
 @Override
 public LocalDate convert(String source) {
  if (source == null) {
   return null;
  }
  return LocalDate.parse(source, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
 }

}